package io.pathus.watchap.common;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.pathus.watchap.util.HttpClient;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@SuperBuilder
@Getter
@Setter
@JsonInclude(NON_NULL)
public class BaseMessage implements Notification {
    @JsonProperty("messaging_product")
    private String messagingProduct;
    private String to;
    private String type;
    @JsonProperty("recipient_type")
    private String recipientType;

    @Override
    public HttpResponse<?> sendMessage(String token, String phoneNumberId) {
        return HttpClient.sendMessage(this, token, phoneNumberId);
    }
}
