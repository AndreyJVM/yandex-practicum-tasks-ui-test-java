package com.example;

import org.junit.Before;
import org.mockito.MockitoAnnotations;

public class BaseTest {

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
}
