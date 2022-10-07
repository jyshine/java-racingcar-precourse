package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingCars {
    List<Car> carList = new ArrayList<>();


    public void createCar(String inputValue) {
        String[] splitInputValue = inputValue.split(",");
        for(String splitValue:splitInputValue){
            carList.add(new Car(splitValue));
        }

    }
}
