package ch16_objects.teacher;

import java.util.Objects;

public class Teacher {
        private String name;
        private  String SchoolName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Teacher(String name, String schoolName) {
            this.name = name;
            this.SchoolName = schoolName;
        }

        public String getSchoolName() {
            return SchoolName;
        }

        public void setSchoolName(String schoolName) {
            SchoolName = schoolName;
        }

        // toString을 override
        //
        // 로 출력될 수 있게끔 재정의

        @Override
        public String toString() {
            return name + "선생님의 근무지는" +  SchoolName + "입니다.";
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Teacher teacher = (Teacher) o;
            return Objects.equals(name, teacher.name) && Objects.equals(SchoolName, teacher.SchoolName);
        }


        @Override
        public int hashCode() {
            return Objects.hash(name, SchoolName);
        }
}
