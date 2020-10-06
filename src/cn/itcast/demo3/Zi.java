package cn.itcast.demo3;
//子类
public class Zi extends Fu{
    int num=20;
    public void Show(){
        int num=10;
        System.out.println(num);//10
        System.out.println(this.num);//20
        System.out.println(super.num);//30
    }
}
