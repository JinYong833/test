package com.test.dto;

import com.lms.domain.course.Content;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SectionRequestDto {
    private Integer id;             // pk nn
    private String name;            // nn
    private Integer seq;            // nn
    private List<Content> contents; // nn
}
