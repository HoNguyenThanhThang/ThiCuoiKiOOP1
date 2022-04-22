import java.text.ParseException;
import java.util.Comparator;

public  class HangHoa implements Comparator<HangHoa> {
    static HangHoa hangHoa = new HangHoa();
    private String maHang;
    private String tenHang;
    private double donGia;
    private int soLuongTonKho;
    

    public  double tinhTien(){
        return 0;
    };
    public void kiemTraHSD() throws ParseException{

    };
  
    public static HangHoa getHangHoa() {
        return hangHoa;
    }
    public static void setHangHoa(HangHoa hangHoa) {
        HangHoa.hangHoa = hangHoa;
    }
    public HangHoa(String maHang, String tenHang, double donGia, int soLuongTonKho) {
        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setSoLuongTonKho(soLuongTonKho);
        
    }


    public HangHoa() {
    }
    @Override
    public String toString() {
        return " [ Ma hang = " + maHang + ", So luong = " + soLuongTonKho + ", Ten hang = " + tenHang + " Gia = " + donGia ;
    }
    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) {
        if(maHang != null ){
            this.maHang = maHang;
        }else{
            System.out.println("Khong duoc de trong ma hang !!!!");
        }
    }
    
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        if(tenHang != null){
            this.tenHang = tenHang;
        }else{
            System.out.println("Khong duoc de trong ten san pham!!!!");
        }
        
    }
    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }
    public void setSoLuongTonKho(int soLuongTonKho) {
        if(soLuongTonKho >= 0){
            this.soLuongTonKho = soLuongTonKho;
        }else{
            System.out.println("So luong ton kho phai lon hon 0!!!");
        }
           
    } 

    public double getDonGia() {
        return donGia;
    }


    public void setDonGia(double donGia) {
        if(donGia >0){
            this.donGia = donGia;
        }else{
            System.out.println("Gia phai lon hon 0!!!");
        }
    }
    
    @Override
    public int compare(HangHoa o1, HangHoa o2) {
        return o1.getMaHang().compareTo(o2.getMaHang()) ;
    }
     
}