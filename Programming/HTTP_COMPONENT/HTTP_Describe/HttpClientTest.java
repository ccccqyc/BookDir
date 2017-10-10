import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by q on 17-10-7.
 */
public class HttpClientTest {

    @Test
    public void junitTest(){
        get();
    }

    /**
     * get请求
     */
    public void get() {
        //http代理
        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {
            HttpGet httpGet = new HttpGet("http://www.baidu.com");
            System.out.println("executing request" + httpGet.getURI());
            //执行get请求\
            CloseableHttpResponse response = httpClient.execute(httpGet);

            try {
                //获取响应体
                HttpEntity entity = response.getEntity();
                System.out.println("-------------------------");

                //打印响应状态
                System.out.println(response.getStatusLine());
                if (entity != null) {
                    System.out.println("Response content length : " + entity.getContentLength());
                    //set the default charset to utf-8
                    System.out.println("Response content :" + EntityUtils.toString(entity,"UTF-8"));
                }
                System.out.println("-------------------------");
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void post(){
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost("http://localhost:8080");

        //创建参数队列
        List formParams = new ArrayList<>();
        formParams.add(new BasicNameValuePair("type","house"));
        UrlEncodedFormEntity urlEncodedFormEntity;
        

    }
}
