package racingcar.controller;

import racingcar.domain.Winner;
import racingcar.service.RacingService;
import racingcar.view.RacingView;

public class RacingController {
    RacingService racingService = new RacingService();
    RacingView racingView = new RacingView();
    Winner winner = new Winner();

    public void startRacingGame() {
        String inputCarName = racingView.printInputCarName();
        racingService.init(inputCarName);
        String inputRound = racingView.printInputRound();

        int count = Integer.parseInt(inputRound);

        for (int i = 0; i < count; i++) {
            racingService.round();
            racingView.printRacingResult(racingService.getRacingCars());
        }

        winner.getWinnerPosition(racingService.getRacingCars().getCarList());
        winner.getWinnerCars(racingService.getRacingCars().getCarList());

        racingView.printOutWinnerCars(winner.getWinnerCars());

    }
}
