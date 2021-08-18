package JDBC_Test.model.vo;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {

    // 필드 변수
    private int memberNo;
    private String id;
    private String passwd;
    private String name;
    private String email;
    private String gender;
    private int age;
    private String phone;
    private Date enrollDate;

    // 생성자
    public Member() { }

    public Member(int memberNo, String id, String passwd, String name, String email, String gender, int age,
                  String phone, Date enrollDate) {
        this.memberNo = memberNo;
        this.id = id;
        this.passwd = passwd;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.enrollDate = enrollDate;
    }

    public Member(String id, String passwd, String name, String email, String gender, int age, String phone,
                  Date enrollDate) {
        super();
        this.id = id;
        this.passwd = passwd;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.enrollDate = enrollDate;
    }

    // 메소드
    @Override
    public String toString() {
        return "Member [memberNo=" + memberNo + ", id=" + id + ", passwd=" + passwd + ", name=" + name + ", email="
                + email + ", gender=" + gender + ", age=" + age + ", phone=" + phone + ", enrollDate=" + enrollDate
                + "]";
    }

    public int getMemberNo() {
        return memberNo;
    }


    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

}