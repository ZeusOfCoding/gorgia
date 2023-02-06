package com.pnb.model.ticketMessage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class From {
    public int id;
    public String name;
    public String address;
}
