package com.ruolan.designpattern.factory.factory.nystyle;

import com.ruolan.designpattern.factory.factory.Pizza;

public class NYStyleCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备工作");
    }

    @Override
    public void bake() {
        System.out.println("烘焙了20分钟");
    }

    @Override
    public void cut() {
        System.out.println("切了多少个");
    }

    @Override
    public void box() {
        System.out.println("装箱了");
    }
}
