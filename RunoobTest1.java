package org.example;


// 以下实例我们声明了两个成员变量 a 和 b，并对其进行了访问和设置。
// 注意，我们可以通过对象访问成员变量，也可以通过类名访问静态成员变量。


public class RunoobTest1 {
    private int a; // 私有成员变量a
    public String b = "Hello"; // 公有成员变量b

    public static void main(String[] args){
        RunoobTest1 obj = new RunoobTest1(); // 创建对象

        obj.a = 10; // 访问成员变量a,并将其设置为10
        System.out.println("a = " + obj.a);

        obj.b = "World"; // 访问成员变量b,并将其值设置为“World”
        System.out.println("b = " + obj.b);
    }

}
