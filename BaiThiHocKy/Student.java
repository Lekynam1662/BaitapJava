package thi_hoc_ky.bai_1;

import java.util.Date;

public class Student extends Person {
    String studentID;
    String major;
    Date enrolledDate;
    public Student(String name, Date birthday, byte gender) {
        super(name, birthday, gender);
    }

    public Student(String name, Date birthday, byte gender, String studentID, String major, Date enrolledDate) {
        super(name, birthday, gender);
        this.studentID = studentID;
        this.major = major;
        this.enrolledDate = enrolledDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", major='" + major + '\'' +
                ", enrolledDate=" + enrolledDate +
                '}';
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Date getBirthday() {
        return super.getBirthday();
    }

    @Override
    public void setBirthday(Date birthday) {
        super.setBirthday(birthday);
    }

    @Override
    public byte getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(byte gender) {
        super.setGender(gender);
    }
}
