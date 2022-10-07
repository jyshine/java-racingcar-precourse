package racingcar.service;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class RacingServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"0,0", "1,0", "2,0", "3,0", "4,1", "5,1", "6,1", "7,1", "8,1", "9,1"})
    void 자동차_입력_값이_4이상이면_전진(int randomValue, int forwardCount) {
        // given
        RacingService racingService = new RacingService();
        // when
        int forward = racingService.forward(randomValue);
        // then
        assertEquals(forward, forwardCount);

    }

}