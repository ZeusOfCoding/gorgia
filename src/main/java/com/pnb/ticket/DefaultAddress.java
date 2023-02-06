package com.pnb.ticket;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DefaultAddress {
    public long id;
    public String zip;
    public String city;
    public String name;
    public String country;
    @JsonProperty("default")
    public boolean mydefault;
    public String address1;
    public String address2;
    public String province;
    public String last_name;
    public String first_name;
    public long customer_id;
    public String country_code;
    public String country_name;
    public String province_code;
}
