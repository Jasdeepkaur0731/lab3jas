package com.example.hrmanagementjasdeep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {



    @Test
    void annualsalary() {
        HelloApplication x= new HelloApplication();
        assertEquals(x.annualsalary(6000),72000);
    }
}