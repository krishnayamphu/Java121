package com.ky.inheritance;
class Mobile{
    void test(){
        System.out.println("testing mobile");
    }
}

class Samsung extends Mobile{
    @Override
    void test(){
        System.out.println("testing samsung mobile");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Samsung samsung=new Samsung();
        samsung.test();
    }
}
