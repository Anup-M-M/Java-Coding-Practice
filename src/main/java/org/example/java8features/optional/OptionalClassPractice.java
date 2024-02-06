package org.example.java8features.optional;

import java.util.Optional;

// optional use as return type where without optionals our method has the possibility of returning null
class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
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

}

public class OptionalClassPractice {

    public static void main(String[] args) {

        Optional<Cat> optionalCat = findByName("Nemo");

//        if(optionalCat.isPresent())
//            System.out.println(optionalCat.get().getAge());
//        else
//            System.out.println(0);

//        Cat myCat = optionalCat.orElse(new Cat("UNKNOW", 0));
//        System.out.println(myCat.getAge());

        int myCatAge =  optionalCat.map(Cat :: getAge)
                .orElse(0);
        System.out.println(myCatAge);
    }

    // main goal is to convey to the user of this method that it might not return
    // a value that they are looking for and make sure that they know that they have to deal with that.
    private static Optional<Cat> findByName(String name) {

        Cat cat = new Cat(name, 3);

        return Optional.ofNullable(null);
    }

}
