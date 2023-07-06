package org.example;
/*
while是最基本的循环，它的结构为：

while( 布尔表达式 ) {
  //循环内容
}
只要布尔表达式为 true，循环就会一直执行下去。
 */
public class Test1 {
    public static void main(String[] args) {
        int x = 10;
        while( x < 20 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }
    }
}
