

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NhapThongTin   {
    static  
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    static HangHoa hangHoa = new HangSanhSu();
    public Scanner input = new Scanner(System.in);

    public HangHoa inputHangHoa() throws ParseException  {
        int choose;
        HangHoa hangHoa = null;
        System.out.println("Vui long chon loai hang");
        System.out.println("-------------------------------------");
        System.out.println("1.Han sanh su ");
        System.out.println("2.Do dien tu");
        System.out.println("3.Thuc pham");
        System.out.println("4.thoat");
        System.out.println("Vui long chon:");
        choose = input.nextInt();
        switch(choose){
            case 1:
            input.nextLine();
            System.out.println("nhap ma san pham :");
            String commodityCodes = input.nextLine();
            System.out.println("nhap ten san pham:");
            String goodsName =input.nextLine();
            System.out.println("Nhap gia san pham:");
            Double price = input.nextDouble();
            System.out.println("Nhap so luong hang ton kho:");
            int quantityInStock = input.nextInt();
            System.out.println("Nhap ngay thang nam theo dinh dang dd-MM-yyyy: ");
            
            String date = input.next();
           
            Date date2 = null;
            try {
                date2 = dateFormat.parse(date);
                input.nextLine();
                System.out.println("Nhap nha san xuat:");
                String nhaSX = input.nextLine();
                hangHoa = new HangSanhSu(commodityCodes, goodsName, price, quantityInStock, dateFormat.parse(date), nhaSX);
            } catch (ParseException e) {
                e.printStackTrace();
            }
           
            break;
            case 2: 
            input.nextLine();
            System.out.println("nhap ma san pham:");
            String commodityCodes2 = input.nextLine();
            System.out.println("nhap ten san pham:");
            String goodsName2 =input.nextLine();
            System.out.println("nhap gia san pham:");
            Double price2 = input.nextDouble();
            System.out.println("nhap so luong hang trong kho:");
            int quantityInStock2 = input.nextInt();
            System.out.println("nhap so thang bao hanh:");
            int thoiGianBaoHanhTheoThang = input.nextInt();
            System.out.println("Enter capacity:");
            double congSuat = input.nextDouble();
            hangHoa = new HangDienMay(commodityCodes2, goodsName2, price2, quantityInStock2, thoiGianBaoHanhTheoThang, congSuat);
            
            break;
            case 3:
            input.nextLine();
            System.out.println("nhap ma san pham:");
            String commodityCodes3 = input.nextLine();
            System.out.println("nhap ten san pham:");
            String goodsName3 =input.nextLine();
            System.out.println("nhap gia san pham:");
            Double price3 = input.nextDouble();
            System.out.println("nhap so luong hang trong kho:");
            int quantityInStock3 = input.nextInt();
            input.nextLine();
            System.out.println("nhap ngay san xuat theo dd-MM-yyyy: ");
            String ngaySX = input.nextLine();
            Date date3 = null;
            try {
                //Parsing the String
                date3 = dateFormat.parse(ngaySX);
               } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("nhap han san pham theo dd-MM-yyyy: ");
            String ngayHetHan = input.nextLine();
            try {
                date2 = dateFormat.parse(ngayHetHan);
               
            } catch (Exception e) {
                e.printStackTrace();
            }
           hangHoa = new HangThucPham(commodityCodes3, goodsName3, price3, quantityInStock3, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            break;
            case 4: System.out.println("hen gap lai!!!"); break;
            default: System.out.println("lua chon da sai vui long nhap lai!!!");
        }

    
            return hangHoa;
       
    }
    
    
}