# 计192 2019310204 马宇豪
## 实验二 PC机模拟程序

### 一、实验目的
#### 1、掌握类和对象
#### 2、写出程序并初步学会调试
#### 3、利用GitHub平台写实验报告

### 二、实验内容与要求
#### 1、基本要求
##### 1)	用类描述计算机中CPU的速度和硬盘的容量
##### 2)	要求Java程序中有4个类，名字分别为CPU、HardDisk、PC和Test，其中Test为主类。
##### 3)	CPU类要求
###### i.	getSpeed()返回speed的值。
###### ii.	setSpeed(int m)方法将参数m的值赋值给speed。
##### 4)	HardDisk类要求
###### i.	getAmount()返回amount的值。
###### ii.	setAmount(int m)方法将参数m的值赋值给amount。
##### 5)	PC类要求
###### i. setCPU(CPU c)将参数c的值赋值给cpu
###### ii.	setHardDisk(HardDisk h)方法将参数h的值赋值给HD
###### iii.	show()方法能显示cpu的速度和硬盘容量
##### 6)	主类Test的要求
###### i.	创建CPU、HardDisk和PC的对象
###### ii.	调用setCPU(CPU c)方法，调用时实参是cpu
###### iii.	调用setHardDisk(HardDisk h)方法，调用时实参是disk
###### iv.	调用show()方法
#### 2、附加要求
##### 1)	类中定义不少于两个构造方法；
##### 2)	每个类定义不少于2个属性，且属性的类型应该多样化；
##### 3)	根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
##### 4)	尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。

### 三、解题思路
#### 1.	创建三个类，并满足基本要求中对各个类中对成员变量和函数的要求。
#### 2.	进行封装，对CPU与硬盘类中，关于CPU的速度与硬盘的容量，在set方法中进行if判读，为后续private类型做准备。
#### 3.	将各个类中的变量添加关键字private，避免用户可直接更改speed和amount的值。
#### 4.	除主类外，在各个类中构建两个方法，在方法中调用对应的set函数。
#### 5.	在pc类定义的show函数中，通过 get来输出各个变量的值。
#### 6.	在主类中，通过创建各类的对象，来set各类对象中各个变量的值。
#### 7.	在主类中，通过pc类的show函数来输出各个变量的值。

### 四、关键代码
#### 这两段代码中展示了变量添加关键字private之后，在主类中如何set变量的值，并且避免了用户直接调用变量本身，提高了程序的安全性，也体现了本次的实验目的之一，了解不同关键词下，变量的作用域，以及不同作用域下，我们该如何设置变量的值。
```
public class PC {
    private CPU cpu;
    private HardDisk HD;
    PC(CPU cpu){
        setCPU(cpu);
    }
    PC(HardDisk HD){
        setHardDisk(HD);
    }
```
```
public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU(2800,"Intel");
        HardDisk hd = new HardDisk(512);
        PC pc = new PC(cpu);
        pc.setHardDisk(hd);
```

### 五、实验结果
#### 实验结果截图
![实验结果截图](https://github.com/mayuhao1023/JAVA2/main/1.png)

### 六、实验感想
#### 通过本次实验，我学会并熟悉了如何创建类、方法和构造方法，用import来跨包调用类，以及基本的访问修饰符使用。实验中四个类组成的关系链让我充分熟悉类与类之间的关系，并不断调试程序和改善代码。除此以外，我还学会如何简单使用GitHub和markdown编辑实验报告。
