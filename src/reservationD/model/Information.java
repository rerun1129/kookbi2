package reservationD.model;

public class Information {

    private String name;
    private String sex;
    private String grade;
    private int number;
    private String time;
    private String departure;
    private String arrival;

    public Information() {
    }

    public Information(String name, String sex, String grade, int number, String time, String departure, String arrival) {
        this.name = name;
        this.sex = sex;
        this.grade = grade;
        this.number = number;
        this.time = time;
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;

    }

    @Override
    public String toString() {
        return "Information{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", grade=" + grade +
                ", number=" + number +
                ", time='" + time + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
