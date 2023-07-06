package org.example;

/*
构造方法
每个类都有构造方法。如果没有显式地为类定义构造方法，Java 编译器将会为该类提供一个默认构造方法。

在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。

下面是一个构造方法示例：

public class Puppy {
    public Puppy(){

    }
    public Puppy(String name){
        //这个构造器仅有一个参数：name
    }
}
*/

/*
创建对象
对象是根据类创建的。在Java中，使用关键字 new 来创建一个新的对象。创建对象需要以下三步：

声明：声明一个对象，包括对象名称和对象类型。
实例化：使用关键字 new 来创建一个对象。
初始化：使用 new 创建对象时，会调用构造方法初始化对象。
下面是一个创建对象的例子：

public class Puppy{
    public Puppy(String name){
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name);
    }
    public static void main(String[] args){
        //下面的语句将创建一个Puppy对象
        Puppy myPuppy = new Puppy("tommy");
    }
}
*/

/*
通过已创建的对象来访问成员变量和成员方法，如下所示：

实例化对象
Object referenceVariable = new Constructor();

访问类中的变量
referenceVariable.methodName():
*/

public class Puppy{
    int puppyAge;
    public Puppy(String name){
        //这个构造器仅有一个参数
        System.out.println("小狗的名字是:" + name);
    }
    public void setAge(int age){
        puppyAge = age;
    }

    public  int getAge(){
        System.out.println("小狗年龄为："+puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
        /*创建对象*/
        Puppy myPuppy = new Puppy("tommy");
        /*通过方法来设定age*/
        myPuppy.setAge(2);
        /*调用另一个方法来获取age*/
        myPuppy.getAge();
        /*你也可以像下面这样访问成员变量*/
        System.out.println("变量值：" + myPuppy.puppyAge);
    }

}