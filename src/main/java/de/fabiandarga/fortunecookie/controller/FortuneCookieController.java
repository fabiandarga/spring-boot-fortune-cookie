package de.fabiandarga.fortunecookie.controller;

import de.fabiandarga.fortunecookie.service.FortuneCookieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FortuneCookieController {

    @Autowired
    private FortuneCookieService fortuneCookieService;

    @GetMapping
    public String showFortune(Model model) {
        String fortune = fortuneCookieService.getRandomFortune();
        model.addAttribute("fortune", fortune);
        return "index";
    }
}
