package AirPlanesTest;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestAirplanes {
    List<Airplanes> airplanesLagg = createTenAirplanes(() -> new Airplanes("3.35", 650, 7000,500));
    List<Airplanes> airplanesMig = createTenAirplanes(() -> new Airplanes("47", 700, 6200, 750));
    List<Airplanes> airplanesSu = createTenAirplanes(() -> new Airplanes("29", 850, 7600, 920));
    List<List<Airplanes>> allAirplanes = List.of(airplanesLagg,airplanesMig,airplanesSu);


    @Test
    public void changeAirplanesTest(){
        changeAirplane(airplanesLagg.get(0), airplanesToChange -> {
            airplanesToChange.model = "3.37";
            airplanesToChange.speed = 720;
            System.out.println(airplanesToChange);

        });
    }
    @Test
    public void changeAirplanesTestConsumer(){
        changeAirplane(airplanesMig.get(0), airplanesToChange -> {
            airplanesToChange.maxHeight = 6800;
            airplanesToChange.MaxFlyDistance = 840;
            System.out.println(airplanesToChange);

        });
    }

    @Test
    public void checkAirplanesPredicate(){
        changeAirplane(airplanesLagg.get(0), airplanesToChange -> {
            airplanesToChange.model = "3.37";
            airplanesToChange.speed = 720;
            System.out.println(airplanesToChange);
            Predicate<Airplanes> predicateAirplanesWithMaxSpeedMoreThan700 = aiprlane ->aiprlane.speed > 700;
            Predicate<Airplanes> predicateAirplanesWithMaxHeightMoreThan6500 = aiprlane ->aiprlane.maxHeight > 6500;
            printConditions(allAirplanes, predicateAirplanesWithMaxHeightMoreThan6500.and(predicateAirplanesWithMaxSpeedMoreThan700));
        });
    }
    @Test
    public void checkAirplanesPredicate1(){
        changeAirplane(airplanesLagg.get(0), airplanesToChange -> {
            System.out.println(airplanesToChange);
            Predicate<Airplanes> predicateAirplanesModelSu = aiprlane ->aiprlane.model.equals("3.35");
            Predicate<Airplanes> predicateAirplanesModelMig = aiprlane ->aiprlane.model.equals("29");
            printConditions(allAirplanes, predicateAirplanesModelMig.and(predicateAirplanesModelSu));
        });
    }



    public void changeAirplane(Airplanes airplanes, Consumer<Airplanes> consumer){
        consumer.accept(airplanes);
    }

    public List<Airplanes> createTenAirplanes(Supplier<Airplanes> supplier){
        List<Airplanes> airplanes = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            airplanes.add(supplier.get());
        }
        return airplanes;
    }
    public void printConditions(List<List<Airplanes>> airpalnesList, Predicate<Airplanes> predicate) {
        for (List<Airplanes> airplanes : airpalnesList) {
            if (predicate.test((Airplanes) airplanes)) {
                System.out.println(airplanes);
            }
        }

    }
}

