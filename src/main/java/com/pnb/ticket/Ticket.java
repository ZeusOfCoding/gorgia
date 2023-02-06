package com.pnb.ticket;

import java.util.ArrayList;
import java.util.Date;

public class Ticket {
    public int id;
    public Object assignee_user;
    public String channel;
    public Object closed_datetime;
    public Date created_datetime;
    public Customer customer;
    public ArrayList<Event> events;
    public String external_id;
    public boolean is_unread;
    public String language;
    public Date last_message_datetime;
    public Date last_received_message_datetime;
//    public Messages messages;
    public Meta meta;
    public Date opened_datetime;
    public SatisfactionSurvey satisfaction_survey;
    public Object snooze_datetime;
    public boolean spam;
    public String status;
    public String subject;
    public ArrayList<Tag> tags;
    public Object trashed_datetime;
    public Date updated_datetime;
    public String via;
    public String uri;
}
