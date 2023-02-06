package com.pnb.model.ticketMessage;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
@Data
@AllArgsConstructor
public class TicketMessage {
    public int id;
    public ArrayList<Object> attachments;
    public String body_html;
    public String body_text;
    public String channel;
    public Date created_datetime;
    public String external_id;
    public Object failed_datetime;
    public boolean from_agent;
    public int integration_id;
    public Object last_sending_error;
    public String message_id;
    public Receiver receiver;
    public int rule_id;
    public Sender sender;
    public Source source;
    public Object stripped_html;
    public Object stripped_text;
    public String subject;
    public int ticket_id;
    public String via;
    public String uri;
}
