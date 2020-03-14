package com.company;

public class Main {

    public static void main(String[] args) {
        Eagle<Integer> desertEagle = new Eagle<>(3);
        Eagle<Float> berkut = new Eagle(5);

        System.out.println("Desert Eagle flight altitude " + desertEagle.fly() + " km");
        System.out.println("Berkut flight altitude " + berkut.fly() + " km");
    }
}
