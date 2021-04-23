package com.project.githubrepos.reposinfo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.validation.constraints.Pattern;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class User {
    @Pattern(regexp = "^([a-zA-Z0-9])([a-zA-Z0-9-])*([a-zA-Z0-9]$)")
    private String name;
    private List<RepositoryGithub> repos;

    public User()
    {
        this.name="";
        this.repos=new ArrayList<>();
    }

    public List<RepositoryGithub> getRepos()
    {
        return repos;
    }

    public void saveRepos(String name) throws IOException
    {
        this.name=name;
        System.out.println(this.name);
        String json="https://api.github.com/users/"+name+"/repos";
        URL url=new URL(json);
        this.repos=new ObjectMapper().readValue(url, new TypeReference<>(){});
    }

}
