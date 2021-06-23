package GiangVien;

import Common.Employee;
import Interface.IPaymentReceivable;
import Interface.ITeacherWorkable;

import java.util.Date;

public class CongTacVien extends Employee implements IPaymentReceivable, ITeacherWorkable {
    public Date contractTerm;
    public boolean isFullTime;
    public CongTacVien(String name, String address, String phone, Date birthday, String maNhanVien,Date contractTerm,boolean isFullTime) {
        super(name, address, phone, birthday, maNhanVien);
        this.contractTerm = contractTerm;
        this.isFullTime = isFullTime;
    }

    public Date getContractTerm() {
        return contractTerm;
    }

    public void setContractTerm(Date contractTerm) {
        this.contractTerm = contractTerm;
    }

    @Override
    public void chamCong(){
        System.out.println("Cham cong 1 tuan du 20 tieng");
    }
    @Override
    public void nghiPhep(){
        System.out.println("Cong tac vien khong co ngay nghi phep");
    }

    @Override
    public void paymentReceivable() {
        System.out.println("Nhan luong co dinh moi thang");
    }

    @Override
    public void chambai() {
        System.out.println("Ho tro giang vien cham bai cho sinh vien");
    }

    @Override
    public void soanBaiGiang() {
        System.out.println("Ho tro giang vien soan bai giang");
    }
}
