package winzinger.samples.restdocs;

import org.glassfish.jersey.server.ResourceConfig;

import javax.inject.Named;

// @Component
@Named
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(CustomerController.class);
    }

}