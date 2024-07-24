package dev.lguzman.sbdocs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lguzman
 * @version 1.0
 * @since 24/07/2024
 */
@RestController
@RequestMapping("/assistant")
public class SpringAssistantController {
    private final SpringAssistantService springAssistantService;

    public SpringAssistantController(SpringAssistantService springAssistantService) {
        this.springAssistantService = springAssistantService;
    }
    @GetMapping
    public String getAssistant(
            @RequestParam(value = "message", defaultValue = "What is Spring Boot?") String message
    ) {
        return springAssistantService.question(message);
    }
}
