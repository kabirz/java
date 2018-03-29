/*
 * @Author: Zhong Huiping 
 * @Email: jxwazxzhp@126.com 
 * @Date: 2018-03-29 23:57:39 
 * @Last Modified by: Zhong Huiping
 * @Last Modified time: 2018-03-30 00:04:06
 */

/**
 * Test
 */
public class Test {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是:" + age);
    }
    private static void test1() {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );
     }
    public static void main(String[] args) {
        Test test = new Test();
        test.pupAge();
        test1();
    }
}