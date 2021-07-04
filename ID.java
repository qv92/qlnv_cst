import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class ID implements Serializable {
    static Scanner sc = new Scanner(System.in);
    public static boolean checkID(int id) throws IOException, ClassNotFoundException {
        if (QuanLyNhanVien.dsNhanVien==null) return true;
        int check =0;
        for (NhanVien nhanVien:QuanLyNhanVien.dsNhanVien) {
            if (nhanVien.getId()==id) check++;
        }
        if (check>0) return false;
        else return true;
    }
    public static int nhapID() throws IOException, ClassNotFoundException {
        System.out.println("Nhập id nhân viên");
        int id = Integer.parseInt(sc.nextLine());
        if (ID.checkID(id)==true){
            return id;
        }
        else {
            System.out.println("ID này đã tồn tại :");
            System.out.println("1.Nhập lại");
            System.out.println("2.Thoát");
            int check = Integer.parseInt(sc.nextLine());
            switch (check){
                case 1:
                    nhapID();
                    break;
                case 2:
                    MenuQuanLyNhanVien.menuQuanLyNhanVien();
                    break;
                default:
                    nhapID();
                    break;
            }
        }
        return id;
    }
}
