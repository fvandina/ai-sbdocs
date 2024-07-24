package dev.lguzman.sbdocs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;


@ImportRuntimeHints(HintsRegistrar.class)
@SpringBootApplication()
public class SbdocsApplication {
    private static final Logger log = LoggerFactory.getLogger(SbdocsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SbdocsApplication.class, args);
    }


}
