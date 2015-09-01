package demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRestController {

	@RequestMapping("/")
    public String index() {
        return "Greetings from IJug !";
    }

}
