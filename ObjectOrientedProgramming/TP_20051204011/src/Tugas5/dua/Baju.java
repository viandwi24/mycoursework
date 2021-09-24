package Tugas5.dua;

public class Baju extends Pakaian {
    public char kodeWarna = 'U';

    public Baju(Double harga, Integer stock, String keterangan) {
        super();
        setHarga(harga);
        setStock(stock);
        setKeterangan(keterangan);
    }

    public void tampilInformasiBaju() {
        System.out.println("Id Baju: " + getID());
        System.out.println("Keterangan : " + getKeterangan());
        System.out.println("Kode Warna : " + kodeWarna);
        System.out.println("Harga : " + getHarga());
        System.out.println("Stock : " + getStock());
    }
}
