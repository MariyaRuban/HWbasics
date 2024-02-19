package ru.netology.service;


import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
public void original () {

    CashbackHackService service = new CashbackHackService();
    int amount = 900;
    int actual = service.remain(amount);
    int expected = 100;

    assertEquals(actual,expected);
}
    @Test
    public void noThousand () {

        CashbackHackService service = new CashbackHackService();
        int amount = 1999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual,expected);
    }

    @Test
    public void thousand () {

        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);
    }

}
