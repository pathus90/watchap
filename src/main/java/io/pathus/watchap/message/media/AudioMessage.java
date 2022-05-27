package io.pathus.watchap.message.media;

import io.pathus.watchap.common.BaseMessage;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class AudioMessage extends BaseMessage {
    private Media audio;
}
