package com.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NoticeRequestDto {
    private Long id;                    // pk nn
    private String body;                // na
    private LocalDateTime createdAt;    // nn
    private LocalDateTime updatedAt;    // na
}
