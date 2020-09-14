package org.examle.com.expl;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
    public class GreetingController {


    @GetMapping("/")
        public String greeting(@RequestParam (required = false) String id, Model a) {
          if (id==null)id="123";
           a.addAttribute("text", Creator1.creat(id));
                       return "test";
        }

        @GetMapping("/12")

        public String greeting2(@RequestParam List<Integer> id, Model a) {

            a.addAttribute("txt", id.get(0));
            a.addAttribute("txt1", id.get(1));
            new Calendar();
            String [] mons=Calendar.print(id.get(0),id.get(1));
            a.addAttribute("txt2", Calendar.Frst);
            a.addAttribute("txc1", mons[0]);
            a.addAttribute("txc2", mons[1]);
            a.addAttribute("txc3", mons[2]);
            a.addAttribute("txc4", mons[3]);
            a.addAttribute("txc5", mons[4]);
            a.addAttribute("txc6", mons[5]);
            a.addAttribute("txc7", mons[6]);

            return "greeting";
        }

    }


