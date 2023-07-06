package org.example;

public class Counter {
    private static int count = 0;
    public  Counter(){
        count++;
    }
    public static int getCount(){
        return count;
    }

    public static void main(String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("目前为止创建的对象数: " + Counter.getCount());
    }
}
//以下实例定义了一个 Counter 类，其中包含了一个静态变量 count，用于记录创建了多少个 Counter 对象。
//
//每当创建一个新的对象时，构造方法会将计数器加一。静态方法 getCount() 用于获取当前计数器的值。
//
//在 main() 方法中，我们创建了三个 Counter 对象，并打印出了计数器的值。