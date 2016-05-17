package com.elevenware.kryten.components.jira;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.impl.ProcessorEndpoint;
import org.apache.camel.spi.UriEndpoint;

@UriEndpoint(scheme = "jira", title = "jira", syntax = "jira", producerOnly = true)
public class JiraEndpoint extends ProcessorEndpoint {

    @Override
    protected void doStart() throws Exception {
        setProcessor(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                System.out.println("Sending to jira");
            }
        });
    }

    @Override
    protected String createEndpointUri() {
        return "jira:l";
    }
}