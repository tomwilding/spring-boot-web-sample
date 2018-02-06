package com.example.togglzTest.service;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import com.example.togglzTest.properties.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by thomaswilding on 06/02/2018.
 */

@RestController
@RequestMapping(value = "/v1")
@CrossOrigin
public class TestService {


    @Autowired
    private Property prop;

    /**
     * This method is used to fetch archetype Meta-Data based on which UI will ask end user to enter data
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "test", method = GET, consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public @ResponseBody
    Map test() throws Exception {
        return prop.getProp();
    }
}
