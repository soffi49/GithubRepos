package com.project.githubrepos.controller;

import com.project.githubrepos.reposinfo.RepositoryGithub;
import com.project.githubrepos.reposinfo.User;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.io.IOException;

@RestController
public class Controller {

    @RequestMapping(value = "/repos",method = RequestMethod.GET)
    public User getName(@RequestParam(value="name",defaultValue = "allegro") String name) throws IOException
    {
        User user=new User();
        user.saveRepos(name);
        return user;
    }

    @RequestMapping(value = "/repos",method = RequestMethod.POST)
    public User postData(@RequestBody User u)
    {
        return u;
    }
}
