package org.example.java8features.lambda;

@FunctionalInterface
interface B{
    void show(int i, int j);
}

public class lambdaExpressionExample {
    public static void main(String[] args) {
        B obj=(int i,int j) -> System.out.println("lambda expression "+ i + j);
        obj.show(1,2);
    }
}
