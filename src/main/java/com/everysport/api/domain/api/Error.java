package com.everysport.api.domain.api;

import java.util.List;

public class Error {

    private String status;
    private List<String> messages;

    public String getStatus() {
        return status;
    }

    public List<String> getMessages() {
        return messages;
    }

    @Override
    public String toString() {
        return "messages=" + messages;
    }
}
