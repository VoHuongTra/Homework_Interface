package SinhVien;

import Common.Student;
import Interface.IPaymentReceivable;

import java.util.ArrayList;
import java.util.Date;

public class SVDangHoc extends Student implements IPaymentReceivable {

    public float diemTBMoiKyHoc;

    public SVDangHoc(String name, String address, String phone, Date birthday, String maMaSinhVien, Date ngayNhapHoc,float diemTBMoiKyHoc) {
        super(name, address, phone, birthday, maMaSinhVien, ngayNhapHoc);
        this.diemTBMoiKyHoc = diemTBMoiKyHoc;
    }

    @Override
    public void paymentReceivable() {
        if(diemTBMoiKyHoc >= 8.0 ){
            System.out.println("Nhan tro cap hoc bong moi ky hoc");
        }

    }
    public void diemdanh(){

    }
    public void lamBaiTap(){

    }

}
