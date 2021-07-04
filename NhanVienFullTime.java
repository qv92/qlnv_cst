import java.io.Serializable;

public class NhanVienFullTime extends NhanVien implements Serializable {
    public NhanVienFullTime(int id, String tenNhanVien, int tuoiNhanVien, String soDienThoai, String email, int luong, boolean trangThai) {
        super(id, tenNhanVien, tuoiNhanVien, soDienThoai, email, luong, trangThai);
    }

    @Override
    public String toString() {
        return "Nhân Viên FullTime[" + super.toString()+"]";
    }
}
