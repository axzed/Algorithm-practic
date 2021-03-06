package com.nowcoder.part03;

public class DataTypeDemo {

    public static void main(String[] args) {
        // 1.直接写出的值叫直接量
        System.out.println(9);
        System.out.println(3.14);

        // 2.int
        // 直接写出的整数是int类型的直接量
        int i = 123;
        // 赋值超出范围,编译报错
        // i = 3000000000;
        // 运算超出范围,结果错误
        i = 2147483647; // 0111...
        System.out.println(i + 1); // 1000...

        // 3.byte, short, long
        // int直接量可直接赋值给long类型
        long l = 2;
        // long类型的直接量需要以l/L结尾
        l = 3000000000L;
        // int直接量可直接赋值给byte,short,但不能超出其范围
        byte b = 4;
        // b = 128;
        // b = i;
        short s = 2;
        // s = 32768;
        // s = i;

        // 4.float,double
        // 直接写出的小数是double类型的直接量
        double d = 0.3;
        // float类型的直接量需要以f/F结尾
        float f = 0.8F;
        // 浮点数不精确
        System.out.println(300000.02f);
        System.out.println(300000.03f);
        System.out.println(3.3f + 0.1f);

        // 5.char
        char c1 = 'A';
        char c2 = 0b01000001; // 65
        char c3 = '\u0041'; //unicode(16进制)
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        // 转义字符
        char c4 = '\'';
        char c5 = '\t';
        char c6 = '\\';
        char c7 = '\n';
        System.out.print(c4);
        System.out.print(c5);
        System.out.print(c6);
        System.out.print(c7);
        // 字符串
        String str = "Hello World.";
        System.out.println(str);

        // 6.boolean
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);
        // 判断的结果是布尔值
        int age = 25;
        System.out.println(age < 18);
    }

}
