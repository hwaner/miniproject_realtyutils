package com.hwaner.realtyutils.policy;

import com.hwaner.realtyutils.constants.ActionType;

/**
 * @author hwaner
 * @created at 2022/04/21 13:30
 * @description:
 */
public class BrokeragePolicyFactory {

    public static BrokeragePolicy of(ActionType actionType) {
        switch (actionType) {
            case RENT:
                return new RentBrokeragePolicy();
            case PURCHASE:
                return new PurchaseBrokeragePolicy();
            default:
                throw new IllegalArgumentException("해당 actionType 에 대한 정책이 존재하지 않습니다.");
        }
    }
}
