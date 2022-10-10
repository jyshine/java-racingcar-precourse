package racingcar.view;

import static racingcar.util.Constans.CAR_ROUND_RESULT_DELIMITER;

import java.util.ArrayList;
import racingcar.domain.Car;
import racingcar.domain.RacingCars;
import camp.nextstep.edu.missionutils.Console;

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
            stringBuilder.append(CAR_ROUND_RESULT_DELIMITER);
        }
        return stringBuilder.toString();
    }

    public String printInputCarName() {
        System.out.println("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public String printInputRound() {
        System.out.println("시도할 회수");
        return Console.readLine();
    }

    public void printOutWinnerCars(ArrayList<String> winnerCars) {
        System.out.println("최종 우승자: "+String.join(", ",winnerCars));
    }
}
