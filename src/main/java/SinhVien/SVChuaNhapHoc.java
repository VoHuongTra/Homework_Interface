package SinhVien;

import Common.Student;
import Interface.IPaymentReceivable;

import java.util.Date;

public class SVChuaNhapHoc extends Student implements IPaymentReceivable {

    public float diemDauVao;

    public SVChuaNhapHoc(String name, String address, String phone, Date birthday, String maMaSinhVien, Date ngayNhapHoc,float diemDauVao) {
        super(name, address, phone, birthday, maMaSinhVien, ngayNhapHoc);
        this.diemDauVao = diemDauVao;
    }

    @Override
    public void paymentReceivable() {
        if(diemDauVao >= 8.0){
            System.out.println("Nhan tro cap hoc bong ky dau tien");
        }
    }
    public void hoanThienThongTinSV(){

    }
    public void moTheNganHang(){

    }
}
