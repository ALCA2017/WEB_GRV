package com.grv.spring.security.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.grv.spring.security.model.AreasAcademicas;
 
@Controller
public class MainController {
 
   @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
   public String welcomePage(Model model) {
       model.addAttribute("title", "Welcome");
       model.addAttribute("message", "This is welcome page!");
       return "welcomePage";
   }
 
   @RequestMapping(value = "/admin", method = RequestMethod.GET)
   public String adminPage(Model model) {
       return "adminPage";
   }
 
   @RequestMapping(value = "/login", method = RequestMethod.GET)
   public String loginPage(Model model ) {
       return "loginPage";
   }
 
   @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
   public String logoutSuccessfulPage(Model model) {
       model.addAttribute("title", "Logout");
       // return "logoutSuccessfulPage";
       return "loginPage";
   }
 
   @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
   public String userInfo(Model model, Principal principal) {
 
       // After user login successfully.
       String userName = principal.getName();
 
       System.out.println("User Name: "+ userName);
 
       return "userInfoPage";
   }
   
   @RequestMapping(value = "/home", method = RequestMethod.GET)
   public String home(Model model, Principal principal) {
 
       // After user login successfully.
       String userName = principal.getName();
 
       System.out.println("User Name: "+ userName);
 
       return "homePage";
   }   
 
   @RequestMapping(value = "/403", method = RequestMethod.GET)
   public String accessDenied(Model model, Principal principal) {
        
       if (principal != null) {
           model.addAttribute("message", "Hi " + principal.getName()
                   + "<br> Usted no tiene permiso para acceder a esta página!");
       } else {
           model.addAttribute("msg",
                   "Usted no tiene permiso para acceder a esta página!");
       }
       return "403Page";
   }
   
   @RequestMapping(value = "/verPdf", method = RequestMethod.GET)
   public String verPdf(Model model, Principal principal) {
 
       // After user login successfully.
       String userName = principal.getName();
 
       System.out.println("User Name: "+ userName);
 
       return "pdfPage";
   }   
   

   
  
}
