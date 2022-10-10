package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    private final List<Car> carList = new ArrayList<>();


    public void createCar(String inputValue) {
        String[] splitInputValue = inputValue.split(",");
        for (String splitValue : splitInputValue) {
            carList.add(new Car(splitValue));
        }
    }


    public int forward(int randomeValue) {
        // TODO 하드코딩 변경
        int count = 0;
        if (isForward(randomeValue)) {
            count = 1;
        }
        return count;
    }

    private boolean isForward(int randomeValue) {
        // TODO 하드코딩 변경
        return randomeValue >= 4;
    }

    public List<Car> getCarList() {
        return carList;
    }

}
