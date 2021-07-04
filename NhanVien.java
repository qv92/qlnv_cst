import java.io.Serializable;

public class NhanVien implements Serializable {
    private static final long serialVersionUID = 6433858223774886977L;
    private int id;
    private String tenNhanVien;
    private int tuoiNhanVien;
    private String soDienThoai;
    private String email;
    private int luong;
    private boolean trangThai;


    public NhanVien(int id, String tenNhanVien, int tuoiNhanVien, String soDienThoai, String email, int luong,boolean trangThai) {
        this.id = id;
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.luong = luong;
        this.trangThai = trangThai;
    }

    public NhanVien() {
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public void setTuoiNhanVien(int tuoiNhanVien) {
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return
                "id=" + '\"'+id +'\"'+" "+
                ", tên=" +'\"'+ tenNhanVien + '\"' +" "+
                ", tuổi=" + '\"'+tuoiNhanVien +'\"'+" "+
                ", số điện thoại=" +'\"'+ soDienThoai + '\"' +" "+
                ", email=" + '\"'+email + '\"' +" "+
                ", lương=" +'\"'+luong +'\"'+" "+
                ", trạng thái=" + '\"'+trangThai+'\"' ;
    }
}
