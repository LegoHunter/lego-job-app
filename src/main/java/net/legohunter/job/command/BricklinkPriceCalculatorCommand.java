package net.legohunter.job.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

@Slf4j
public class BricklinkPriceCalculatorCommand implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("Running Bricklink Price Calculator Command with args: {}", Arrays.asList(args));
    }
}
