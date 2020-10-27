package com.epikjjh.webservice.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class WebResponseDto {

    private final String name;
    private final int amount;

}