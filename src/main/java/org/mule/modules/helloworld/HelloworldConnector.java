package org.mule.modules.helloworld;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.display.FriendlyName;
import org.mule.api.annotations.display.Placement;
import org.mule.modules.helloworld.config.ConnectorConfig;

@Connector(name="helloworld", friendlyName="Helloworld")
public class HelloworldConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor
    public String greet(String friend) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return config.getGreeting() + " " + friend + ". " + config.getReply();
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }
    
    @Processor(friendlyName="HelloWorldTest")
    public String helloWorldTest(@Placement(group="Parameters")
      @FriendlyName("The person") String person) {
            return person + " has tested HelloWorld Connector";
        }

}