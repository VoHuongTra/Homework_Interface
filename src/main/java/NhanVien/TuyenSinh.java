package NhanVien;

import Common.Employee;
import Interface.IPaymentReceivable;

import java.util.Date;

public class TuyenSinh extends Employee implements IPaymentReceivable {

    public TuyenSinh(String name, String address, String phone, Date birthday, String maNhanVien) {
        super(name, address, phone, birthday, maNhanVien);
    }

    @Override
    public void paymentReceivable() {
        System.out.println("Nhan luong co dinh + hoa hong + phu cap haot dong ngoai khoa");
    }
    public void toChucSuKienTS(){

    }
    public void tuVanTuyenSinh(){

    }

}
