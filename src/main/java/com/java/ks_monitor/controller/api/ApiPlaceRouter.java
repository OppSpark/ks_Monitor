package com.java.ks_monitor.controller.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import javax.xml.xpath.XPath;
import java.util.List;

import static org.springframework.web.servlet.function.RequestPredicates.path;
import static org.springframework.web.servlet.function.RouterFunctions.route;

@Configuration
public class ApiPlaceRouter {

    @Bean
    public RouterFunction<ServerResponse> placeRouter(){
        return route().nest(path("/api/"), builder ->  builder
                .GET("/places", req ->
                        ServerResponse.ok().body(List.of("place1", "place2")))
                .POST("/places", req ->
                        ServerResponse.ok().body(true))
                .GET("/places/{placeId}", req ->
                        ServerResponse.ok().body("event" + req.pathVariable("placeId")))
                .PUT("/places/{placeId}", req ->
                        ServerResponse.ok().body(true))
                .PUT("/places/{placeId}", req ->
                        ServerResponse.ok().body(true))
        ).build();
    }
}
