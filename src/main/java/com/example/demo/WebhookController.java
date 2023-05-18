package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @PostMapping
    public HttpStatus handleWebhookEvent(@RequestBody WebhookPayload payload) {
        // Process the webhook event
        // Extract relevant information from the payload
        // Handle push, pull request, and merge events
        // Write the details of the event to the logger

        return HttpStatus.OK;
    }
}
