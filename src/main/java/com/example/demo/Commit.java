package com.example.demo;

public class Commit {
    private CommitDetails commit;

    public CommitDetails getCommit() {
        return commit;
    }

    public void setCommit(CommitDetails commit) {
        this.commit = commit;
    }

    public static class CommitDetails {
        private String message;
        private Committer author;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Committer getAuthor() {
            return author;
        }

        public void setAuthor(Committer author) {
            this.author = author;
        }
    }

    public static class Committer {
        private String name;
        private String email;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
