package io.pathus.watchap.message.template;

import io.pathus.watchap.common.BaseMessage;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class TemplateMessage extends BaseMessage {
    private Template template;

}
