import java.io.IOException;
import java.io.Serializable;

public class KiemTraTaiKhoan implements Serializable {
    public static boolean kiemTraTaiKhoanMoi(String tenTaiKhoan) throws IOException, ClassNotFoundException {
        boolean check=true;

        for(TaiKhoan taiKhoan : DocGhiDanhSachTaiKhoan.DocDanhSachTaiKhoan()){
            if (taiKhoan.getTenTaiKhoan().equals(tenTaiKhoan)){
                return false;
            }
        }
        return check;
    }
    public static boolean kiemTraTaiKhoanCu(String tenTaiKhoan,String matKhau) throws IOException, ClassNotFoundException {
        int check=0;

        for(TaiKhoan taiKhoan : DocGhiDanhSachTaiKhoan.DocDanhSachTaiKhoan()){
            if (taiKhoan.getTenTaiKhoan().equals(tenTaiKhoan)&&taiKhoan.getMatKhau().equals(matKhau)){
                check++;
            }
        }
        if (check>0) return true;
        else return false;

    }

}
