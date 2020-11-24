package com.dm.core.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Declared修饰为当前类声明属性和方法（包含public、protect、private），继承不属于该范围
 * */
public class TestReflection {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        TestService testService = new TestService();
        /*Method test = testService.getClass().getMethod("test", String.class);
        Method declaredMethod = testService.getClass().getDeclaredMethod("test", String.class);
        Object invoke = test.invoke(TestService.class.getConstructor().newInstance(), "test message");*/
        Method[] declaredMethods = testService.getClass().getDeclaredMethods();
        for (Method method:declaredMethods) {
            System.out.println(method.getName());
        }

        System.out.println("methodName: ");
        Method[] methods = testService.getClass().getMethods();
        for(Method method:methods) {
            System.out.println(method.getName());
        }

        Field name = testService.getClass().getDeclaredField("name");
        name.setAccessible(true);
        name.set(testService, "diamond");
        System.out.println(testService.getName());
    }
}
