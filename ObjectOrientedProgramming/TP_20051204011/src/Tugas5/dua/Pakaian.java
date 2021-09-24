/*
 * @author viandwi24
 */
package Tugas5.dua;

public class Pakaian {
    private int ID = 0;
    private String keterangan = "";
    private Double harga = 0.0;
    private Integer stock = 0;
    private static Integer UNIQUE_ID = 0;

    public Pakaian() {
        ID = UNIQUE_ID++;
    }

    public Integer getID() {
        return ID;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
