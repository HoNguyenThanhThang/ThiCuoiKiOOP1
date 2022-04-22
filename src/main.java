import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    static NhapThongTin nhapThongTin = new NhapThongTin();
    public static void main(String[] args)    {
        
        int choose;
        DanhSachHangHoa danhSachHangHoa = new DanhSachHangHoa();
        try {
            String ngayNhapKho = "17-03-2021";
            String ngaySX = "17-03-2020";
            String ngayHetHan = "17-03-2024";
        
            HangHoa hangHoa0 = new HangSanhSu("0001", "chen su", 15_000, 301,dateFormat.parse(ngayNhapKho) , "thang dep trai");
            HangHoa hangHoa1 = new HangDienMay("0002", "day dien",20-000, 2, 12, 220);
            HangHoa hangHoa2 = new HangThucPham("0003","gao", 20_000, 500, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            HangHoa hangHoa3 = new HangSanhSu("0004", "to sanh", 10_000, 84,dateFormat.parse(ngayNhapKho), "thang dep trai");
            HangHoa hangHoa4 = new HangDienMay("0005", "quat cong nghiep", 120_000, 5, 12, 220);
            HangHoa hangHoa5 = new HangThucPham("0006", "rau muong 1kg", 15_000,6, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            HangHoa hangHoa6 = new HangSanhSu("0007", "bat huong",20_000, 7, dateFormat.parse(ngayNhapKho),"thang dep trai");
            HangHoa hangHoa7 = new HangDienMay("0008", "o dien", 20_000, 8,12, 220);
            HangHoa hangHoa8 = new HangThucPham("0009", "trung ga 10 trung",32_000,9,dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            HangHoa hangHoa9 = new HangSanhSu("0010", "binh su", 100_000, 10, dateFormat.parse(ngayNhapKho), "thang dep trai");
            HangHoa hangHoa10 = new HangDienMay("0011", "may quat",110_000, 11, 12, 220);
            danhSachHangHoa.input(hangHoa0);
            danhSachHangHoa.input(hangHoa1);
            danhSachHangHoa.input(hangHoa2);
            danhSachHangHoa.input(hangHoa3);
            danhSachHangHoa.input(hangHoa4);
            danhSachHangHoa.input(hangHoa5);
            danhSachHangHoa.input(hangHoa6);
            danhSachHangHoa.input(hangHoa7);
            danhSachHangHoa.input(hangHoa8);
            danhSachHangHoa.input(hangHoa9);
            danhSachHangHoa.input(hangHoa10);
       
            } catch (Exception e) {
                e.printStackTrace();
            }
        

        do{
            System.out.println("      MENU      ");
            System.out.println("------------------");
            System.out.println("1.Them hang hoa");
            System.out.println("2.In danh sach");
            System.out.println("3.Tim hang hoa");
            System.out.println("4.Xoa hang hoa");
            System.out.println("5.Sua hang hoa");
            System.out.println("6.Thong ke hang hoa");
            System.out.println("7.in hang hoa ");
            
            System.out.println("8.Thoat");
            
            choose = danhSachHangHoa.input.nextInt();
            switch(choose){
                
                case 1: 
                try {
                    HangHoa hangHoa = nhapThongTin.inputHangHoa();
                    danhSachHangHoa.input(hangHoa);
                } catch (Exception e) {
                    e.printStackTrace();
                }
               
               break;
                case 2:
                System.out.println(); danhSachHangHoa.printList();
                break;
                case 3 : 
                danhSachHangHoa.search();
                break;
                case 4: 
                danhSachHangHoa.delete();
                break;
                case 5:
                danhSachHangHoa.input.nextLine();
                System.out.println("Moi nhap ma de sua :");
                String maHang1 = danhSachHangHoa.input.nextLine();
                danhSachHangHoa.suThongTin(maHang1);
                System.out.println("Menu sua thong tin:");
                try {
                    HangHoa hangHoa3HangHoa = nhapThongTin.inputHangHoa();
                    danhSachHangHoa.input(hangHoa3HangHoa);
                } catch (Exception e) {
                }
                
                break;
                
                 
                case 6: danhSachHangHoa.statistical();break;
                case 7 : danhSachHangHoa.arrangeGoods();break;
                case 8:  System.out.println("tam biet");break;
                default: System.out.println("Loi vui long nhap lai!!!");break;
            }
        }while(choose != 9);
        // nhap
       
       
    }
    
}