package com.pnb.ticket;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pnb.model.ticketMessage.Receiver;
import com.pnb.model.ticketMessage.Sender;
import com.pnb.model.ticketMessage.Source;

import java.util.ArrayList;
import java.util.Date;

public class Messages {
    public ArrayList<Macro> macros;
    public int id;
    public String external_id;
    public String message_id;
    @JsonProperty("public")
    public boolean mypublic;
    public String channel;
    public String via;
    public Source source;
    public String subject;
    public String body_text;
    public String body_html;
    public Object stripped_text;
    public Object stripped_html;
    public Object stripped_signature;
    public ArrayList<Object> attachments;
    public Meta meta;
    public Date created_datetime;
    public Date opened_datetime;
    public Object failed_datetime;
    public Object deleted_datetime;
    public ArrayList<Object> actions;
    public String uri;
    public int integration_id;
    public int rule_id;
    public int ticket_id;
    public boolean from_agent;
    public Sender sender;
    public Receiver receiver;
    public Headers headers;
    public Object last_sending_error;
}
