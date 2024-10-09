public class BienLaiNuoc {
    private KhachHangNuoc khachHang;
    private int chiSoCu;
    private int chiSoMoi;

    public BienLaiNuoc(KhachHangNuoc khachHang, int chiSoCu, int chiSoMoi) {
        this.khachHang = khachHang;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public int tinhTienNuoc() {
        return (chiSoMoi - chiSoCu) * 25000;
    }

    public KhachHangNuoc getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHangNuoc khachHang) {
        this.khachHang = khachHang;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }
}
