package com.pnb.model.account;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
@lombok.Data
@AllArgsConstructor
public class Data {
    public int survey_interval;
    public String survey_email_html;
    public String survey_email_text;
    public boolean send_survey_for_chat;
    public boolean send_survey_for_email;
    public String timezone;
    public ArrayList<BusinessHour> business_hours;
    public boolean unassign_on_reply;
    public ArrayList<String> assignment_channels;
    public boolean auto_assign_to_teams;
    public int max_user_chat_ticket;
    public int max_user_non_chat_ticket;
    public Views views;
    public ViewSections view_sections;
    public String signup_mode;
    public ArrayList<Object> allowed_domains;
    public boolean google_sso_enabled;
    public boolean office365_sso_enabled;
}
