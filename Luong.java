import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Luong implements Serializable {
    static Scanner sc = new Scanner(System.in);
    public static int nhapLuong() throws IOException, ClassNotFoundException {
       while (true){
           try{
               System.out.println("Nhập lương");
               int luong = Integer.parseInt(sc.nextLine());
               return luong;
           }catch (Exception e){
               System.out.println("Không đúng định dạng");
               System.out.println("1.Nhập lại");
               System.out.println("2.Thoát");
               int check = Integer.parseInt(sc.nextLine());
               switch (check){
                   case 1:
                       nhapLuong();
                       break;
                   case 2:
                       MenuQuanLyNhanVien.menuQuanLyNhanVien();
                       break;
                   default:
                       MenuQuanLyNhanVien.menuQuanLyNhanVien();
               }
           }
       }
    }
}
