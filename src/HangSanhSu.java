import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HangSanhSu extends HangHoa {
    private Date ngayNhapKho;
    private String nhaSX;
   
    public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTonKho, Date ngayNhapKho, String nhaSX) {
        super(maHang, tenHang, donGia, soLuongTonKho);
        this.ngayNhapKho = ngayNhapKho;
        this.nhaSX = nhaSX;
    }

    public HangSanhSu() {
        
    }
    
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    public String getNhaSX() {
        return nhaSX;
    }
    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }
    @Override
    public double tinhTien() {
        double tien = 0;
        tien = this.getDonGia() * 0.1;
        return tien;
    }
    @Override
    public String toString() {
        return "HangSanhSu " + super.toString()+ "  ngayNhapKho= " + ngayNhapKho + ", nhaSX=" + nhaSX + " thue: " + tinhTien()+ "]";
    }
    @Override
    public void kiemTraHSD() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        HangHoa hangHoa = new HangSanhSu();
        HangSanhSu hangSanhSu  = (HangSanhSu) hangHoa;
        
        Date ngayHienTai = new Date();
        Date date1 = null;
        Date date2 = null;
        try {
            String startDate = simpleDateFormat.format(ngayNhapKho);
            String endDate = simpleDateFormat.format(ngayHienTai);
            date1 = simpleDateFormat.parse(startDate);
            date2 = simpleDateFormat.parse(endDate);
            long getDiff = date2.getTime() - date1.getTime();
          
            long getDaysDiff = getDiff / (24 * 60 * 60 * 1000);
            if(this.getSoLuongTonKho() > 50 && getDaysDiff > 10){
                System.out.println("Hang ban cham");
            }else{
                System.out.println("Hang ban chay");
            }  
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
    }
}