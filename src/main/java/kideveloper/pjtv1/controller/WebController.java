package kideveloper.pjtv1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value = "/")
    public String main(Model model) {
        model.addAttribute("template", "fragments/content/main");
        return "index";
    }
}
