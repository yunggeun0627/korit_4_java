package ch09_classes.students;

public class StudentsMain {
    public static void main(String[] args) {
        Students students = new Students();
        Students students2 = new Students(2025002);
        Students students3 = new Students("김삼");
        Students students4 = new Students(2025004, "김사");
        Students students5 = new Students(2025005,"김오",80.7);
        // 이상의 방법들로 객체를 생성할 때,비어있는 속성값
        // student1
        students.studentCode = 2025001;
        students.name = "김일";
        students.score = 4.5;
        // student2
        students2.name = "김이";
        students2.score = 100;
        // students3
        students3.name = "김삼";
        students3.studentCode = 2025003;
        // students4
        students4.score = 4.0;

        students.showInfo();
        students2.showInfo();
        students3.showInfo();
        students4.showInfo();
        students5.showInfo();

    }
}
