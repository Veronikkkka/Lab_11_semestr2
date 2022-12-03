import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;
public class Main {
    public static void main(String[] args) throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient( "e6992813f526534dbb5d213d4d037402","3423d4ebff1fe8248dad1a3f05e3fb72", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "veronika.shevtsova@ucu.edu.ua")
                                        .put("Name", "Nika"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", "nataliia.chaika@ucu.edu.ua")
                                                .put("Name", "Nataly")))
                                .put(Emailv31.Message.SUBJECT, "Greeting")
                                .put(Emailv31.Message.TEXTPART, "Email for friend")
                                .put(Emailv31.Message.HTMLPART, "<h2>Nataly</h2> <p></p>")
                                .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
