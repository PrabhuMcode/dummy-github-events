package com.example.demo;

// import com.google.gson.Gson;
// import okhttp3.OkHttpClient;
// import okhttp3.Request;
// import okhttp3.Response;

import java.io.IOException;
import java.util.Base64;

public class GitHubService {
    private final String baseUrl = "https://api.github.com";
    private final String repositoryOwner = "your-username";
    private final String repositoryName = "your-repository";

    // private final OkHttpClient httpClient;
    // private final Gson gson;

    public GitHubService() {
        // this.httpClient = new OkHttpClient();
        // this.gson = new Gson();
    }

    public Commit[] getCommits() throws IOException {
        String url = String.format("%s/repos/%s/%s/commits", baseUrl, repositoryOwner, repositoryName);
        String authToken = "your-github-auth-token";

        Request request = new Request.Builder()
                .url(url)
                .header("Authorization", "Bearer " + authToken)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Failed to retrieve commits: " + response);
            }

            String responseBody = response.body().string();
            return gson.fromJson(responseBody, Commit[].class);
        }
    }
}
