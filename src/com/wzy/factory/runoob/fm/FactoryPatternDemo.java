package com.wzy.factory.runoob.fm;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 08:44
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = factory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = factory.getShape("SQUARE");
        shape3.draw();
    }
}
