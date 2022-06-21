package com.principle;

/**
 * @Author: guobingnan
 * @Date: 2022/6/20 16:47
 * @Description: 【依赖倒转原则】
 */
public class DependencyInversion {
    public static void main(String[] args) {
        /**********************************例子【1】：接收消息测试-【mainBEGIN】********************************************/
//        Person person = new Person();
//        Email email = new Email();
//        WX wx = new WX();
//        person.reveive(email);
//        person.reveive(wx);
        /**********************************例子【1】：接收消息测试-【mainEND】********************************************/

        //方法1
//        OpenAndClose openAndClose = new OpenAndClose();
//        ChangHong changHong = new ChangHong();
//        openAndClose.open(changHong);

        //方法2
//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();
        //方法3
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setter(changHong);
        openAndClose.open();

    }
}

/**********************************例子【1】：接收消息测试-【BEGIN】********************************************/
/*interface IReceiver{
    public String getInfo();
}
class Email implements IReceiver{
    public String getInfo(){
        return "Email接收到消息";
    }
}

class WX implements IReceiver{
    @Override
    public String getInfo() {
        return "微信接收到了消息";
    }
}

class Person{
    public void reveive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}*/
/**********************************例子【1】：接收消息测试-【END】********************************************/


/**********************************例子【2】：打开电视测试-【BEGIN】********************************************/
//方法1
/*interface IOpenAndClose{
    public void open(ITV itv);
}
interface ITV{
    public void play();
}
class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("打开长虹电视");
    }
}
class OpenAndClose implements IOpenAndClose{
    @Override
    public void open(ITV itv) {
        itv.play();
    }
}*/

//方法2

/*interface IOpenAndClose{
    public void open();
}
interface ITV{
    public void play();
}
class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("打开长虹电视");
    }
}
class OpenAndClose implements IOpenAndClose{
    public ITV tv;
    public OpenAndClose(ITV tv){
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }
}*/

//方法3

interface IOpenAndClose{
    public void open();

    public void setter(ITV tv);
}
interface ITV{
    public void play();
}
class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("打开长虹电视");
    }
}
class OpenAndClose implements IOpenAndClose{
    public ITV tv;
    @Override
    public void setter(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }
}

/**********************************例子【2】：打开电视测试-【END】********************************************/