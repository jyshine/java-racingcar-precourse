package racingcar.service;

import racingcar.domain.Car;
import racingcar.domain.RacingCars;
import racingcar.util.RandomNumber;

public class RacingService {
    private final RacingCars racingCars = new RacingCars();
    private final RandomNumber randomNumber = new RandomNumber();

    public void round() {
        for (Car car : racingCars.getCarList()) {
            car.setPosition(racingCars.forward(randomNumber.getNumber()));
        }
    }

    public void start(String inputValue) {
        racingCars.createCar(inputValue);
        int count = Integer.parseInt(inputValue);
        for (int i = 0; i < count; i++) {
            round();
        }
    }

    public RacingCars getRacingCars() {
        return racingCars;
    }
}
