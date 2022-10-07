package racingcar.util;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNumber {
    public int getNumber() {
        // TODO 하드코딩 상수로 빼기
        return pickNumberInRange(0, 9);
    }
}
