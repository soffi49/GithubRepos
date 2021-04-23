package com.project.githubrepos.controller;

import com.project.githubrepos.reposinfo.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.io.IOException;

@RestController
@Validated
public class Controller {
    private static final String regex="^([a-zA-Z0-9])([a-zA-Z0-9-])*([a-zA-Z0-9]$)";

    @RequestMapping(value = "/repos",method = RequestMethod.GET)
    public User getName(@RequestParam(value="name",defaultValue = "allegro") @Pattern(regexp = regex) String name)
            throws IOException
    {
        User user=new User();
        user.saveRepos(name);
        return user;
    }

    @RequestMapping(value = "/repos",method = RequestMethod.POST)
    public User postData(@Valid @RequestBody User u)
    {
        return u;
    }

}
