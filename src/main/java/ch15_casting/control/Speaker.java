package ch15_casting.control;

public class Speaker implements Power{
    @Override
    public void on() {
        System.out.println("스마트폰을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스마트폰을 끕니다.");
    }
    public void changeEqual() {
        System.out.println("이퀄라이저를 변경합니다");
    }
}
