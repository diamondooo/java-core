package com.dm.core.reflection;

/**
 * @author Diamond
 * @date 2020-9-4
 * 测试反射服务类
 * */
public class TestService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String test(String msg) {
        System.out.println(msg);
        return "test reflection";
    }

    protected String test(String name, String msg) {
        System.out.println(msg);
        return name+": "+msg;
    }

    private String testPrivate(int num) {
        System.out.println(num);
        return "test private";
    }
}
