package homework_10;

import okhttp3.*;

import java.io.IOException;

public class HttpServer {
    private final OkHttpClient httpClient = new OkHttpClient();

    public static void main(String[] args) throws IOException {
        HttpServer obj = new HttpServer();
        obj.sendGETSync();
    }

    private void sendGETSync() throws IOException {

        Request request = new Request.Builder()
                .url("https://httpbin.org/get")
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            System.out.println(response.body().string());
        }

    }

}

