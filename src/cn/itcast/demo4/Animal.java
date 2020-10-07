package cn.itcast.demo4;

public class Animal {
    //成员属性
    private String name;
    //成员方法
    //空参方法
    public Animal() {
    }
    //全参方法
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //成员方法
    public void eat (){
        System.out.println("吃饭");
    }
}
