package com.example.togglzTest.configuration;

import com.example.togglzTest.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@SpringBootTest(classes = {TogglzTestApplication.class})
@RunWith(SpringRunner.class)
@ActiveProfiles(profiles = "local")
public class TogglzTestApplicationTests {


    @Autowired
    private Property leanmix;

    @Test
    public void propertyLoads() {
        Assert.notNull(leanmix.getProp(), "Prop must not be null");
    }

}
