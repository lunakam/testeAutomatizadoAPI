import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApiTest {
    public static void main(String[] args) {
    }

        @Before
        public void before() {
            System.out.println("Executado Before testes");
        }

        @After
        public void after() {
            System.out.println("Executado After testes");
        }

        @Test
        public void testResposeCode(){
            Response response = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

            int code = response.getStatusCode();

            Assert.assertEquals(code,200);

            System.out.println("Codigo de retorno da API é igual o esperado : "+code);
        }

        @Test
        public void testBody() {
            Response response = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

            String data = response.asString();


            System.out.println("Dados de retorno da API : " + data);
            System.out.println("Dados de retorno da API : " + data);

        }
    }