package com.wzy.template.headfirst;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-06 16:05
 */
public abstract class AbstractClass {
    // 模板方法，被声明为final，防止子类修改
    final void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    // 两个原语操作，具体子类必须实现
    abstract void primitiveOperation1();
    abstract void primitiveOperation2();

    final void concreteOperation(){

    }

    void hook(){}
}
