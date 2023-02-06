package com.pnb.model.account;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
@AllArgsConstructor
public class Account {
    public Date created_datetime;
    public CurrentSubscription current_subscription;
    public Object deactivated_datetime;
    public String domain;
    public Meta meta;
    public ArrayList<Setting> settings;
    public Status status;
}
