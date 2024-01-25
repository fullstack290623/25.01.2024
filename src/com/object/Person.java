package com.object;

public class Person extends Object implements Cloneable{

    protected int id;
    protected String fname;
    protected String lname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Person(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", fname='" + fname + '\'' +
//                ", lname='" + lname + '\'' +
//                '}' + super.toString();
//    }

    public boolean is_positive(int number) {
        return number > 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String myToString() {
        // getClass = "class com.object.Person" [0] "class" [1]"com.object.Person"
        // a-b-c split('-') [0] a [1] b [2] c
        return this.getClass().toString().split(" ")[1] + "@" + Integer.toHexString(this.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        int[] arr = new int[1_000_000];
        // arr
        Person other = (Person)obj;
        return this.id == other.id && this.fname.equals(other.fname) && this.lname.equals(other.lname);
    }

    @Override
    public int hashCode() {
        // 1
        //return this.id;
        // 2
        return String.format("%d%s%s",this.id, this.fname, this.lname).hashCode();
    }
}
