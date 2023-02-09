package it.develhope.Swagger01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Drumstyle92
 * Controller class with an information get method
 */
@RestController
public class NameController {
    /**
     * @return Return my name
     * method with a separate path that returns the set string as response
     */
    @GetMapping("/name")
    public String getName(){

        return "Dino";

    }

}
