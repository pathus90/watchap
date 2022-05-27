package io.pathus.watchap.common;

public interface Notification {

    HttpResponse<?> sendMessage(String token, String phoneNumberId);
}
