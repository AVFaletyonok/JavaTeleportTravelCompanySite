package com.faletyonok.teleport.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author Alexander Victorovich Faletyonok
 * @version 1.0
 * <p>
 *     Test web application "Java Teleport Travel Company"
 * </p>
 * https://github.com/AVFaletyonok/JavaTeleportTravelCompanySite
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .servers(
                        List.of(
                                new Server().url("http://localhost:8080")))
                .info(
                        new Info().title("Our clients API")
                );
    }
}
