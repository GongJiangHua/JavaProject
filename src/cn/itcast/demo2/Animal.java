package cn.itcast.demo2;

public class Animal {
    //定义成员属性
    String name;
    int age;
    String sex;
    //定义行为方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //动物吃东西
    public void eat(){
        System.out.println(name+"吃东西");
    }
}
