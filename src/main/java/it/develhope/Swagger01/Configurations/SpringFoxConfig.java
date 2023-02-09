package it.develhope.Swagger01.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 * @author Drumstyle92
 * Class that contains the Swagger configuration
 */
@Configuration
public class SpringFoxConfig {
    /**
     * @return It returns various characteristics that we have entered and that we will display through the Swagger
     * Method with a Bean component that contains all the various configuration possibilities of the Swagger
     */
    @Bean
    public Docket api() {

        ApiInfo apiInfo = new ApiInfo(
                "First Swagger project for Spring Boot",
                "An example for showing how to document an API",
                "3.0.0",
                "https://en.wikipedia.org/wiki/MIT_License",
                new Contact("Dino", "https://develhope.it", "Drumstyle@develhope.it"),
                "MIT",
                "https://en.wikipedia.org/wiki/MIT_License",
                Collections.emptyList()
        );

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo)
                .tags(
                        new Tag("name-controller", "The name controller")
                )
                ;
    }

}

