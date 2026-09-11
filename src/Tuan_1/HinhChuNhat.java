package Tuan_1;

public class HinhChuNhat {

	private double chieuDai;
	private double chieuRong;
	
	
	public double getchieuDai() {
		return chieuDai;
	}
	
	public double getchieuRong() {
		return chieuRong;
	}
	
	
	public void setHCN(double cD, double cR) throws Exception {
	    if (cD > 0) {
	        this.chieuDai = cD;
	    } else {
	        throw new Exception("cD phải > 0");
	    }

	    if (cR > 0) {
	        this.chieuRong = cR;
	    } else {
	        throw new Exception("cR phải > 0");
	    }
	}

	
	public double dienTich() {
		return this.chieuDai * this.chieuRong;
	}
	
	public double chuVi() {
		return 2 * (this.chieuDai + this.chieuRong);
	}
	
public static void main(String[] args) {
	HinhChuNhat h1 = new HinhChuNhat();
	 try {
         h1.setHCN(4, 2);

         System.out.println("Chieu dai la: " + h1.getchieuDai());
         System.out.println("Chieu rong la: " + h1.getchieuRong());
         System.out.println("Chu vi la: " + h1.chuVi());
         System.out.println("Dien tich la: " + h1.dienTich());

     } catch (Exception e) {
         System.out.println(e.getMessage());
     }
 }
}