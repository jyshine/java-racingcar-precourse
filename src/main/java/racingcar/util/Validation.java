package racingcar.util;

import static racingcar.util.Constans.LIMIT_CAR_NAME;
import static racingcar.util.Constans.REGEX_CAR_ROUND_NUMBER;
import static racingcar.util.Constans.SPLIT_CAR_NAME_DELIMITER;
import static racingcar.util.Messages.ERROR_CAR_NAME_LIMIT;
import static racingcar.util.Messages.ERROR_RACING_ROUND_NUMBER;

public class Validation {
    public void validationCarName(String carNames) {
//        TODO: 공백을 카운트로 셀 것인지 확인 및 추가 작업 필요
        for(String carName:carNames.split(SPLIT_CAR_NAME_DELIMITER)){
            if (carName.length() > LIMIT_CAR_NAME) {
                throw new IllegalArgumentException(ERROR_CAR_NAME_LIMIT);
            }
        }

    }

    public void validationRound(String round) {
        if (!round.matches(REGEX_CAR_ROUND_NUMBER)) {
            throw new IllegalArgumentException(ERROR_RACING_ROUND_NUMBER);
        }
    }
}
