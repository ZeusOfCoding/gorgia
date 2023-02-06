package com.pnb.ticket;

import java.util.ArrayList;

public class LineItem {
    public long id;
    public String sku;
    public String name;
    public int grams;
    public String price;
    public String title;
    public boolean taxable;
    public int quantity;
    public PriceSet price_set;
    public ArrayList<TaxLine> tax_lines;
    public long product_id;
    public long variant_id;
    public String total_discount;
    public boolean requires_shipping;
    public Object fulfillment_status;
    public TotalDiscountSet total_discount_set;
    public String fulfillment_service;
    public int fulfillable_quantity;
}
