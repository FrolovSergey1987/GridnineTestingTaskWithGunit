package com.gridnine.testing;


import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;


public class FiltersController {


    public static void departureDateBeforeCurrentDate(final List<Flight> list) {
        for (Flight dateTime : list) {
            if (dateTime.getSegments().get(0).getDepartureDate().isBefore(LocalDateTime.now())) {
                System.out.println(" Departure to the current time : " + "\n" + dateTime);
            }
        }
    }

    public static void segmentsDateArrivalBeforeDateDeparture(final List<Flight> list) {
        for (Flight dateTime : list) {

            if (dateTime.getSegments().stream().anyMatch(x -> x.getArrivalDate().isBefore(x.getDepartureDate()))) {
                System.out.println();
                System.out.println(" There are segments with an arrival date earlier than the departure date : " + "\n" + dateTime);
            }
        }
    }

    public static void transferOverTwoHour(final List<Flight> list) {
        List<Flight> sortedList = new LinkedList<>();

        for (Flight dateTime : list) {
            Duration segmentsCalculate = dateTime.getSegments().stream()
                    .map(x -> Duration.between(x.getDepartureDate(), x.getArrivalDate()))
                    .reduce(Duration::plus).get();

            Duration flightCalculate = Duration.between(dateTime.getSegments().get(0).getDepartureDate(),
                    dateTime.getSegments().get(dateTime.getSegments().size() - 1).getArrivalDate());

            if (flightCalculate.minus(segmentsCalculate).compareTo(Duration.ofHours(2)) > 0) {
            }
            sortedList.add(dateTime);
        }
        System.out.println();
        System.out.print(" Total time spent on earth that exceeds two hours : " + "\n" + sortedList);

    }

}


