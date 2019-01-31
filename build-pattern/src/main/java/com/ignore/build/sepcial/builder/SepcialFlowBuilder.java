package com.ignore.build.sepcial.builder;

import com.ignore.build.sepcial.flow.Flow;
import com.ignore.build.sepcial.flow.SpecialFlow;

/**
 * @Author: renzhiqiang-lhq
 * @Description:
 * @Date: Created In 11:36 2019/1/31
 */
public class SepcialFlowBuilder implements FlowBuilder{
    private Flow flow = new SpecialFlow();

    public void buildStep1() {
        flow.setStep1(true);
    }

    public void buildStep2() {
        flow.setStep2(true);
    }

    public void buildStep3() {
        flow.setStep3(true);
    }

    public void buildStep4() {
        flow.setStep4(false);
    }

    public Flow buildFlow() {
        return flow;
    }
}
