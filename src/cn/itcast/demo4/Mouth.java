package cn.itcast.demo4;

public class Mouth extends Animal {
    //父类animal的子类
    //成员方法重写
    public void eat (){
        System.out.println(getName()+"吃奶酪");
    }
}
