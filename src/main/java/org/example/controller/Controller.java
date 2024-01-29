package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping("/milad")
public class Controller {
  @GetMapping("/api")
  public String getMilad(){
      System.out.println("hello milad....");
      return "milad";
  }

  @RequestMapping(value = "/tehranPage",method = RequestMethod.GET)
    public ModelAndView tehranPage(){
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("tehranPage");
      modelAndView.addObject("tehrancity","I am from Tehran Page");
      System.out.println("tehran page run");
      return modelAndView;
  }
    @RequestMapping(value = "/shirazPage",method = RequestMethod.GET)
    public ModelAndView shirazPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("shirazPage");

        modelAndView.addObject("tehrancity","I am from Shiraz Page");
        System.out.println("shiraz page run");
        return modelAndView;
    }


}
