package com.elevenware.kryten;

import com.elevenware.kryten.components.AcceptedProcessor;
import com.elevenware.kryten.components.jira.JiraComponent;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.junit.Test;

public class BasicFlowTests {

    @Test
    public void spike() throws Exception {

        RouteBuilder builder = new RouteBuilder() {
            public void configure() {

//                from("jetty:http://0.0.0.0:9090/ghprbhook")
////                        .unmarshal().json(JsonLibrary.Gson, true)
//                        .process(new AcceptedProcessor())
//                        .convertBodyTo(String.class)
//                        .multicast().to("stream:out", "direct:http://16e43cfe.ngrok.com/ghprbhook?bridgeEndpoint=true&amp;throwExceptionOnFailure=false", "github:setbuilding", "jira:update", "stream:out");
                from("jetty:http://0.0.0.0:9090/ghbrphook")
                        .to("jetty:http://google.com");

            }
        };

        CamelContext myCamelContext = new DefaultCamelContext();
        myCamelContext.addRoutes(builder);

        myCamelContext.addComponent("jira", new JiraComponent());

        myCamelContext.start();

        while(true);

    }

}

/*
    Pull request comes in
    Immediately marks GitHub project as being dry run
    Kicks off Jenkins job

 */