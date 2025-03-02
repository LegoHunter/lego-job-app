package net.legohunter.sandbox;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

@Slf4j
public class BricklinkOrderCommand implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("Running BricklinkOrderCommand with args: {}", Arrays.asList(args));
    }
}
