import java.io.IOException;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Email implements Serializable {
    static Scanner sc = new Scanner(System.in);
    public static boolean checkEmail(String email){
        String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (email.matches(EMAIL_REGEX)) return true;
        else return false;
    }
    public static String nhapEmail() throws IOException, ClassNotFoundException {
        System.out.println("Nhập email");
        String email = sc.nextLine();
        if (checkEmail(email)==true){
            return email;
        }
        else {
            System.out.println("Định dạng không đúng");
            System.out.println("1.Nhập lại");
            System.out.println("2.Thoát");
            int check = Integer.parseInt(sc.nextLine());
            switch (check){
                case 1:
                    nhapEmail();
                    break;
                case 2:
                    MenuQuanLyNhanVien.menuQuanLyNhanVien();
                    break;
                default:
                    MenuQuanLyNhanVien.menuQuanLyNhanVien();
            }
        }
        return email;
    }
}
