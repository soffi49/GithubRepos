package com.project.githubrepos.reposinfo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;


import java.io.IOException;

public class ReposDeserialize extends StdDeserializer<RepositoryGithub> {

    public ReposDeserialize()
    {
        this(null);
    }

    public ReposDeserialize(Class<?> cl)
    {
        super((cl));
    }

    @Override
    public RepositoryGithub deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException
    {
        JsonNode jsnode=jsonParser.getCodec().readTree(jsonParser);
        int stars=(jsnode.get("stargazers_count").asInt());
        String name=(jsnode.get("name").asText());
        return new RepositoryGithub(name,stars);
    }
}
