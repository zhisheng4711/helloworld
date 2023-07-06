package org.example;

/*静态变量的命名规范与实例变量相同，一般采用驼峰命名法，并且要用 static 关键字明确标识。例如：
public class MyClass {
    public static int MAX_COUNT = 100;
    // 其他成员变量和方法
}
 */

/*
以下实例定义了一个 AppConfig 类，其中包含了三个静态变量 APP_NAME、APP_VERSION 和 DATABASE_URL，
用于存储应用程序的名称、版本和数据库连接URL。这些变量都被声明为 final，表示它们是不可修改的常量。
在 main() 方法中，我们打印出了这些静态变量的值。
 */
public class AppConfig {
    public  static  final  String APP_NAME = "MyApp";
    public  static  final  String APP_VERSION = "1.0.0";
    public  static  final  String DATABASE_URL = "jdbc:mysql://localhost:3306/mydb";

    public static void main(String[] args){
        System.out.println("Application name:" + AppConfig.APP_NAME);
        System.out.println("Application version:" + AppConfig.APP_VERSION);
        System.out.println("Application URL:" + AppConfig.DATABASE_URL);
    }
}
//可以看到，这些静态变量存储的全局配置信息可以在整个程序中使用，并且不会被修改。
// 这个例子展示了静态变量的另一个常见应用，通过它我们可以很方便地存储全局配置信息，或者实现其他需要全局共享的数据。
