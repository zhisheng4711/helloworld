package org.example;

public class LocalVariablesExample {
    public static void main(String[] args){
        int a = 0;
        int b;
        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
//   以上实例中我们声明并初始化了两个局部变量 a 和 b，然后打印出它们的值。
//   注意，如果在使用局部变量之前不初始化它，编译器会报错。
