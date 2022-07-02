package Model;

import java.time.LocalDate;

public class DocumentModel extends AbstractModel{
    private String maSoHangHoa;
    private String chuSoHuu;
    private String nhaSanXuat;
    private LocalDate ngayHetHan;
    private String nuocSanXuat;
    private String nuocChuSoHuu;
    private String nhomSanPham;
    private String loaiSanPham;
    private String maSoBaoHiemXaHoi;
    private String soChungTuNhaSanXuat;
    private String soChungTuHL;

    public String getMaSoHangHoa() {
        return maSoHangHoa;
    }

    public void setMaSoHangHoa(String maSoHangHoa) {
        this.maSoHangHoa = maSoHangHoa;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getNuocSanXuat() {
        return nuocSanXuat;
    }

    public void setNuocSanXuat(String nuocSanXuat) {
        this.nuocSanXuat = nuocSanXuat;
    }

    public String getNuocChuSoHuu() {
        return nuocChuSoHuu;
    }

    public void setNuocChuSoHuu(String nuocChuSoHuu) {
        this.nuocChuSoHuu = nuocChuSoHuu;
    }

    public String getNhomSanPham() {
        return nhomSanPham;
    }

    public void setNhomSanPham(String nhomSanPham) {
        this.nhomSanPham = nhomSanPham;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public String getMaSoBaoHiemXaHoi() {
        return maSoBaoHiemXaHoi;
    }

    public void setMaSoBaoHiemXaHoi(String maSoBaoHiemXaHoi) {
        this.maSoBaoHiemXaHoi = maSoBaoHiemXaHoi;
    }

    public String getSoChungTuNhaSanXuat() {
        return soChungTuNhaSanXuat;
    }

    public void setSoChungTuNhaSanXuat(String soChungTuNhaSanXuat) {
        this.soChungTuNhaSanXuat = soChungTuNhaSanXuat;
    }

    public String getSoChungTuHL() {
        return soChungTuHL;
    }

    public void setSoChungTuHL(String soChungTuHL) {
        this.soChungTuHL = soChungTuHL;
    }
}
