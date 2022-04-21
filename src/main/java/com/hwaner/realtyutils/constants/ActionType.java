package com.hwaner.realtyutils.constants;

import lombok.AllArgsConstructor;

/**
 * @author hwaner
 * @created at 2022/04/21 12:17
 * @description:
 */
@AllArgsConstructor
public enum ActionType {
    PURCHASE("매매"),
    RENT("임대차");

    // 실무에서 잘 알아볼 수 있도록 자주 쓰는 방법(description)
    private String description;
}