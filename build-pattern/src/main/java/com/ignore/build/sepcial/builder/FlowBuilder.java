package com.ignore.build.sepcial.builder;

import com.ignore.build.sepcial.flow.Flow;

/**
 * @Author: ignore1992
 * @Description:
 * @Date: Created In 11:21 2019/1/31
 */
public interface FlowBuilder {
    void buildStep1();

    void buildStep2();

    void buildStep3();

    void buildStep4();

    Flow buildFlow();
}
