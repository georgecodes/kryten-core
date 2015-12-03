package com.elevenware.kryten.components.jenkins;

import org.apache.camel.Endpoint;
import org.apache.camel.impl.UriEndpointComponent;

import java.util.Map;

/**
 * Created by george on 03/12/2015.
 */
public class JenkinsComponent extends UriEndpointComponent {

    public JenkinsComponent() {
        super(JenkinsEndpoint.class);
    }

    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        return new JenkinsEndpoint();
    }
}
