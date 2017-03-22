package com.myController;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class HelloController{

    @RequestMapping(value = "/p1", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
      System.out.print("---------------here----------------");
        model.addAttribute("msg", "Spring MVC Hello World");
       model.addAttribute("name", "yuntao");
        System.out.print("---------------here  ggg----------------");
        return "hellojsp";//转向hellojsp.jsp
    }

    @RequestMapping (value = "/p2", method = RequestMethod.GET)
    public ModelAndView showView() {
        ModelAndView modelAndView = new ModelAndView("hellojsp");
        modelAndView.addObject("msg", "Hello World MVC!");
        modelAndView.addObject("name", "yuntao" );
        return modelAndView;
    }
}