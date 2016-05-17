package com.elevenware.kryten.components.github;

import org.apache.camel.Endpoint;
import org.apache.camel.impl.UriEndpointComponent;

import java.util.Map;

public class GithubComponent extends UriEndpointComponent {
    public GithubComponent() {
        super(GithubEndpoint.class);
    }

    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        return new GithubEndpoint();
    }
}
