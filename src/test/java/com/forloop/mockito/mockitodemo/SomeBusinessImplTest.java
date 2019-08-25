package com.forloop.mockito.mockitodemo;

import org.junit.Test;

import javax.xml.crypto.Data;

import static org.junit.Assert.*;

public class SomeBusinessImplTest {

    @Test
    public void testFindTheFreatestFromAllData() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
        int result = someBusiness.findTheGreatestFromAllAllData();
        assertEquals(24, result);
    }

}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{24, 6, 15};
    }
}