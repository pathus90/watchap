package io.pathus.watchap.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Locale;

@RequiredArgsConstructor
@Getter
public enum ParameterType {
    TEXT,
    IMAGE,
    AUDIO,
    VIDEO,
    DOCUMENT;

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
