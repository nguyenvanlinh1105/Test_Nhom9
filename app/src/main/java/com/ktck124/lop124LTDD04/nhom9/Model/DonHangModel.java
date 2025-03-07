package com.ktck124.lop124LTDD04.nhom9.Model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class DonHangModel {
    private String idDonHang;
    private String idNguoiDung;
    private String tinhTrang; //Trạng thái
    private String idDiaChi;
    private Date ngayTao;
    private Date ngayHuyDonhang;


    public Date getNgayHuyDonhang() {
        return ngayHuyDonhang;
    }

    public void setNgayHuyDonhang(Date ngayHuyDonhang) {
        this.ngayHuyDonhang = ngayHuyDonhang;
    }

    private Timestamp thoiGianCapNhat;
    // Navigation properties
    private NguoiDungModel nguoiDung;
    private List<ChiTietDonHangModel> chiTietDonHangs;

    public String getIdDonHang() {
        return idDonHang;
    }

    public void setIdDonHang(String idDonHang) {
        this.idDonHang = idDonHang;
    }

    public String getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdNguoiDung(String idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Timestamp getThoiGianCapNhat() {
        return thoiGianCapNhat;
    }

    public void setThoiGianCapNhat(Timestamp thoiGianCapNhat) {
        this.thoiGianCapNhat = thoiGianCapNhat;
    }

    public String getIdDiaChi() {
        return idDiaChi;
    }

    public void setIdDiaChi(String idDiaChi) {
        this.idDiaChi = idDiaChi;
    }

    public NguoiDungModel getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDungModel nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public List<ChiTietDonHangModel> getChiTietDonHangs() {
        return chiTietDonHangs;
    }

    public void setChiTietDonHangs(List<ChiTietDonHangModel> chiTietDonHangs) {
        this.chiTietDonHangs = chiTietDonHangs;
    }
}