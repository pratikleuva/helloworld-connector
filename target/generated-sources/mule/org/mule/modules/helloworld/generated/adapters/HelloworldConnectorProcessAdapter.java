
package org.mule.modules.helloworld.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.helloworld.HelloworldConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>HelloworldConnectorProcessAdapter</code> is a wrapper around {@link HelloworldConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-29T06:27:21+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class HelloworldConnectorProcessAdapter
    extends HelloworldConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<HelloworldConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, HelloworldConnectorCapabilitiesAdapter> getProcessTemplate() {
        final HelloworldConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,HelloworldConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, HelloworldConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, HelloworldConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
