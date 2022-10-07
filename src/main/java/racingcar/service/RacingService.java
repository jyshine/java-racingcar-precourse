package racingcar.service;

public class RacingService {

    public Integer forward(int randomeValue) {
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
}
