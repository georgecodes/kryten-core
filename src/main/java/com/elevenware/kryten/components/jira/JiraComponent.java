package com.elevenware.kryten.components.jira;

import com.elevenware.kryten.components.github.GithubEndpoint;
import org.apache.camel.Endpoint;
import org.apache.camel.impl.UriEndpointComponent;

import java.util.Map;

public class JiraComponent extends UriEndpointComponent {
    public JiraComponent() {
        super(JiraEndpoint.class);
    }

    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        return new JiraEndpoint();
    }
}
