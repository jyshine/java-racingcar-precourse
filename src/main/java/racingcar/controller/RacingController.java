package racingcar.controller;

import racingcar.domain.Winner;
import racingcar.service.RacingService;
import racingcar.util.Validation;
import racingcar.view.RacingView;

public class RacingController {
    RacingService racingService = new RacingService();
    RacingView racingView = new RacingView();
    Winner winner = new Winner();

    Validation validation = new Validation();


    public void startRacingGame() {
        String validName = setRacingCars();
        racingService.init(validName);

        String inputRound = setRacingRound();
        int count = Integer.parseInt(inputRound);

        for (int i = 0; i < count; i++) {
            racingService.round();
            racingView.printRacingResult(racingService.getRacingCars());
        }

        winner.getWinnerPosition(racingService.getRacingCars().getCarList());
        winner.getWinnerCars(racingService.getRacingCars().getCarList());

        racingView.printOutWinnerCars(winner.getWinnerCars());
    }

    private String setRacingRound() {
        try {
            String inputRacingRound = racingView.printInputRound();
            validation.validationRound(inputRacingRound);
            return inputRacingRound;
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return setRacingRound();
        }
    }

    private String setRacingCars() {
        try {
            String inputCarName = racingView.printInputCarName();
            validation.validationCarName(inputCarName);
            return inputCarName;
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return setRacingCars();
        }

    }
}
