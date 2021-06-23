package Common;


import java.util.Date;

public abstract class Employee extends Person {
    public String maNhanVien;

    public Employee(String name, String address, String phone, Date birthday,String maNhanVien) {
        super(name, address, phone, birthday);
        this.maNhanVien = maNhanVien;
    }

    public void chamCong(){

        System.out.println("Nhan vien phai cham cong khi di lam");
    }
    public void nghiPhep(){

        System.out.println("Nhan vien deu duoc nghi phep hang nam");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
