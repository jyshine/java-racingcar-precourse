package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RacingCarsTest {

    @Test
    void 쉼표_기준으로_분리() {
        // given
        String inputValue = "abc,def,asdf,qwert,1234";
        // when
        RacingCars racingCars = new RacingCars();
        racingCars.createCar(inputValue);
        // then
        assertEquals(racingCars.carList.size(), 5);
    }

    @Test
    void 자동차_이름_5자_이상_예외처리() {
        // given
        String inputValue = "abc,def,asdf,qwert,aaaaaa";
        // when
        RacingCars racingCars = new RacingCars();

        // then
        Throwable thrown = catchThrowable(() -> racingCars.createCar(inputValue));
        // then
        assertThat(thrown).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("[ERROR] 경주할 자동차 이름은 5자");

    }
}