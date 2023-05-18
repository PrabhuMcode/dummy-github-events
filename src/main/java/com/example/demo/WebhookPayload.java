package com.example.demo;

public class WebhookPayload {
    private String action;
    private Repository repository;
    private PushEvent push;
    private PullRequestEvent pull_request;
    private String ref_type;
    // Add more properties as needed
    
    // Getter and setter methods
    
    public static class Repository {
        private String name;
        // Add more repository properties as needed
        
        // Getter and setter methods
    }
    
    public static class PushEvent {
        private String ref;
        // Add more push event properties as needed
        
        // Getter and setter methods
    }
    
    public static class PullRequestEvent {
        private String number;
        // Add more pull request event properties as needed
        
        // Getter and setter methods
    }
}
