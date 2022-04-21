package com.hwaner.realtyutils.controller;

import com.hwaner.realtyutils.constants.ActionType;
import com.hwaner.realtyutils.policy.BrokeragePolicy;
import com.hwaner.realtyutils.policy.BrokeragePolicyFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hwaner
 * @created at 2022/04/21 12:14
 * @description:
 */
@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType, @RequestParam Long price) {
        // type definition - 매매 or 임대차
        // enume class 로 정의할것임
        // TODO: 중개수수료 계산 로직
        BrokeragePolicy policy = BrokeragePolicyFactory.of(actionType);
        return policy.calculate(price);
    }
}