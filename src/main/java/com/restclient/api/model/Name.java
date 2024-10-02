package com.restclient.api.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Name implements Serializable {

    private String title;
    private String first;
    private String last;
    private Map<String, Object> additionalProperties = new HashMap<>();

    @Serial
    private final static long serialVersionUID = 420620315591775395L;

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
