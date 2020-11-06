package client;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * @ClassName OkHttpClient
 * @Description TODO
 * @Author frode
 * @Date 2020/11/4 下午10:33
 **/
public class OkHttpUtil {
    private final static String BASE_URL = "http://127.0.0.1:";
    private final static String PORT = "8802";

    public void testGet() throws IOException {
        OkHttpClient client = new OkHttpClient();
        String api = "/api/files/1";
        String url = String.format("%s", BASE_URL + PORT);
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        final Call call = client.newCall(request);
        Response response = call.execute();
        System.out.println(response.body().string());
    }

    public static void main(String[] args) throws IOException {
        new OkHttpUtil().testGet();
    }
}
