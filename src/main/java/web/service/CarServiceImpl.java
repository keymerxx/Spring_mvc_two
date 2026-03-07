package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carList = new ArrayList<>(List.of(
            new Car("Toyota", 1, "Black"),
            new Car("BMW", 2, "Red"),
            new Car("Audi", 3, "Green"),
            new Car("Skoda", 4, "Blue"),
            new Car("Opel", 5, "White")
    ));

    public List<Car> getCars(int count) {
        return carList.stream()
                .limit(count)
                .toList();
    }
}
