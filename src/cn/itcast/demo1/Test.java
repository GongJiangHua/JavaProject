package cn.itcast.demo1;
//测试类
public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        //给对象c的姓名设置为：张三
        c.setName("张三");
        //打印姓名的值
        System.out.println(c.getName());
    }
}
