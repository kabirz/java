/*
 * @Author: Zhong Huiping 
 * @Email: jxwazxzhp@126.com 
 * @Date: 2018-03-30 00:06:21 
 * @Last Modified by: Zhong Huiping
 * @Last Modified time: 2018-03-30 00:12:46
 */

/**
 * MyMath
 */
public class MyMath {
    public static void main(String[] args) {
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));    
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);
    }
}