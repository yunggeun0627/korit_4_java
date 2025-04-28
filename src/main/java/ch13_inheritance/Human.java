package ch13_inheritance;
/*
    1. Animal 클래스를 상속
    2. 기본 생성자를 이용하여 main에서 human1 객체를 생성
         - 기본생성자를 통해 Human 클래스의 인스턴스가 생성되었습니다. 라고 출력될 수 있도록 코드를 작성하시오.
    3. setter를 활용하여 animalName에 이름 / animalAge에 나이를 작성
    4. getter를 재정의하여
        안녕하세요. 제이름 ___입니다. 라고 출력돨 수 있도록 코드 작성
    5. getter를 재정의하여 getAnimalAge();를 호출했을 때.
        올해 제 나이는 n살입니다. 내년에는 n + 1살이 됩니다. 라고 출력될 수 있도록 코드를 작성
    6. move()메서드를 재정의 하여
        사람이 두 발로 걷습니다. 라고 출력될 수 있는 코드
    7. human 클래스의 고유 메서드인 read()메서드 call2() 유형으로 정의
        human1.read("자바의 기초"); 라고 출력
        자바의 기초를 읽는 중입니다. 라고 출력될 수 있도록 코드를 작성

    실행 예
    기본생성자를 통해 Human 클래스의 인스턴스가 생성되었습니다.
    사람이 두 발로 걷습니다.
    안녕하세요, 제 이름은 여러분이름입니다.
    올해 제 나이는 n살입니다. 내년에는 n+1살이 됩니다.
    여러분이름은 자바의 기초를 읽는 중입니다.
 */
public class Human extends Animal{

    private boolean read;

    public Human() {
        System.out.println("기본생성자를 통해 Human 클래스의 인스턴스가 생성");
    }

    public Human(String animalName) {
        super(animalName);
    }

    public Human(int animalAge) {
        super(animalAge);
    }

    public Human(boolean read) {
        this.read = read;
    }

    public Human(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    public Human(String animalName, int animalAge, boolean read) {
        super(animalName, animalAge);
        this.read = read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isRead() {
        return read;
    }

    @Override
    public String getAnimalName() {
        return "안녕하세요" + super.getAnimalName() + "입니다.";
    }

    @Override
    public int getAnimalAge() {
        System.out.println("올해는" + super.getAnimalAge() + "살입니다.내년에는" + (super.getAnimalAge()+1) + "살이 됩니다.");
        return super.getAnimalAge() ;
    }

    @Override
    public void move() {
        System.out.println("사람은 두 발로 걷습니다.");
    }
    public void read(String book) {
        System.out.println(super.getAnimalName() + "은(는)" + book + "을 읽는 중입니다.");
    }
}
