package 基础补充;
//抽象类作为方法参数与返回值
public class 各种类作为方法参数和返回值 {
    public static void main(String[] args) {
        Person p = new Student();
        method(p);
    }
    public static void method(Person p){//抽象类作为参数
        p.show();
    }
}
abstract class Person{
    public abstract void show();
}
class Student extends Person{
    public void show() {
        System.out.println("重写了show方法");
    }
}

abstract class Person1{
    public abstract void show();
}
class Student1 extends Person1{
    @Override
    public void show() {
        System.out.println("重写了show方法");
    }
}
//测试类
class Test {
    public static void main(String[] args) {
        Person p = method();
        p.show();
    }
    public static Person method(){
        Person p = new Student();
        return p;
    }
}
//接口作为方法参数与返回值
interface Smoke{
    public abstract void smoking();
}
class Student2 implements Smoke{
    public void smoking() {
        System.out.println("cy");
    }
}
class Test1 {
    public static void main(String[] args) {
        Smoke s = new Student2();
        method(s);
    }
    public static void method(Smoke sm){//接口作为参数
        sm.smoking();
    }
}
class Test2 {
    public static void main(String[] args) {
        Smoke s = method();
        s.smoking();
    }
    public static Smoke method(){
        Smoke sm = new Student2();
        return sm;
    }
}