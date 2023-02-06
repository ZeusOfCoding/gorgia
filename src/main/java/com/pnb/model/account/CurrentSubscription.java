package com.pnb.model.account;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data
@AllArgsConstructor
public class CurrentSubscription {
    public String plan;
    public Date start_datetime;
    public String status;
    public Date trial_end_datetime;
    public Date trial_start_datetime;
}
