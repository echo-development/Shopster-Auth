package dk.echodevelopment.Auth.Endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldEndpoint {

    @GetMapping()
    String getHello() {
        return "Hello!";
    }
}
