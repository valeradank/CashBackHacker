package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        int amount = 700;
        int expected = 300;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testRemain2() {
        int amount = 999;
        int expected = 1;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testRemain3() {
        int amount = 1;
        int expected = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(actual,expected);
    }
}