package com.principle;

/**
 * @Author: guobingnan
 * @Date: 2022/6/21 10:52
 * @Description:【里式替换原则】
 */
public class LiskovSubstitution {
    public static void main(String[] args) {
        /**********************************例子【1】：正方形长方形-main【BEGIN】********************************************/
        /*AA aa = new AA();
        aa.setHeight(3);
        aa.setWidth(5);
        BB bb = new BB();
        bb.setHeight(1);
        bb.setWidth(2);
        System.out.println("aa-h:" + aa.getHeight() + " bb-w:" + aa.getWidth());
        System.out.println("bb-h:" + bb.getHeight() + " bb-w:" + bb.getWidth());
        while(aa.getWidth() >= aa.getHeight()){
            System.out.println("之前：" + aa.getHeight());
            aa.setHeight(aa.getHeight() + 1);
            System.out.println("之后：" + aa.getHeight());
        }*/
        /**********************************例子【1】：正方形长方形-main【END】********************************************/
        OperNumA operNumA = new OperNumA();
        System.out.println("11-3=" + operNumA.func1(11,3));
        System.out.println("1-8=" + operNumA.func1(1,8));
        System.out.println("------------------------------------------");
        OperNumB operNumB = new OperNumB();
        System.out.println("11-3=" + operNumB.func1(11,3));
        System.out.println("1-8=" + operNumB.func1(1,8));
        System.out.println("11+3+9=" + operNumB.func2(11,3));
    }
}
class OperaAll{

}

class OperNumA extends OperaAll{
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}

class OperNumB extends OperaAll{
    public int func1(int num1, int num2){
        return num1 + num2;
    }

    public int func2(int num1, int num2){
        return func1(num1, num2) + 9;
    }
}

/**********************************例子【1】：正方形长方形-【BEGIN】********************************************/
/*class AA{
    int height;
    int width;
    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }
}

class BB extends AA{
    public void setHeight(int height){
        this.height = height;
        this.width = height;
    }

    public void setWidth(int width){
        this.width = width;
        this.height = width;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }
}*/
/**********************************例子【1】：正方形长方形-【END】********************************************/