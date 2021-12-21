package com.gridnine.testing;

import junit.framework.TestCase;

public class FlightBuilderTest extends TestCase {

    public void testCreateFlights() throws Exception {
        if (FlightBuilder.createFlights().isEmpty()){
            System.out.println("No flights!!!");
        }
    }
}
