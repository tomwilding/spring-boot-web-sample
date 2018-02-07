package com.example.togglzTest.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by thomaswilding on 06/02/2018.
 */
@ConfigurationProperties(prefix = "leanmix")
@Component
public class Property {

    private Map prop;

    public Map getProp() {
        return prop;
    }

    public void setProp(Map prop) {
        this.prop = prop;
    }


}
