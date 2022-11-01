//静态代码块在类加载时执行，只执行一次
//并且在main方法执行前自上而下执行
//
public class 静态代码块 {
    static{
        System.out.println("a");
    }

    //实例语句块：在构造方法执行之前自动执行
    //每个构造方法之前都会调用一次
    {
        System.out.println("q");
    }

    public static void main(String[] args) {

        System.out.println("c");
        new 静态代码块();
        new 静态代码块(1);
    }

    static{
        System.out.println("b");
    }

    public 静态代码块(){
        System.out.println("无参构造");
    }
    public 静态代码块(int a){
        System.out.println("无参构造");
    }

}
