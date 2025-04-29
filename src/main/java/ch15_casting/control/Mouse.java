package ch15_casting.control;

public class Mouse implements Power{

    @Override
    public void on() {
        System.out.println("Mouse 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("Mouse 전원을 끕니다");
    }
}
