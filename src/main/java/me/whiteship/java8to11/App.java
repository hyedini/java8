package me.whiteship.java8to11;

import java.util.Arrays;
import java.util.Random;
import java.util.function.*;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
    /*
        - Function<T,R> : T타입을 입력받아서 R타입을 반환
            Function<Integer,Integer> plus10 = (i) ->  i+10;
            Function<Integer,Integer> multiply2 = (i) ->  i*2;
            Function<Integer,Integer> multiply2AndPlus10 = plus10.compose(multiply2)
               -- 뒤를 먼저 실행
            Function<Integer,Integer> multiply2AndPlus10 = plus10.andThen(multiply2)
               -- 앞을 먼저 실행
        - Consumer<T> : T타입을 받아서 아무 값도 리턴하지 않는 함수 인터페이스
            Consumer<Integer> printT = (i) -> System.err.println(i);
            printT.accept(10);
        - Supplier<T> : T타입의 값을 제공하는 함수 인터페이스
            Supplier<Integer> get10 = () -> 10;
            get10.get();
        - Predicate<T> : T 타입 값을 받아서 boolean을 리턴하는 함수 인터페이스
            Predicate<String> startsWithHyejin = (s) ->s.startsWith("hyejin");
            startsWithHyejin.test("hyejinIsTrue");
        - UnaryOperator<T> : 입력T 와 반환R의 타입이 같은 경우 사용
            UnaryOperator<Integer> plus10 = (i) ->  i+10;
            UnaryOperator<Integer> multiply2 = (i) ->  i*2;
        - BinaryOperator<T> : BiFunction<T,U,R>의 특수한 형태로, 동일한 타입의 입력값 두개를 받아 리턴하는 함수 인터페이스
    */
    }

}
