package org.examle.com.expl;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

    @Controller
    public class GreetingController {

        @GetMapping("/")
        public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
            model.addAttribute("name", name);
                       return "greeting";
        }

        @GetMapping("/12")
        public String greeting2(Model a) {
            a.addAttribute("txt", "WEEQWEQWE");
            a.addAttribute("txt2", "tytryrtyrt");
            a.addAttribute("txt3", "5434534534");
            return "greeting";
        }

    }

