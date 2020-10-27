package com.epikjjh.webservice.web.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WebResponseDtoTest {

    @Test
    public void lombok_test() {
        String name = "test";
        int amount = 1000;

        WebResponseDto dto = new WebResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
