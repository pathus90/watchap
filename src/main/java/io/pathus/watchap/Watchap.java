package io.pathus.watchap;

import io.pathus.watchap.common.BaseMessage;
import io.pathus.watchap.common.HttpResponse;
import io.pathus.watchap.mapping.MediaMapping;
import io.pathus.watchap.mapping.LocationMapping;
import io.pathus.watchap.mapping.TemplateMapping;
import io.pathus.watchap.mapping.TextMapping;
import io.pathus.watchap.message.location.Location;
import io.pathus.watchap.message.media.*;
import io.pathus.watchap.message.location.LocationMessage;
import io.pathus.watchap.message.template.TemplateMessage;
import io.pathus.watchap.message.text.TextMessage;
import lombok.RequiredArgsConstructor;

import java.io.IOException;

@RequiredArgsConstructor
public class Watchap {
    private static final String WHATSAPP_PRODUCT = "whatsapp";
    private static final String INDIVIDUAL = "individual";

    private final String token;
    private final String phoneNumberId;

    private HttpResponse<?> sendMessage(BaseMessage baseMessage) {
        baseMessage.setMessagingProduct(WHATSAPP_PRODUCT);
        baseMessage.setRecipientType(INDIVIDUAL);
        return baseMessage.sendMessage(token, phoneNumberId);
    }

    public HttpResponse<?> sendMessage(String recipientId, String body, boolean previewUrl) {
        TextMessage message = TextMapping.populateTextMapping(recipientId, body, previewUrl);
        return sendMessage(message);
    }

    public HttpResponse<?> sendTemplate(String recipientId, String body, String code, String componentType, String parameterType, String text) throws IOException {
        TemplateMessage message = TemplateMapping.populateTemplateMessage(recipientId, body, code, componentType, parameterType, text);
        return sendMessage(message);
    }

    public HttpResponse<?> sendLocation(String recipientId, double latitude, double longitude, String name, String address) throws IOException {
        LocationMessage message = LocationMapping.populateLocationMessage(recipientId, latitude, longitude, name, address);
        return sendMessage(message);
    }

    public HttpResponse<?> sendLocation(String recipientId, Location location) {
        LocationMessage message = LocationMapping.populateLocationMessage(recipientId, location);
        return sendMessage(message);
    }

    public HttpResponse<?> sendImage(String recipientId, String value, boolean isLink) {
        ImageMessage message = MediaMapping.populateImageMessage(recipientId, value, isLink);
        return sendMessage(message);
    }

    private HttpResponse<?> sendAudio(String recipientId, String value, boolean isLink) {
        AudioMessage message = MediaMapping.populateAudioMessage(recipientId, value, isLink);
        return sendMessage(message);
    }

    public HttpResponse<?> sendVideo(String recipientId, String value, boolean isLink) {
        VideoMessage message = MediaMapping.populateVideoMessage(recipientId, value, isLink);
        return sendMessage(message);
    }

    public HttpResponse<?> sendDocument(String recipientId, String value, boolean isLink) {
        DocumentMessage message = MediaMapping.populateDocumentMessage(recipientId, value, isLink);
        return sendMessage(message);
    }

    public HttpResponse<?> sendSticker(String recipientId, String value, boolean isLink) {
        StickerMessage message = MediaMapping.populateStickerMessage(recipientId, value, isLink);
        return sendMessage(message);
    }
}

