package empMan;

public class Employee {

    private int empNo;
    private String name;
    private int salary;
    private String dpt;
    private String tel;


    public Employee() {
    }

    public Employee(int empNo, String name, String dpt, String tel, int salary) {
        this.empNo = empNo;
        this.name = name;
        this.dpt = dpt;
        this.tel = tel;
        this.salary = salary;
    }

    public String empToString(){
        return empNo + ", " + name + ", " + dpt + ", " + tel + ", " +salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
