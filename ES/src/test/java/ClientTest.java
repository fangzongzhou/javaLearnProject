import com.fzz.es.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.junit.Test;

import java.net.UnknownHostException;

public class ClientTest {

    @Test
    public void getClient() throws UnknownHostException {
        TransportClient client=new Client().getClient();
        System.out.println(client.toString());
        client.close();

    }

    @Test
    public void getClientWithSetting() {
        TransportClient client = new Client().getClientWithSetting();
        System.out.println(client);
        client.close();
    }
}