package com.citi.spring_demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarLoanTest {
	@Autowired
    CarLoan carObj;

    @Before
    public void setUp() {
       
    }

    @Test
    public void testCalculateLoan() {
        float value = carObj.calculateLoan(2, 200000, Gender.MALE);
        Assert.assertTrue(value > 0);
    }
}
