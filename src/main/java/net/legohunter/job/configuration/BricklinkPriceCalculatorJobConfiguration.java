package net.legohunter.job.configuration;

import net.legohunter.job.command.BricklinkPriceCalculatorCommand;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("bricklink-price-calculator-job")
public class BricklinkPriceCalculatorJobConfiguration {
    @Bean
    public BricklinkPriceCalculatorCommand bricklinkPriceCalculatorCommand() {
        return new BricklinkPriceCalculatorCommand();
    }
}
