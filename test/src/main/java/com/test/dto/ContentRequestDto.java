package com.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContentRequestDto {
    private Long id;        // pk nn
    private String name;    // nn
    private Integer seq;    // nn
    private String body;    // na
}
