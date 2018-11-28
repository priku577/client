import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Hello
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        try {
            HttpResponse<JsonNode> jsonResponse = Unirest.post("http://0.0.0.0:8080/hello2")
                    .header("accept", "application/json")
                    .queryString("apiKey", "123")
                    .field("parameter", "value")
                    .field("foo", "bar")
                    .asJson();

            System.out.println("jsonResponse: "+ jsonResponse.getBody().toString());
        } catch (UnirestException e) {
            e.printStackTrace();
        }



    }
}
