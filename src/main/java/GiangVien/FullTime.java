package GiangVien;

import Common.Employee;
import Interface.IPaymentReceivable;
import Interface.ITeacherWorkable;


import java.util.Date;

public class FullTime extends Employee implements IPaymentReceivable, ITeacherWorkable {

    public int teacherLevel;

    public FullTime(String name, String address, String phone, Date birthday, String maNhanVien,int teacherLevel) {
        super(name, address, phone, birthday, maNhanVien);
        this.teacherLevel = teacherLevel;
    }
    @Override
    public void chamCong(){
        System.out.println("Cham cong 1 tuan du 40 tieng");
    }
    @Override
    public void nghiPhep(){
        System.out.println("Giang vien full time duoc nghi phep 1 nam 12 ngay");
    }

    @Override
    public void paymentReceivable() {
        System.out.println("Nhận lương cố định mỗi tháng + trợ cấp ăn trưa ở căng tin + trợ cấp thi chứng chỉ + trợ cấp hoạt động ngoại khoa");
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
