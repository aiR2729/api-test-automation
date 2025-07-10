
package tests;

import config.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static org.testng.Assert.assertEquals;

public class PositiveTests extends BaseTest {

    @Test
    public void testGetAllPosts() {
        Response response = get("/posts");
        assertEquals(response.getStatusCode(), 200);
    }
}

