package com.test.dto;

import com.test.category.CategoryLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CategoryRequestDto {
    private Integer id;             // pk nn
    private String name;            // nn
    private CategoryLevel level;    // na
    private Integer parentId;       // nn
}
