
package tests;

import config.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static org.testng.Assert.assertEquals;

public class NegativeTests extends BaseTest {

    @Test
    public void testInvalidEndpoint() {
        Response response = get("/invalid");
        assertEquals(response.getStatusCode(), 404);
    }
}
