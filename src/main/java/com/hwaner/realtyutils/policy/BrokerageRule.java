package com.hwaner.realtyutils.policy;

import lombok.AllArgsConstructor;

/**
 * @author hwaner
 * @created at 2022/04/21 13:25
 * @description: 가격이 특정범위일 떄, 상한율과 상환금액을 가지는 클래스
 */
@AllArgsConstructor
public class BrokerageRule {
    private Double brokeragePercent;
    private Long limitAmount;

    public Long calcMaxBrokerage(Long price) {
        if (limitAmount == null) {
            return multiplyPercent(price);
        }
        return Math.min(multiplyPercent(price), limitAmount);
    }

    // 중복 계산식이기 때문에 private method 로 분류
    private Long multiplyPercent(Long price) {
        // 퍼센트 계산, 소수점 자르기
        return Double.valueOf(Math.floor(brokeragePercent / 100 * price)).longValue();
    }
}
