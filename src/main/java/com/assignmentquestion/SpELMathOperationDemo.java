package com.assignmentquestion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpELMathOperationDemo {

	public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("beans.xml");
            MyBean bean = (MyBean) context.getBean("myBean");
            System.out.println("bean.getTotal()    = " + bean.getTotal());
            System.out.println("bean.getLength()   = " + bean.getLength());
            System.out.println("bean.getSize()     = " + bean.getSize());
            System.out.println("bean.getReminder() = " + bean.getReminder());
            System.out.println("bean.getDistance() = " + bean.getDistance());
            System.out.println("bean.getPower()    = " + bean.getPower());
        
    }
}
