package edu.sabanciuniv.howudoin.dto;

import lombok.Data;

@Data
public class MessageRequest {
    private String recipientEmail;
    private String content;
}
