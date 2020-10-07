package cn.itcast.demo4;

public class Test {
    public static void main(String[] args) {
        //多态的创建
        Animal d = new Dog();
        d.setName("小皮蛋");
        showanimal(d);
        Animal m = new Mouth();
        m.setName("Jerry");
        showanimal(m);
    }
    public static void showanimal (Animal an){
        an.eat();
    }
}
