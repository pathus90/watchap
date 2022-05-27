package io.pathus.watchap.mapping;

import io.pathus.watchap.common.MessageType;
import io.pathus.watchap.message.location.Location;
import io.pathus.watchap.message.location.LocationMessage;

public final class LocationMapping {
    private LocationMapping(){}

    public static LocationMessage populateLocationMessage(String recipientId, double latitude, double longitude, String name, String address) {
        return LocationMessage
            .builder()
            .to(recipientId)
            .type(MessageType.LOCATION.toString())
            .location(populateLocation(latitude, longitude, name, address))
            .build();
    }

    public static LocationMessage populateLocationMessage(String recipientId, Location location) {
        return populateLocationMessage(recipientId, location.getLatitude(),
            location.getLongitude(), location.getName(), location.getAddress());
    }

    private static Location populateLocation(double latitude, double longitude, String name, String address) {
        return Location.
            builder()
            .latitude(latitude)
            .longitude(longitude)
            .name(name)
            .address(address)
            .build();
    }
}
