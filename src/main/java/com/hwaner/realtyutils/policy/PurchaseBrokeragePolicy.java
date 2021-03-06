package com.hwaner.realtyutils.policy;

/**
 * @author hwaner
 * @created at 2022/04/21 13:27
 * @description: 매매일때, 중개수수료를 계산해주는 클래스
 */
public class PurchaseBrokeragePolicy implements BrokeragePolicy {
    public BrokerageRule createBrokerageRule(Long price) {
        BrokerageRule rule;
        if (price < 50_000_000) {
            rule = new BrokerageRule(0.6, 250_000L);
        }
        else if (price < 200_000_000) {
            rule = new BrokerageRule(0.5, 800_000L);
        }
        else if (price < 600_000_000) {
            rule = new BrokerageRule(0.4, null);
        }
        else if (price < 900_000_000) {
            rule = new BrokerageRule(0.5, null);
        }
        else {
            rule = new BrokerageRule(0.9, null);
        }
        return rule;
    }
}
