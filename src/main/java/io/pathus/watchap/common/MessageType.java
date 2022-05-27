package io.pathus.watchap.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Locale;

@RequiredArgsConstructor
@Getter
public enum MessageType {
    TEXT,
    TEMPLATE,
    LOCATION,
    IMAGE,
    AUDIO,
    VIDEO,
    DOCUMENT,
    STICKER;

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
