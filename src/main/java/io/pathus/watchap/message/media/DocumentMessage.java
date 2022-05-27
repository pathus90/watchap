package io.pathus.watchap.message.media;

import io.pathus.watchap.common.BaseMessage;
import io.pathus.watchap.message.media.Media;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class DocumentMessage extends BaseMessage {
    private Media document;
}
