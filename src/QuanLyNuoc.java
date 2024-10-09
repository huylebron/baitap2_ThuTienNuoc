import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNuoc {
    private ArrayList<BienLaiNuoc> danhSachBienLai;
    private Scanner scanner;

    public QuanLyNuoc() {
        danhSachBienLai = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void nhapThongTin() {
        for (int i = 0; i < 2; i++) {
            try {
                System.out.println("Nhập thông tin cho hộ  thứ " + (i+1) + ":");

                System.out.print("Họ tên  ");
                String hoTen = scanner.nextLine();

                System.out.print("Số nhà: ");
                String soNha = scanner.nextLine();

                System.out.print("Mã số đồng hồ  ");
                String maSoDongHo = scanner.nextLine();

                KhachHangNuoc khachHang = new KhachHangNuoc(hoTen, soNha, maSoDongHo);

                System.out.print("Chỉ số cũ: ");
                int chiSoCu = Integer.parseInt(scanner.nextLine());

                System.out.print("Chỉ số mới: ");
                int chiSoMoi = Integer.parseInt(scanner.nextLine());

                if (chiSoMoi < chiSoCu) {
                    throw new IllegalArgumentException("so moi > so cu !");
                }

                BienLaiNuoc bienLai = new BienLaiNuoc(khachHang, chiSoCu, chiSoMoi);
                danhSachBienLai.add(bienLai);
            } catch (NumberFormatException e) {
                System.out.println("error , phải nhập số integer");
                i--;
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi: " + e.getMessage());
                i--;
            } catch (Exception e) {
                System.out.println("Đã xảy ra lỗi: " + e.getMessage());
                i--;
            }
        }
    }

    public void hienThiThongTin() {
        for (BienLaiNuoc bienLai : danhSachBienLai) {
            KhachHangNuoc bl = bienLai.getKhachHang();
            System.out.println("Họ tên: " + bl.getHoTen());
            System.out.println("Số nhà: " + bl.getSoNha());
            System.out.println("Mã số đồng hồ: " + bl.getMaSoDongHo());
            System.out.println("Chỉ số cũ: " + bienLai.getChiSoCu());
            System.out.println("Chỉ số mới: " + bienLai.getChiSoMoi());
            System.out.println("Tiền nước: " + bienLai.tinhTienNuoc());

        }



    }
    public static void main(String[] args) {
        QuanLyNuoc quanLyNuoc = new QuanLyNuoc();
        quanLyNuoc.nhapThongTin();

        System.out.println("\nThông tin các hộ :");
        quanLyNuoc.hienThiThongTin();
    }

}




