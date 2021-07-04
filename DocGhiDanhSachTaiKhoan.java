import java.io.*;
import java.util.ArrayList;

public class DocGhiDanhSachTaiKhoan implements Serializable{
    static File file = new File("C:\\Users\\david\\IdeaProjects\\QuanLyNhanVien_CaseStudy\\src\\QLTK.txt");

    public static void GhiDanhSachTaiKhoan() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(QuanLytaiKhoan.dsTaiKhoan);
        objectOutputStream.close();
    }

    public static ArrayList<TaiKhoan> DocDanhSachTaiKhoan() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<TaiKhoan> dsTaiKhoanNew = (ArrayList<TaiKhoan>) objectInputStream.readObject();
        return dsTaiKhoanNew;

    }
}
