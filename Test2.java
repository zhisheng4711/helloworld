package org.example;

/*
虽然所有循环结构都可以用 while 或者 do...while表示，但 Java 提供了另一种语句 —— for 循环，使一些循环结构变得更加简单。

for循环执行的次数是在执行前就确定的。语法格式如下：

for(初始化; 布尔表达式; 更新) {
    //代码语句
}
关于 for 循环有以下几点说明：

最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句。
然后，检测布尔表达式的值。如果为 true，循环体被执行。如果为false，循环终止，开始执行循环体后面的语句。
执行一次循环后，更新循环控制变量。
再次检测布尔表达式。循环执行上面的过程。
 */

public class Test2 {
    public static void main(String[] args) {

        for(int x = 10; x < 20; x = x+1) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
        System.out.println("----------------------------------------");
        /*
    Java5 引入了一种主要用于数组的增强型 for 循环。

    是一种用于遍历数组或集合的简化语法。它可以更方便地迭代访问集合中的元素，而无需使用传统的for循环和索引变量。

    Java 增强 for 循环语法格式如下:

for(声明语句 : 表达式)
{
   //代码句子
}
    声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定在循环语句块，其值与此时数组元素的值相等。

    表达式：表达式是要访问的数组名，或者是返回值为数组的方法。
     */
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers ){
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
        System.out.println("----------------------------------------");
        /*
        break 关键字
        break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。

        break 跳出最里层的循环，并且继续执行该循环下面的语句。

        语法
        break 的用法很简单，就是循环结构中的一条语句：

         */
        int [] numbers1 = {10, 20, 30, 40, 50};

        for(int x : numbers1 ) {
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
        System.out.println("---------------------------");
        /*
        continue 关键字
        continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。

        在 for 循环中，continue 语句使程序立即跳转到更新语句。

        在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。
         */
        int [] numbers2 = {10, 20, 30, 40, 50};

        for(int x : numbers2) {
            if( x == 30 ) {
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }
}
