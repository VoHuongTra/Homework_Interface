package SinhVien;

import Common.Student;
import Interface.IPaymentReceivable;

import java.util.Date;

public class SVDaTotNghiep extends Student implements IPaymentReceivable {

    public Date ngayRaTruong;
    public float diemTbTotNghiep;

    public SVDaTotNghiep(String name, String address, String phone, Date birthday, String maMaSinhVien, Date ngayNhapHoc,Date ngayRaTruong,float diemTbTotNghiep) {
        super(name, address, phone, birthday, maMaSinhVien, ngayNhapHoc);
        this.ngayRaTruong = ngayRaTruong;
        this.diemTbTotNghiep = diemTbTotNghiep;
    }

    @Override
    public void paymentReceivable() {
        if(diemTbTotNghiep >= 7.0){
            System.out.println("Tro cap hoc bong thac sy cho sv ra truong");
        }
    }
    public void lamSurveyDanhgiaTruongDH() {

    }
}
