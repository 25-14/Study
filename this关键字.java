/*
* this是一个关键字，一个对象一个this
* this是一个变量，一个引用，this保存当前对象的内存地址，指向自身
* this存储在堆内存中对象的内部
*
* this不能在静态方法中，使用在实例方法中，谁（对象）调用，this就是谁，代表当前对象
* this大部分情况可以省略*/
public class this关键字 {
    public static void main(String[] args) {
        guke c1=new guke("张三");
        c1.shop();
        guke c2=new guke("李四");
        c2.shop();
        guke c3=new guke();
        c3.ac();
    }
}
class guke{
    String name;
    private int a;
    private int b;

    public guke(){
        //this可以用在构造方法中
        //通过当前的构造方法去调用另一个本类的构造方法
        //this(实际参数列表);
        this(1,2);//只能放在构造方法第一行
    }
    public guke(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void ac(){
        System.out.println(a+","+b);
    }
    public guke(String s){
        name=s;
    }
    public void shop(){
        //c1调用shop(),this是c1
        //c2调用shop(),this是c2
        System.out.println(name+"购物!");
    }

    //this不能省的时候：区分实例变量和局部变量
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
