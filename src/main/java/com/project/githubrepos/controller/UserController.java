package com.project.githubrepos.controller;

import com.project.githubrepos.reposinfo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.io.IOException;

@Controller
public class UserController{

    @RequestMapping(value="/",method = RequestMethod.GET)
    public ModelAndView provideUser()
    {
        return new ModelAndView("getUser","user",new User());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String printRepos(@Valid @ModelAttribute("user") User user, BindingResult bin) throws IOException
    {
        if(!bin.hasErrors())
        {
            user.saveRepos(user.getName());
        }
        return "getUser";
    }

}
