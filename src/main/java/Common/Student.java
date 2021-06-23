package Common;

import Interface.IPaymentReceivable;

import java.util.Date;

public class Student extends Person {
    public String maMaSinhVien;
    public Date ngayNhapHoc;

    public Student(String name, String address, String phone, Date birthday,String maMaSinhVien,Date ngayNhapHoc) {
        super(name, address, phone, birthday);
        this.maMaSinhVien = maMaSinhVien;
        this.ngayNhapHoc = ngayNhapHoc;
    }
}
