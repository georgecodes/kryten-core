package com.elevenware.kryten.components;

import com.elevenware.kryten.KrytenContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by george on 03/12/2015.
 */
public class AcceptedProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
//        exchange.getOut().setBody("Received");
        exchange.setProperty("KrytenContext", new KrytenContext());
    }
}
