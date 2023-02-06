package com.pnb.model.ticketMessage;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Source {
    public String type;
    public From from;
    @JsonProperty("to")
    public List<To> to;
}
