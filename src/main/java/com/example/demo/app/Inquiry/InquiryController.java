package com.example.demo.app.Inquiry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inquiry")
public class InquiryController {

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("title","i form");
        return "inquiry/form";
    }
}
