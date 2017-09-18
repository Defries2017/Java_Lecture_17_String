package com.company;

public class Fish {
    String name;
    int age;

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        String info = "Имя рыбки - " + name +
                "\nВозраст рыбки - " + age;

        return info;
    }
}
