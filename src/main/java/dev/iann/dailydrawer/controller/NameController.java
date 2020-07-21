package dev.iann.dailydrawer.controller;

import dev.iann.dailydrawer.services.DrawName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/draw")
public class NameController {

    @GetMapping
    public String drawName() {
        DrawName drawName = new DrawName();

        return "The name drawn is " + drawName.execute();
    }
}
