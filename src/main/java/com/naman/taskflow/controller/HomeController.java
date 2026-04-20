package com.naman.taskflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HomeController redirects the root URL (/) to Swagger UI.
 * This provides a much better user experience than a "Not Found" page.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectToSwagger() {
        return "redirect:/swagger-ui.html";
    }
}
