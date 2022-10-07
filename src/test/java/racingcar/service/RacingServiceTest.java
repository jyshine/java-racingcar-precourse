package racingcar.service;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.domain.RacingCars;

class RacingServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"0,a", "1,b", "2,c", "3,d"})
    void 라운드_원(int index, String carName) {
        // given
        String inputValue = "a,b,c,d";
        RacingService racingService = new RacingService();
        // when
        racingService.roundOne(inputValue);
        RacingCars racingCars = racingService.getRacingCars();
        // then
        assertEquals(racingCars.getCarList().get(index).getName(), carName);

    }

}