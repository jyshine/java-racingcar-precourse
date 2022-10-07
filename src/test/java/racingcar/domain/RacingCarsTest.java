package racingcar.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RacingCarsTest {

    @Test
    void 쉼표_기준으로_분리(){
        // given
        String inputValue = "abc, def, asdf, qwert, 123456";
        // when
        RacingCars racingCars = new RacingCars();
        racingCars.createCar(inputValue);
        // then
        assertEquals(racingCars.carList.size(), 5);
    }
}