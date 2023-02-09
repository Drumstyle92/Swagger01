package it.develhope.Swagger01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Drumstyle92
 * Default class controller
 */
@RestController
public class DefaultController {
    /**
     * @return Returns a welcome string
     * Method get that as a response from a nice welcome message.
     */
    @GetMapping("")
    public String getHello(){

        return "Welcome visitor!";

    }
}
