package com.pnb.ticket;

import java.util.Date;

public class User {
    public int id;
    public String external_id;
    public String email;
    public String bio;
    public String name;
    public Date created_datetime;
    public Date updated_datetime;
    public Meta meta;
    public int account_id;
    public boolean active;
    public String firstname;
    public boolean has_password;
    public boolean has_2fa_enabled;
    public String lastname;
    public Role role;
}
