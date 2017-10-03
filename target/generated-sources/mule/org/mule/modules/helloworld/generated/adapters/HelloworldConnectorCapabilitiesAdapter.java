
package org.mule.modules.helloworld.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.helloworld.HelloworldConnector;


/**
 * A <code>HelloworldConnectorCapabilitiesAdapter</code> is a wrapper around {@link HelloworldConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-29T06:27:21+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class HelloworldConnectorCapabilitiesAdapter
    extends HelloworldConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
