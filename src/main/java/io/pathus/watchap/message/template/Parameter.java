package io.pathus.watchap.message.template;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@SuperBuilder
@Getter
@Setter
@JsonInclude(NON_NULL)
public class Parameter {
    private String type;
}
