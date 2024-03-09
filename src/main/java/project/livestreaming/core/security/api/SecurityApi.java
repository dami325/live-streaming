package project.livestreaming.core.security.api;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityApi {

    @GetMapping("/")
    public Authentication index(Authentication authentication) {
        return authentication;
    }
}
