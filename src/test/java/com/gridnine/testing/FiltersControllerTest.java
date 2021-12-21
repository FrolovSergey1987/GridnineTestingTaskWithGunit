package com.gridnine.testing;

import junit.framework.TestCase;

public class FiltersControllerTest extends TestCase {


    public void testDepartureDateBeforeCurrentDate() throws Exception {
        if (FlightBuilder.createFlights().isEmpty()){
            System.out.println("No flights!!!");
        }
    }

    public void testSegmentsDateArrivalBeforeDateDeparture() throws Exception {
        if (FlightBuilder.createFlights().isEmpty()){
            System.out.println("No flights!!!");
        }
    }

    public void testTransferOverTwoHour() throws Exception {
        if (FlightBuilder.createFlights().isEmpty()){
            System.out.println("No flights!!!");
        }
    }
}