package racingcar.view;

import java.util.ArrayList;
import racingcar.domain.Car;
import racingcar.domain.RacingCars;

public class RacingView {
    public void printRacingResult(RacingCars racingCars) {
        for (Car car : racingCars.getCarList()) {
            System.out.printf("%s:%s%n", car.getName(), getPositionDottedLine(car.getPosition()));
        }
        System.out.println();
    }

    private String getPositionDottedLine(int position) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }

    public void printInputCarName() {
        System.out.println("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printInputRound() {
        System.out.println("시도할 회수");
    }

    public void printOutWinnerCars(ArrayList<String> winnerCars) {
        System.out.println(winnerCars);
    }
}
