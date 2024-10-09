public class KhachHangNuoc {
    private String hoTen;
    private String soNha;
    private String maSoDongHo;

    public KhachHangNuoc(String hoTen, String soNha, String maSoDongHo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maSoDongHo = maSoDongHo;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSoDongHo() {
        return maSoDongHo;
    }

    public void setMaSoDongHo(String maSoDongHo) {
        this.maSoDongHo = maSoDongHo;
    }
}
