package com.pnb.model.message;

import com.pnb.model.ticketMessage.Receiver;
import com.pnb.model.ticketMessage.Sender;
import com.pnb.model.ticketMessage.Source;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class Message {
    public String body_html;
    public String body_text;
    public String channel = "email";
    public Date created_datetime;
    public String external_id;
    public Object failed_datetime;
    public boolean from_agent;
    public String message_id;
    public Receiver receiver;
    public Sender sender;
    public Date sent_datetime;
    public Source source;
    public String subject;
    public String via = "api";
}
