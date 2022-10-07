package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RacingCarsTest {
    RacingCars racingCars = null;

    @BeforeEach
    void setUp() {
        String inputValue = "abc,def,asdf,qwert,1234";
        racingCars = new RacingCars(inputValue);
    }

    @Test
    void 쉼표_기준으로_분리() {
        // given
        // when
        // then
        assertEquals(racingCars.getCarList().size(), 5);
    }

    @Test
    void 자동차_이름_5자_이상_예외처리() {
        String inputValue = "abc,def,asdf,qwert,1234,sfsadfs";
        // given
        // when
        Throwable thrown = catchThrowable(() -> {
            RacingCars racingCars2 = new RacingCars(inputValue);
        });
        // then
        assertThat(thrown).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("[ERROR] 경주할 자동차 이름은 5자");

    }


}