package com.project.githubrepos.reposinfo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@JsonDeserialize(using = ReposDeserialize.class)
public class RepositoryGithub {

    private String name;
    private  int stars;

    public RepositoryGithub(String n, int s)
    {
        this.name=n;
        this.stars=s;
    }

    public int getStars() {
        return stars;
    }

    public String getName() {
        return name;
    }
}
