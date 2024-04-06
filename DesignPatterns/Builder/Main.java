package DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Student s=Student.Builder()
                .Id(12)
                .Age(25)
                .GradeYear(2020)
                .Name("Shashank")
                .PhoneNumber("38400292002")
                .UniversityName("Kplhapur")
                .build();

        MessageBuilder m= MessageBuilder.getuilder()
                .Timestamp(837832)
                .Content("4urrjirf")
                .Delivered(true)
                .MessageType(MessageType.TEXT)
                .Recipient("Shashank")
                .Sender("Isha")
                .build();

        System.out.println(m);
    }
}
