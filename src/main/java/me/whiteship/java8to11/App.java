package me.whiteship.java8to11;

import java.util.function.IntConsumer;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run(){
        // final이 생략되어있지만 이후에 변경하는 코드가 없으면 final로 정의
        int baseNumber = 10;

        // 로컬 변수 캡쳐
        // final이거나 effective final인 경우에만 참조할 수 있다.
        IntConsumer printInt = i -> System.err.println(i+baseNumber);

        printInt.accept(10);
    }
}
