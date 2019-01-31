package com.ignore.test;


import com.ignore.build.regular.RegularFlow;
import com.ignore.build.sepcial.builder.FlowBuilder;
import com.ignore.build.sepcial.builder.SepcialFlowBuilder;
import com.ignore.build.sepcial.flow.Flow;

/**
 * @Author: renzhiqiang-lhq
 * @Description:
 * @Date: Created In 11:40 2019/1/31
 */
public class Main {
    public static void main(String[] args)
    {
        //构建者模式：采用内部类方式来实现
        RegularFlow flow = new RegularFlow().newBuilder()
                        .step1(true)
                        .step2(true)
                        .step3(true)
                        .step4(false)
                        .build();
        System.out.println("标准构建器：" + flow.toString());

        //构建者模式：采用继承或接口方式来实现
        FlowBuilder builder = new SepcialFlowBuilder();
        builder.buildStep1();
        builder.buildStep2();
        builder.buildStep3();
        builder.buildStep4();
        Flow specialFlow = builder.buildFlow();
        System.out.println("变体构建器：" + specialFlow.toString());
    }
}
