package web.CarService;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarService {
    private final List<Car> listCar = new ArrayList<>();
    {
        listCar.add(new Car(1, "Jetta", 2008));
        listCar.add(new Car(2, "AlmazMachine", 2000));
        listCar.add(new Car(3, "9evat69evat6", 2019));
        listCar.add(new Car(4, "Wkoda Octavia", 2018));
        listCar.add(new Car(5, "Java Virtual Machine", 2017));
    }

    public List<Car> getCountCars(Integer count) {
        return listCar.stream().limit(count).collect(Collectors.toList());
    }

    public List<Car> getAllCars() {
        return listCar;
    }

}