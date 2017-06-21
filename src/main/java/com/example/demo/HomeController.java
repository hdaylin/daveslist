package com.example.demo;

import com.example.demo.Model.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by student on 6/21/17.
 */

    @Controller
    public class HomeController{

        @RequestMapping("/")
        public String index(){
            return "index";
        }

        @GetMapping ("/")
        public String itemform(Model model){
            model.addAttribute("item", new Items());
            return "index";
        }

        @PostMapping("/result")
        public String itemsSubmit(@ModelAttribute Items item){
            return "result";
        }




}
