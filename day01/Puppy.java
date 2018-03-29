/*
 * @Author: Zhong Huiping 
 * @Email: jxwazxzhp@126.com 
 * @Date: 2018-03-29 23:40:39 
 * @Last Modified by:   Zhong Huiping 
 * @Last Modified time: 2018-03-29 23:40:39 
 */
/**
 * Puppy
 */
public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("狗的名字是:" + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("狗的年龄是:" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setAge(100);
        myPuppy.getAge();
        System.out.println("变量:" + myPuppy.puppyAge);
    }
}