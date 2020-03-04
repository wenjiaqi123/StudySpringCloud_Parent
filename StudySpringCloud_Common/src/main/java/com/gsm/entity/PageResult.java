package com.gsm.entity;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
/**
 * 分页实体
 */
public class PageResult<T> {
    private Long total;
    private List<T> rows;
}
