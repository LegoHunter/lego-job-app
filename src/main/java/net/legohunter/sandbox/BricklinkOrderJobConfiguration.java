package net.legohunter.sandbox;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("bricklink-order-job")
public class BricklinkOrderJobConfiguration {
    @Bean
    public BricklinkOrderCommand bricklinkOrderCommand() {
        return new BricklinkOrderCommand();
    }
}
