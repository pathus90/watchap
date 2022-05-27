package io.pathus.watchap.message.template.parameter;

import io.pathus.watchap.message.template.Parameter;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class TextParameter extends Parameter {
    private String text;
}
