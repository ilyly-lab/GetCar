package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServislmpl implements CarService {


    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Lada", 12, 333));
            carList.add(new Car("Moskvich", 2, 444));
            carList.add(new Car("Kopeika", 30, 80));
            carList.add(new Car("Volga", 13, 55));
            carList.add(new Car("Kamaz", 45, 222));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
