package com.forloop.mockito.mockitodemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

    @Test
    public void testFindTheFreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24, 15, 3});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);

        int result = someBusiness.findTheGreatestFromAllAllData();
        assertEquals(24, result);
    }

    @Test
    public void testFindTheFreatestFromAllDataForOneValue() {
        DataService dataServiceMock = mock(DataService.class);

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{15});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);

        int result = someBusiness.findTheGreatestFromAllAllData();
        assertEquals(15, result);
    }

}