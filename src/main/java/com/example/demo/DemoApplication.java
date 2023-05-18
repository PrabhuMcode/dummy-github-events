package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		getAndLogCommits();
	}

	public static void getAndLogCommits() {
        try {
            GitHubService gitHubService = new GitHubService();
            Commit[] commits = gitHubService.getCommits();

            for (Commit commit : commits) {
                System.out.println("Commit Message: " + commit.getCommit().getMessage());
                System.out.println("Author: " + commit.getCommit().getAuthor().getName());
                System.out.println("Email: " + commit.getCommit().getAuthor().getEmail());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
