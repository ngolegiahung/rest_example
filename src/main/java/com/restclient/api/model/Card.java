package com.restclient.api.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Card implements Serializable {

    private String type;
    private String number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;

    private Map<String, Object> additionalProperties = new HashMap<>();

    @Serial
    private final static long serialVersionUID = 6203456183354582742L;

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
