package yunjae.spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by USER on 2017-08-18.
 */
@RestController
public class SimpleController {
    @GetMapping("/")
    public String index() {
        return "Hello";
    }


}
