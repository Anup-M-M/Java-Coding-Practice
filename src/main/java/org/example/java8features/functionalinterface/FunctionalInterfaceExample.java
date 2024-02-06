package org.example.java8features.functionalinterface;

@FunctionalInterface
interface A{
    void show();
}

//class B implements A{
//
//    @Override
//    public void show() {
//        System.out.println("in show");
//    }
//}



public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        A obj=new A(){
            @Override
            public void show() {
                System.out.println("in show");
            }

        };
        obj.show();
    }
}
