package NhanVien;

import Common.Employee;
import Interface.IPaymentReceivable;

import java.util.Date;

public class LaoCong extends Employee implements IPaymentReceivable {

    public LaoCong(String name, String address, String phone, Date birthday, String maNhanVien) {
        super(name, address, phone, birthday, maNhanVien);
    }

    @Override
    public void paymentReceivable() {
        System.out.println("Nhan luong co dinh moi thang");
    }

    public void donVeSinh() {

    }
}
