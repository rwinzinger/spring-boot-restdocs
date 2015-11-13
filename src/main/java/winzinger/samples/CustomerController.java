package winzinger.samples;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;

@Named
@Path("/api/v1/")
public class CustomerController {
    @Path("/ping")
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public String ping() {
        return "pong";
    }

    @Path("/customer")
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Customer getCustomer() {
        return new Customer(1, "John", "Doe", LocalDate.of(1973, 7, 18));
    }
}
