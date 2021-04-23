package com.project.githubrepos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.githubrepos.reposinfo.RepositoryGithub;
import com.project.githubrepos.reposinfo.User;
import netscape.javascript.JSObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@SpringBootApplication
public class GithubreposApplication {
	private static final String json="https://api.github.com/users/soffi49/repos";

	public static void main(String[] args) throws IOException {
		SpringApplication.run(GithubreposApplication.class, args);
		List<RepositoryGithub> repos=new ObjectMapper().readValue(new URL(json), new TypeReference<List<RepositoryGithub>>(){});
		User u=new User();
		u.saveRepos("soffi49");

		for(RepositoryGithub el : repos)
		{
			System.out.println(el.getName()+" "+el.getStars());
		}
	}

}
