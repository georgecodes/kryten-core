package com.elevenware.kryten;

import com.elevenware.kryten.components.AcceptedProcessor;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.junit.Test;

public class BasicFlowTests {

    @Test
    public void spike() throws Exception {

        RouteBuilder builder = new RouteBuilder() {
            public void configure() {
                from("jetty:http://127.0.0.1:9090/pullrequest")
                        .process(new AcceptedProcessor())
                        .multicast().to("stream:out", "jenkins::startjob", "github:setbuilding", "stream:out");

            }
        };

        CamelContext myCamelContext = new DefaultCamelContext();
        myCamelContext.addRoutes(builder);

        myCamelContext.start();

        while(true);

    }

}

/*
    Pull request comes in
    Immediately marks GitHub project as being dry run
    Kicks off Jenkins job

 */