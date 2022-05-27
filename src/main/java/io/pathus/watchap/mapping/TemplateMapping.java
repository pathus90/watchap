package io.pathus.watchap.mapping;

import io.pathus.watchap.common.MessageType;
import io.pathus.watchap.message.template.*;
import io.pathus.watchap.message.template.parameter.TextParameter;

import java.util.List;

public final class TemplateMapping {

    private TemplateMapping() {}

    public static TemplateMessage populateTemplateMessage(String recipientId, String name, String code, String componentType, String parameterType, String text) {
        return TemplateMessage.builder()
            .to(recipientId)
            .type(MessageType.TEMPLATE.toString())
            .template(populateTemplate(name, code, componentType, parameterType, text))
            .build();
    }

    public static Template populateTemplate(String name, String code, String componentType, String parameterType, String text) {
        return Template.builder().name(name)
            .language(populateLanguage(code))
            .components(populateComponents(componentType, parameterType, text))
            .build();
    }

    private static Language populateLanguage(String code) {
        return Language.builder()
            .code(code)
            .build();
    }

    private static List<Component> populateComponents(String componentType, String parameterType, String text) {
       return List.of(Component.builder()
            .type(componentType)
            .parameters(populateParameters(parameterType, text))
            .build());
    }

    private static List<Parameter> populateParameters(String type, String text) {
        return List.of(TextParameter.builder()
            .type(type)
            .text(text)
            .build());
    }


}
