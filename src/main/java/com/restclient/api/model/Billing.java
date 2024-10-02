package com.restclient.api.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Billing implements Serializable {

    private Card card;

    private final Map<String, Object> additionalProperties = new HashMap<>();

    @Serial
    private final static long serialVersionUID = 6577338081290507077L;

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
