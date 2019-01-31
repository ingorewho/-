package com.ignore.build.regular;

import lombok.ToString;

/**
 * @Author: ignore1992
 * @Description:
 * @Date: Created In 11:41 2019/1/31
 */
@ToString
public class RegularFlow {
    /**执行步骤1.**/
    private boolean step1;
    /**执行步骤2.**/
    private boolean step2;
    /**执行步骤3.**/
    private boolean step3;
    /**执行步骤4.**/
    private boolean step4;

    public RegularFlow(){

    }

    public Builder newBuilder(){
        return new Builder();
    }

    public RegularFlow(Builder builder){
        this.step1 = builder.step1;
        this.step2 = builder.step2;
        this.step3 = builder.step3;
        this.step4 = builder.step4;
    }

    public static class Builder{
        /**执行步骤1.**/
        private boolean step1;
        /**执行步骤2.**/
        private boolean step2;
        /**执行步骤3.**/
        private boolean step3;
        /**执行步骤4.**/
        private boolean step4;

        public Builder step1(boolean step1){
            this.step1 = step1;
            return this;
        }
        public Builder step2(boolean step2){
            this.step2 = step2;
            return this;
        }
        public Builder step3(boolean step3){
            this.step3 = step3;
            return this;
        }
        public Builder step4(boolean step4){
            this.step4 = step4;
            return this;
        }

        public RegularFlow build(){
            return new RegularFlow(this);
        }
    }
}
