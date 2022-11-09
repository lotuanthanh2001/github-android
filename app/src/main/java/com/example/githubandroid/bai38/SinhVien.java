package com.example.githubandroid.bai38;

public class SinhVien {
    private String HoTen;
    private String DiaChi;
    private int Namsinh;

    public SinhVien(String hoTen, String diaChi, int namsinh) {
        HoTen = hoTen;
        DiaChi = diaChi;
        Namsinh = namsinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int namsinh) {
        Namsinh = namsinh;
    }

    //    public void SetNamSinh(int ns){
//        if (ns>2004){
//           ns=2004;
//        }
//        Namsinh= ns;
//    }
//    public int GetNamSinh(){
//        return Namsinh;
//    }
}
