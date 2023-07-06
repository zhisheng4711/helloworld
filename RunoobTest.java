package org.example;

/*
public class RunoobTest {
    //  成员变量
    private  int instanceVar;
    //  静态变量
    private  static int staticVar;
    public void method(int paraVar){
        //  局部变量
        int localVar = 10;

        //  使用变量
        instanceVar = localVar;
        staticVar = paraVar;

        System.out.println("成员变量：" + instanceVar);
        System.out.println("静态变量：" + staticVar);
        System.out.println("参数变量：" + paraVar);
        System.out.println("局部变量：" + localVar);
    }
    public static void main(String[] args){
        RunoobTest v = new RunoobTest();
        v.method(20);
    }
    //输出结果：
    //成员变量: 10
    //静态变量: 20
    //参数变量: 20
    //局部变量: 10

}
*/

public class RunoobTest{
    public static void main(String[] args){
        int a = 10, b = 20;
        swap(a,b); // 调用swap方法
        System.out.println("a = " + a + ",b = " + b);
    }

    public static void swap(int x, int y){
        /*需要注意的是，Java中的参数传递是按值传递的，即传递给方法的是实参的值的副本，
        而不是实参本身。所以在 swap 方法中交换的只是局部变量 x 和 y 的值，并不影响 main 方法中的变量 a 和 b。*/
        int temp = x;
        // 若想进行引用传递，则需如下编写代码：
        //Integer temp = x;
        //如此才会输出a = 20, b = 10
        x = y;
        y = temp;
        //输出a = 10,b = 20
    }

}
