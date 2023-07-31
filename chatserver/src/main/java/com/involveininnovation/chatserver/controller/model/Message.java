package com.involveininnovation.chatserver.controller.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {
    private String sendername;
    private String receiverName;
    private String message;
    private String date;
    private String status;

    public String getReceiverName() {
        return receiverName;
    }
}
