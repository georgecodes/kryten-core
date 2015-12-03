package com.elevenware.kryten.components.github;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.impl.ProcessorEndpoint;
import org.apache.camel.spi.UriEndpoint;

@UriEndpoint(scheme = "github", title = "github", syntax = "github:job", producerOnly = true)
public class GithubEndpoint extends ProcessorEndpoint {

    @Override
    protected void doStart() throws Exception {
        setProcessor(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                System.out.println("Sending to github");
            }
        });
    }

    @Override
    protected String createEndpointUri() {
        return "github:l";
    }
}
