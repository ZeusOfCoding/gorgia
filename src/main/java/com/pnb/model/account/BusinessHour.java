package com.pnb.model.account;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BusinessHour {
    public String days;
    public String to_time;
    public String from_time;
}
