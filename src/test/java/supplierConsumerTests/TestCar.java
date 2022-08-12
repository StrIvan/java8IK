package supplierConsumerTests;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestCar {
    List<Car> mustangs = createTenCars(() -> new Car("red", "mustangGT", 4.0));
    List<Car> mustangsGreen = createTenCars(() -> new Car("green", "mustangGT", 4.0));
    List<Car> mustangsBlack = createTenCars(() -> new Car("black", "mustangGT", 4.0));
    @Test
    public void checkCar(){

        System.out.println(mustangs);
        System.out.println(mustangsGreen);
        System.out.println(mustangsBlack);

    }

    @Test
    public void changeCarTest(){
        changeCar(mustangs.get(0), carToChange -> {
            carToChange.color = "white";
            carToChange.engine = 5.0;
            System.out.println(carToChange);

        });
        List<Integer> intLi = List.of(5, 6 , 80);
        intLi.forEach(i -> System.out.println(i+1));
    }
    public void changeCar(Car car, Consumer<Car> consumer){
        consumer.accept(car);
    }

    public List<Car> createTenCars(Supplier<Car> supplier){
        List<Car> cars = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            cars.add(supplier.get());
        }
        return cars;
    }
}

class Util{
    public void printPlusOne(int i){
        System.out.println(i + 1);

    }
}
