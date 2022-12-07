package me.whiteship.java8to11;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        // 순수함수 지향 (함수 밖에 있는 값을 변경하지 못한다)
        RunSomething runSomething = (number) -> number+10;

        System.out.println(runSomething.doIt(1));

    }

}
