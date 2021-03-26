package com.venele.trytest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DummyServiceTest {

    @Autowired
    private DummyService dummyService;

    @Test
    public void test() {
        String before = "before";
        String after = "after";

        String result = dummyService.concat(before, after);

        assertEquals(before + after, result);
    }
}