package com.example.habib.savemoney.ModelData;

/**
 * Created by robi on 12/5/2018.
 */

public class Transaksi {
    private String nominal, keperluan, jenis;

    public Transaksi(String nominal, String keperluan, String jenis) {
        this.nominal = nominal;
        this.keperluan = keperluan;
        this.jenis = jenis;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public String getKeperluan() {
        return keperluan;
    }

    public void setKeperluan(String keperluan) {
        this.keperluan = keperluan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
