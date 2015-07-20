package com.GetPositionClient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class GetPositionClient {
    public String respoonsebody;

    public String GetPosition() throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String url = "http://172.18.4.43:8001/loc";

        try {

            HttpGet httpGet = new HttpGet(url);
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
                public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity, "UTF-8") : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }

                }
            };
            respoonsebody = httpclient.execute(httpGet, responseHandler);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            httpclient.close();
            return respoonsebody;
        }
    }
}