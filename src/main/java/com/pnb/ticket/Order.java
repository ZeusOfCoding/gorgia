package com.pnb.ticket;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    public long id;
    public String total_tax;
    public Date created_at;
    public ArrayList<LineItem> line_items;
    public String contact_email;
    public BillingAddress billing_address;
}
