package me.whiteship.java8to11;

@FunctionalInterface
public interface RunSomething {
    // 함수형 인터페이스(추상메소드는 딱 하나만)
    int doIt(int number);
}
