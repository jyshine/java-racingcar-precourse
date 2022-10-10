package racingcar.util;

public class Validation {
    public void validationCarName(String carNames) {
//        TODO: 공백을 카운트로 셀 것인지 확인 및 추가 작업 필요
//        TODO: 하드코딩하지 않고 상수로 표현하기
        for(String carName:carNames.split(",")){
            if (carName.length() > 5) {
                throw new IllegalArgumentException("[ERROR] 경주할 자동차 이름은 5자 이내로 설정할 수 있습니다.");
            }
        }

    }

    public void validationRound(String round) {
        if (!round.matches("[+-]?\\d*(\\.\\d+)?")) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
    }
}
