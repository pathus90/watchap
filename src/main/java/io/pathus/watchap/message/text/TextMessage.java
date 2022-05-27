package io.pathus.watchap.message.text;

import io.pathus.watchap.common.BaseMessage;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class TextMessage extends BaseMessage {
    private Text text;

}
