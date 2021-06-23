package NhanVien;

import Common.Employee;
import Interface.IPaymentReceivable;

import java.util.Date;

public class BaoVe extends Employee implements IPaymentReceivable {
    public float chieuCao;
    public float canNang;

    public BaoVe(String name, String address, String phone, Date birthday, String maNhanVien,float chieuCao, float canNang) {
        super(name, address, phone, birthday, maNhanVien);
        this.canNang = canNang;
        this.chieuCao = chieuCao;
    }
    @Override
    public void paymentReceivable() {
        System.out.println("Nhan luong co dinh moi thang");
    }

    public void canUseGun(){
        System.out.println("Co the su dung sung");
    }
    public void kiemTraAnNinhMoiNgay(){

    }
    public void phanChiaLichTrucDem(){

    }
}
