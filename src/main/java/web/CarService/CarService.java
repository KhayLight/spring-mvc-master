package web.CarService;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private  static final List<Car> listCar = new ArrayList<>();

    static {
        listCar.add(new Car(1, "Jetta", 2008));
        listCar.add(new Car(2, "AlmazMachine", 2000));
        listCar.add(new Car(3, "9evat69evat6", 2019));
        listCar.add(new Car(4, "Wkoda Octavia", 2018));
        listCar.add(new Car(5, "Java Virtual Machine", 2017));
    }


    public static List<Car> getCountCars(Integer count) {
        return listCar.stream().limit(count).collect(Collectors.toList());
    }

    public static List<Car> getAllCars() {
        return listCar;
    }

}