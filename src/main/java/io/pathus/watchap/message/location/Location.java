package io.pathus.watchap.message.location;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@SuperBuilder
@Getter
@Setter
@JsonInclude(NON_NULL)
public class Location {
    private double latitude;
    private double longitude;
    private String name;
    private String address;
}
