package com.test.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseRequestDto {
    private Integer id;                 // pk nn
    private String title;               // nn
    private String summary;             // na
    private String detail;              // na
    private Integer subCategoryId;      // fk nn
    private LocalDateTime createdAt;    // nn
    private LocalDateTime updatedAt;    // na
}