package io.pathus.watchap.message.location;


import io.pathus.watchap.common.BaseMessage;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class LocationMessage extends BaseMessage {
    private Location location;
}
