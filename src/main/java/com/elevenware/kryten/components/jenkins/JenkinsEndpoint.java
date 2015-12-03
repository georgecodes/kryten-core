package com.elevenware.kryten.components.jenkins;

import org.apache.camel.Consumer;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;
import org.apache.camel.impl.ProcessorEndpoint;
import org.apache.camel.spi.UriEndpoint;

/**
 * Created by george on 03/12/2015.
 */
@UriEndpoint(scheme = "jenkins", title = "jenkins", syntax = "jenkins:job", producerOnly = true)
public class JenkinsEndpoint extends ProcessorEndpoint {

    @Override
    protected void doStart() throws Exception {
        setProcessor(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                System.out.println("Sending to jenkins");
            }
        });
    }

    @Override
    protected String createEndpointUri() {
        return "jenkins:l";
    }
}
