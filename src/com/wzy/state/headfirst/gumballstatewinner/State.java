package com.wzy.state.headfirst.gumballstatewinner;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-08 14:45
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

    void refill();
}
