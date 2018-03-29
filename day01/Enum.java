/*
 * @Author: Zhong Huiping 
 * @Email: jxwazxzhp@126.com 
 * @Date: 2018-03-29 23:40:15 
 * @Last Modified by:   Zhong Huiping 
 * @Last Modified time: 2018-03-29 23:40:15 
 */
/**
 * Enum
 */
public class Enum {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println(juice.size);
    }
}

/**
 * FreshJuice
 */
class FreshJuice {
    enum FreshJuiceSize {
        SMALL, MEDIUM, LARGE
    }

    FreshJuiceSize size;
}