package Tuan_1;

public class HinhTron {
    private double banKinh;
    private ToaDo tam;
    public static final double PI = 3.1416; 

   
    public HinhTron() {
        this.banKinh = 0.0;
        this.tam = new ToaDo();
    }

    
    public HinhTron(ToaDo tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    // Getter và Setter
    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh >= 0) {
            this.banKinh = banKinh;
        } else {
            System.out.println("Ban kinh khong duoc nho hon 0!");
        }
    }

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

  
    public double tinhChuVi() {
        return 2 * PI * banKinh;
    }

  
    public double tinhDienTich() {
        return PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return String.format("Hinh tron co tam %s, ban kinh %.2f | Chu vi: %.2f | Dien tich: %.2f", 
                tam.toString(), banKinh, tinhChuVi(), tinhDienTich());
    }
}
