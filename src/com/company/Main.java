package com.company;

import com.object.Person;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Demo1 d = new Demo1("hi");
        //BaseClass b = new BaseClass("hi");
        Nehed dr = new Nehed("hi");

        Papa p2 = new Papa("papa");
        System.out.println(p2.codeSafe);

        Person p = new Person(1, "danny", "shovevani");
        System.out.println(p);

        Nehed n = new Nehed("2345");
        n.sing();

        Person p_1 = new Person(1, "danny", "shovevany");
        Person p_2 = new Person(1, "danny", "shovevany");
        System.out.println("p_1 " + p_1);
        System.out.println("p_2 " + p_2);
        System.out.println("p_1 == p_2? " + (p_1 == p_2));
        System.out.println("p_1.equals == p_2? " + (p_1.equals( p_2 )));
        String s1 = "hello"; // primitive type behavior
        boolean b = true;

        String s2 = "hello";
        System.out.println("s1.equals(s2)? " + s1.equals(s2));
        Person p_3 = (Person)p_1.clone();

        System.out.println(p_2.myToString());
    }
}
