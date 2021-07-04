import java.io.Serializable;

public class NhanVienPartTime extends NhanVien implements Serializable {
    private int soGioLamViec;

    public NhanVienPartTime(int id, String tenNhanVien, int tuoiNhanVien, String soDienThoai, String email, int luong, boolean trangThai, int soGioLamViec) {
        super(id, tenNhanVien, tuoiNhanVien, soDienThoai, email, luong, trangThai);
        this.soGioLamViec = soGioLamViec;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public String toString() {
        return "Nhân Viên PartTime[" + super.toString() +" "+
                ", số giờ làm việc=" + '\"'+soGioLamViec+'\"'+"]";
    }
}
