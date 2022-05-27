package io.pathus.watchap.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.pathus.watchap.common.BaseMessage;
import io.pathus.watchap.common.HttpRequest;
import io.pathus.watchap.common.HttpResponse;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.OkHttpClient;
import okhttp3.Headers;
import okhttp3.RequestBody;
import okhttp3.MediaType;

import java.util.Locale;
import java.util.Objects;

public final class HttpClient {

    private static final String CONTENT_TYPE = "application/json";
    private static final String AUTHORIZATION = "AUTHORIZATION";
    private static final String BEARER = "Bearer ";
    private static final String URI = "https://graph.facebook.com/v13.0/";

    private HttpClient() {
    }

    private static HttpResponse<?> sendPostRequest(HttpRequest request) {
        HttpResponse<?> response;
        try {
            Request postRequest = new Request.Builder()
                .headers(request.getHeaders())
                .post(request.getBody())
                .url(request.getEndpoint())
                .build();
            Response result = new OkHttpClient().newCall(postRequest).execute();
            response = HttpResponse.builder().status(result.code()).data(Objects.requireNonNull(result.body()).string())
                .build();
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        return response;
    }

    private static String getEndPoint(String phoneNumberId) {
        return String.format(URI.concat(String.format("%s/messages", phoneNumberId)), phoneNumberId);
    }

    private static HttpRequest createHttpRequest(String token, String endpoint, Object request) {
        Headers headers = new Headers.Builder().add(AUTHORIZATION.toLowerCase(Locale.ROOT), BEARER.concat(token))
            .build();
        RequestBody body = null;
        try {
            body = RequestBody.create(MediaType.get(CONTENT_TYPE), JsonUtils.getJsonStringFromObject(request));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new HttpRequest(endpoint, headers, body);
    }

    public static HttpResponse<?> sendMessage(BaseMessage message, String token, String phoneNumberId) {
        final String endPoint = getEndPoint(phoneNumberId);
        final HttpRequest httpRequest = createHttpRequest(token, endPoint, message);
        return sendPostRequest(httpRequest);
    }
}
