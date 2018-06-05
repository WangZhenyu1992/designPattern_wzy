package com.wzy.factory.runoob.fm;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 08:42
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
