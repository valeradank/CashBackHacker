package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {


    @Test
    public void remain() {
    int amount = 1000;
    int expected = 0;
    CashbackHackService service = new CashbackHackService();
    int actual = service.remain(amount);
    Assert.assertEquals(expected,actual);

    }
}