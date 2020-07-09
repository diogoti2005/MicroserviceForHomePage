package com.sollar.home.controlers;

import com.sollar.home.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {
    private static final String template ="greeting";
    @RequestMapping(value="/greeting", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }
    @RequestMapping(value="/gg", method=RequestMethod.GET)
    public String ggForm(Model model) {
        model.addAttribute("gg", new Greeting());
        return "gg";
    }

    @RequestMapping(value="/gg", method=RequestMethod.POST)
    public String greetingSubmits(@ModelAttribute Greeting gg, Model model) {
        model.addAttribute("gg", gg);
        return "result";
    }

    @RequestMapping(value="/dd", method=RequestMethod.GET)
    public String ddForm(Model model) {
        model.addAttribute("dd", new Greeting());
        return "dd";
    }

    @RequestMapping(value="/dd", method=RequestMethod.POST)
    public String greetingSubmitss(@ModelAttribute Greeting dd, Model model) {
        model.addAttribute("dd", dd);
        return "result";
    }
}