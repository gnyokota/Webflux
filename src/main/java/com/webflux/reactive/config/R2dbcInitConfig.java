package com.webflux.reactive.config;

import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

@Configuration
public class R2dbcInitConfig {
    @Bean
    public ConnectionFactoryInitializer initializer(ConnectionFactory cf) {
        ConnectionFactoryInitializer i = new ConnectionFactoryInitializer();
        i.setConnectionFactory(cf);
        i.setDatabasePopulator(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));
        return i;
    }
}
