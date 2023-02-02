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
    @Test
    public void remain2() {
        int amount = 999;
        int expected = 1;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void remain3() {
        int amount = 1;
        int expected = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(expected,actual);

    }
}