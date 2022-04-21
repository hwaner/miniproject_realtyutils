package com.hwaner.realtyutils.policy;

/**
 * @author hwaner
 * @created at 2022/04/21 13:29
 * @description:
 */
public interface BrokeragePolicy {
    BrokerageRule createBrokerageRule(Long price);

    default Long calculate(Long price) {
        BrokerageRule rule = createBrokerageRule(price);
        return rule.calcMaxBrokerage(price);
    }
}
