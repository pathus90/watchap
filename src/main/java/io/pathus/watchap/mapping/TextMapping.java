package io.pathus.watchap.mapping;

import io.pathus.watchap.common.MessageType;
import io.pathus.watchap.message.text.Text;
import io.pathus.watchap.message.text.TextMessage;

public final class TextMapping {
    private TextMapping(){}

    public static TextMessage populateTextMapping(String recipientId, String body, boolean previewUrl){
        return TextMessage.builder()
            .type(MessageType.TEXT.toString())
            .to(recipientId)
            .text(Text.builder().previewUrl(previewUrl).body(body).build())
            .build();
    }
}
