package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingCars {
    List<Car> carList = new ArrayList<>();


    public void createCar(String inputValue) {
        String[] splitInputValue = inputValue.split(",");
        for (String splitValue : splitInputValue) {
            validationCarName(splitValue);
            carList.add(new Car(splitValue));
        }

    }

    private void validationCarName(String carName) {
//        TODO: 공백을 카운트로 셀 것인지 확인 및 추가 작업 필요
//        TODO: 하드코딩하지 않고 상수로 표현하기

        if (carName.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 경주할 자동차 이름은 5자 이내로 설정할 수 있습니다.");
        }
    }
}
