package com.springframework.JokesApp.controller;


import com.springframework.JokesApp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping("/")
    public String joke(Model model){
         String joke= jokeService.joke();
         model.addAttribute("joke",joke);
         return "index";
    }
}
