import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuQuanLyNhanVien implements Serializable {
    static Scanner sc = new Scanner(System.in);
    public static void menuQuanLyNhanVien() throws IOException,ClassNotFoundException {
        while (true){
            System.out.println("1.Thêm nhân viên");
            System.out.println("2.Tìm kiếm nhân viên");
            System.out.println("3.Thay đổi trạng thái nhân viên");
            System.out.println("4.Sửa thông tin nhân viên");
            System.out.println("5.Thay đổi trạng thái nhân viên");
            System.out.println("6.Thông tin tài khoản");
            System.out.println("7.Xem danh sách nhân viên");
            System.out.println("8.Đăng xuất");
            int check = Integer.parseInt(sc.nextLine());
            switch (check){
                case 1:
                    QuanLyNhanVien.themNhanVien();
                    DocGhiDanhSachNhanVien.ghiDanhSachNhanVientoShow();
                    System.out.println("Thêm thành công");
                    break;

                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    QuanLyNhanVien.hienThiDanhSachNhanVien();
                    break;
                case 8:
                    System.exit(0);
            }
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
            File file = DocGhiDanhSachNhanVien.file;
            if (file.canRead()) {
                System.out.println("Danh sách nhân viên đang trống , hãy thêm nhân viên mới ");
            }
        menuQuanLyNhanVien();
    }
}
