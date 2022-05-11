package BaiKiemTra;

public class Main {

	public static void main(String[] args) {
     Saler NV1BH = new  Saler();
     NV1BH.setName("nguyễn xuân thành ");
     NV1BH.setSalesDoanhSo(332000.0);
     NV1BH.getBonus();
     System.out.println("Name : " + NV1BH.getName() + "DOANH Số : " + NV1BH.getSalesDoanhSo() + "Thưởng : " + NV1BH.getBonus());
     Saler NV2BH = new  Saler();
     NV1BH.setName("trần văn a ");
     NV1BH.setSalesDoanhSo(40000.0);
     NV1BH.getBonus();
     System.out.println("Name : " + NV1BH.getName() + "DOANH Số : " + NV1BH.getSalesDoanhSo() + "Thưởng : " + NV1BH.getBonus());
     Saler NVTT = new Trainee();
     NVTT.setName("nguyễn văn c");
     NVTT.setSalesDoanhSo(50000.0);
     NVTT.getBonus();
     System.out.println("Name : " + NVTT.getName() + "DOANH Số : " + NVTT.getSalesDoanhSo() + "Thưởng : " + NVTT.getBonus());
     
	}

}
