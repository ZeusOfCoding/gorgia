package com.pnb.model.account;

import lombok.AllArgsConstructor;

@lombok.Data
@AllArgsConstructor
public class Setting {
    public int id;
    public Data data;
    public String type;
}
