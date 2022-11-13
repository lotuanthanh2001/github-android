package com.example.githubandroid.Recyclerview;

public class DataShop {
    private int Hinhanh;
    private String Ten;

    public DataShop(int hinhanh, String ten) {
        Hinhanh = hinhanh;
        Ten = ten;
    }

    public int getHinhanh() {
        return Hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        Hinhanh = hinhanh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }
}
