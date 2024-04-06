package DesignPatterns.Builder;

public class Student {
   private String name;
   private int gradeYear;
   private String phoneNumber;
   private int age;
   private String universityName;
   private int id;

    public Student(String name, int gradeYear, String phoneNumber, int age, String universityName, int id) {
        this.name = name;
        this.gradeYear = gradeYear;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.universityName = universityName;
        this.id = id;
    }
    public  static Builder Builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeYear=" + gradeYear +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", universityName='" + universityName + '\'' +
                ", id=" + id +
                '}';
    }

    public static class Builder{ //take input, validate and return obj
        private String name;
        private int gradeYear;
        private String phoneNumber;
        private int age;
        private String universityName;
        private int id;

        public Builder Name(String name) {
            this.name = name;
            return this;
        }

        public Builder GradeYear(int gradeYear) {
            this.gradeYear = gradeYear;
            return this;
        }

        public Builder PhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder Age(int age) {
            this.age = age;
            return this;
        }

        public Builder UniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder Id(int id) {
            this.id = id;
            return this;
        }

        private void validate(){
            if(this.name==null){
                throw new InvalidNameException();
            }
            if(this.age<18){
                throw new InvalideAgeException();
            }
            if(gradeYear>2021){
                throw new InvalidGradeYearExceptionn();
            }
        }


        public Student build(){
            validate();
            return new Student(this.name,this.gradeYear,this.phoneNumber,this.age,this.universityName,this.id);
        }
    }
}
