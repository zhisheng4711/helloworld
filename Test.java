package org.example;

//在以下实例中 age 是一个局部变量，定义在 pupAge()方法中，它的作用域就限制在这个方法中：

public class Test{
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args){
        Test test = new Test();
        test.pupAge();
    }
}



//在下面的例子中 age 变量没有初始化，所以在编译时会出错：

/*
public class Test{
   public void pupAge(){
      int age;
      age = age + 7;
      System.out.println("小狗的年龄是 : " + age);
   }

   public static void main(String[] args){
      Test test = new Test();
      test.pupAge();
   }
}
*/