import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocGhiDanhSachNhanVien implements Serializable {
    static String ten, sdt, email;
    static int id, tuoi, luong, soGioLamViec;
    static boolean trangThai;
    static File file_obj = new File("C:\\Users\\david\\IdeaProjects\\QuanLyNhanVien_CaseStudy\\src\\QLNV.txt");
    static File file = new File("C:\\Users\\david\\IdeaProjects\\QuanLyNhanVien_CaseStudy\\src\\QLNV_Show.txt");
    static Pattern patternFullTime = Pattern.compile("^Nhân Viên FullTime\\[id=\"(.*?)\" , tên=\"(.*?)\" , tuổi=\"(.*?)\" , số điện thoại=\"(.*?)\" , email=\"(.*?)\" ,  lương=\"(.*?)\" , trạng thái=\"(.*?)\"]$", Pattern.CASE_INSENSITIVE);
    static Pattern patternPartTime = Pattern.compile("^Nhân Viên PartTime\\[id=\"(.*?)\" , tên=\"(.*?)\" , tuổi=\"(.*?)\" , số điện thoại=\"(.*?)\" , email=\"(.*?)\" , lương=\"(.*?)\" , trạng thái=\"(.*?)\" , số giờ làm viêc=\"(.*?)\"]$", Pattern.CASE_INSENSITIVE);

    public static void ghiDanhSachNhanVientoShow() throws IOException {
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (NhanVien nhanVien : QuanLyNhanVien.dsNhanVien) {
            bufferedWriter.write(nhanVien.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    //    public static void ghiDanhSachNhanVienObj() throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream(file_obj,false);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(QuanLyNhanVien.dsNhanVien);
//        objectOutputStream.close();
//    }
//    public static ArrayList<NhanVien> docDanhSachNhanVienObj() throws IOException, ClassNotFoundException {
//        ArrayList<NhanVien> dsNhanVienObj=null;
//        if (file_obj==null){
//            System.out.println("Danh sach rong");
//            QuanLyNhanVien.themNhanVien();
//        }
//        else {
//            FileInputStream fileInputStream = new FileInputStream(file_obj);
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            dsNhanVienObj = (ArrayList<NhanVien>) objectInputStream.readObject();
//            objectInputStream.close();
//
//        }
//        return dsNhanVienObj;
//    }
    public static ArrayList<NhanVien> docFileDanhSachNhanVien() throws FileNotFoundException, IOException {
        ArrayList<NhanVien> ds = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
        if (line.contains("FullTime")){
            Pattern pattern = Pattern.compile("id=\"(.*?)\" , tên=\"(.*?)\" , tuổi=\"(.*?)\" , số điện thoại=\"(.*?)\" , email=\"(.*?)\" , lương=\"(.*?)\" , trạng thái=\"(.*?)\"");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
            id = Integer.parseInt(matcher.group(1));
            ten = matcher.group(2);
            tuoi = Integer.parseInt(matcher.group(3));
            sdt = matcher.group(4);
            email=matcher.group(5);
            luong=Integer.parseInt(matcher.group(6));
            trangThai=Boolean.parseBoolean(matcher.group(7));}
            NhanVien nhanVien = new NhanVienFullTime(id,ten,tuoi,sdt,email,luong,trangThai);
            ds.add(nhanVien);
        }
            if (line.contains("PartTime")){
                Pattern pattern = Pattern.compile("id=\"(.*?)\" , tên=\"(.*?)\" , tuổi=\"(.*?)\" , số điện thoại=\"(.*?)\" , email=\"(.*?)\" , lương=\"(.*?)\" , trạng thái=\"(.*?)\" , số giờ làm việc=\"(.*?)\"");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    id = Integer.parseInt(matcher.group(1));
                    ten = matcher.group(2);
                    tuoi = Integer.parseInt(matcher.group(3));
                    sdt = matcher.group(4);
                    email=matcher.group(5);
                    luong=Integer.parseInt(matcher.group(6));
                    trangThai=Boolean.parseBoolean(matcher.group(7));
                    soGioLamViec=Integer.parseInt(matcher.group(8));
                }
                NhanVien nhanVien = new NhanVienPartTime(id,ten,tuoi,sdt,email,luong,trangThai,soGioLamViec);
                ds.add(nhanVien);
            }
        }
        bufferedReader.close();
        return ds;
    }

    public static void main(String[] args) throws IOException {
        docFileDanhSachNhanVien();
    }
}
