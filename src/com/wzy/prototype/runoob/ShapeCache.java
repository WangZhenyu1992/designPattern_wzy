package com.wzy.prototype.runoob;

import java.util.Hashtable;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-06 10:32
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        System.out.println(cachedShape == (Shape)cachedShape.clone());
        return (Shape)cachedShape.clone();
    }

    // 对每种形状都进行数据库查询，并创建该形状
    // 例如我们要添加三种形状
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
