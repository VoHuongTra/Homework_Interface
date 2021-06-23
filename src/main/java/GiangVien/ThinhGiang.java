package GiangVien;


import Common.Employee;
import Interface.IPaymentReceivable;
import Interface.ITeacherWorkable;

import java.util.Date;

public class ThinhGiang extends Employee implements IPaymentReceivable, ITeacherWorkable {

    public boolean isFullTime;

    public ThinhGiang(String name, String address, String phone, Date birthday, String maNhanVien,boolean isFullTime) {
        super(name, address, phone, birthday, maNhanVien);
        this.isFullTime = isFullTime;
    }

    @Override
    public void chamCong(){
        System.out.println("Cham cong theo so buoi day/tuan");
    }
    @Override
    public void nghiPhep(){
        System.out.println("Thinh giang khong co nghi phep");
    }

    @Override
    public void paymentReceivable() {
        System.out.println("Nhận lương cố định mỗi tháng theo số buổi dạy + tiền ăn trưa ở cangtin");
    }
    @Override
    public void chambai() {
        System.out.println("Ra de kiem tra va cham bai sau moi buoi hoc");
    }

    @Override
    public void soanBaiGiang() {
        System.out.println("Bat buoc soan bai giang moi khi len lop");
    }
}
