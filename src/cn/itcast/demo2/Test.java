package cn.itcast.demo2;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        Pig p = new Pig();
        //给狗和猪的属性赋值
        d.setName("小七");
        d.setAge(18);
        d.setSex("男");
        p.setName("小憨憨");
        p.setAge(11);
        p.setSex("女");

        System.out.println(d.getName());
        System.out.println(p.getName());
        d.eat();
        p.eat();
        d.watch("二哈");
        p.snore("佩奇");
    }
}
