import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.impl.DefaultBHttpClientConnection;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.protocol.*;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by q on 17-10-10.
 */
public class ElementalHttpGet {
    public static void main(String[] args) throws IOException {
        HttpProcessor httpProcessor = HttpProcessorBuilder.create()
                .add(new RequestContent())
                .add(new RequestTargetHost())
                .add(new RequestConnControl())
                .add(new RequestUserAgent())
                .add(new RequestExpectContinue(true)).build();

        HttpRequestExecutor httpRequestExecutor = new HttpRequestExecutor();

        HttpCoreContext coreContext = HttpCoreContext.create();
        HttpHost host = new HttpHost("localhost", 8080);
        coreContext.setTargetHost(host);

        DefaultBHttpClientConnection connection = new DefaultBHttpClientConnection(8 * 1024);
        ConnectionReuseStrategy connectionReuseStrategy = DefaultConnectionReuseStrategy.INSTANCE;


        try {
            String[] targets = {
                    "/",
                    "/servlets-examples/servlet/RequestInfoExample",
                    "/somewhere%20in%20pampa"};

            for (int i = 0; i < targets.length; i++) {
                if (!connection.isOpen()) {
                    Socket socket = new Socket(host.getHostName(), host.getPort());
                    connection.bind(socket);
                }
                BasicHttpRequest request = new BasicHttpRequest("GET", targets[i]);
                System.out.println(">> Request URI: " + request.getRequestLine());

                httpRequestExecutor.preProcess(request, httpProcessor, coreContext);
                HttpResponse response = httpRequestExecutor.execute(request, connection, coreContext);
                httpRequestExecutor.postProcess(response, httpProcessor, coreContext);

                System.out.println("<< Response: " + response.getStatusLine());
                System.out.println(EntityUtils.toString(response.getEntity()));
                System.out.println("=======");

                if (!connectionReuseStrategy.keepAlive(response, coreContext)) {
                    connection.close();
                } else {
                    System.out.println("Connection kept alive ...");
                }

            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (HttpException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

}
