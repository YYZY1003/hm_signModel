package com.yy.principles.demo2.before;

/**
 * @version v1.0
 * @ClassName: Square
 * @Description: 正方形类
 * @Author: YY
 */
public class Square extends Rectangle {

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }
}
