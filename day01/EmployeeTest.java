/*
 * @Author: Zhong Huiping 
 * @Email: jxwazxzhp@126.com 
 * @Date: 2018-03-29 23:37:56 
 * @Last Modified by: Zhong Huiping
 * @Last Modified time: 2018-03-29 23:39:41
 */

import kabir.Employee;

public class EmployeeTest {

    public static void main(String args[]) {
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}