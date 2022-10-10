package racingcar.controller;

import racingcar.domain.Winner;
import racingcar.service.RacingService;
import racingcar.view.RacingView;

public class RacingController {
    RacingService racingService = new RacingService();
    RacingView racingView = new RacingView();
    Winner winner = new Winner();

    public void startRacingGame() {
        racingView.printInputCarName();

        racingService.init("a,b,c,d,e");
        racingView.printInputRound();

        int count = Integer.parseInt("10");

        for (int i = 0; i < count; i++) {
            racingService.round();
            racingView.printRacingResult(racingService.getRacingCars());
        }

        winner.getWinnerPosition(racingService.getRacingCars().getCarList());
        winner.getWinnerCars(racingService.getRacingCars().getCarList());

        racingView.printOutWinnerCars(winner.getWinnerCars());

    }
}
