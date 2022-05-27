package io.pathus.watchap.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import okhttp3.Headers;
import okhttp3.RequestBody;

@Data
@AllArgsConstructor
public class HttpRequest {
    private String endpoint;
    private Headers headers;
    private RequestBody body;
}
