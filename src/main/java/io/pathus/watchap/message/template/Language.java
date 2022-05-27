package io.pathus.watchap.message.template;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Language {
    private String policy;
    private String code;
}
