package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FuncController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from demo Server!";
    }

}
