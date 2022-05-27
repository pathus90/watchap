package io.pathus.watchap;

import io.pathus.watchap.common.ComponentType;
import io.pathus.watchap.common.HttpResponse;
import io.pathus.watchap.common.ParameterType;
import lombok.SneakyThrows;

public class WatchapApplication {

	@SneakyThrows
    public static void main(String[] args) {
        final String token = "EAAKlEParSZCEBACV7lBOyzPjZCCl1wvRBLrwaZClum3QTcnkZBjuz7PolNQbgcZC2tSILqOHFLRnJj4cAWZAq5FLEcb37m3kSyMhko13WDuxeJOt1SUdJSJgLZAjkZA4v8VEeEbzckIEUHq8QZCjm9AQ4ZCLTClwQZAsoGZAecPac0gcJj21eq5ole0vOFHMtVudDn5BI05rFO1jfTHsNTZAW8aXJ";
        final String phoneNumberId = "101579569241059";


        Watchap watchap = new Watchap(token, phoneNumberId);
       HttpResponse<?> response = watchap.sendTemplate("33663640654", "sample_shipping_confirmation", "en_US",
            ComponentType.BODY.toString(), ParameterType.TEXT.toString(), "10");
        System.out.println(response.getData());


	}
}
