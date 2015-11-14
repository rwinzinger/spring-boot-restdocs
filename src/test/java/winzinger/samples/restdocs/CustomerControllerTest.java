package winzinger.samples.restdocs;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import winzinger.samples.restdocs.CustomerController;

import static org.hamcrest.core.IsEqual.equalTo;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.*;

/**
 * Created by rwinzing on 13.11.15.
 */
// @RunWith(SpringJUnit4ClassRunner.class)
// @SpringApplicationConfiguration(classes = App.class)
    // @IntegrationTest
public class CustomerControllerTest {
    //@Rule
    //public final RestDocumentation restDocumentation = new RestDocumentation("target/generated-snippets");

    private MockMvc mockMvc;

    @Before
    public void setUp() {
       // this.mockMvc = MockMvcBuilders.standaloneSetup(new CustomerController())
         //       .apply(documentationConfiguration(this.restDocumentation)).build();
    }

    @Test
    public void customerExample() throws Exception {
        /*
        this.mockMvc.perform(get("/api/v1/customer").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(document("index", links(
                        linkWithRel("alpha").description("Link to the alpha resource"),
                        linkWithRel("bravo").description("Link to the bravo resource"))));
                       */
        given().
                standaloneSetup(new CustomerController()).
                // param("name", "Johan").
                when().
                get("/api/v1/customer").
                then().
                statusCode(200).
                body("id", equalTo(1)).
                body("content", equalTo("Hello, Johan!"));
    }
}
