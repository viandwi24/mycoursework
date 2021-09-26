package Tugas5.empat;

public class PrivateElevator2 {
    private Boolean bukaPintu = false;
    private Integer lantaiSkrng = 1;
    private int berat = 0;
    private final int KAPASITAS = 1000;
    private final int LANTAI_ATAS = 5;
    private final int LANTAI_BAWAH = 1;

    public void buka() {
        bukaPintu = true;
    }

    public void tutup() {
        hitungKapasitas();
        if (berat <= KAPASITAS) {
            bukaPintu = false;
        } else {
            System.out.println("Kapasitas tidak mencukupi");
            System.out.println("Pintu akan tetap terbuka sampai seseorang keluar");
        }
    }

    public void hitungKapasitas() {
        berat = (int) Math.random() * 1500;
    }

    public void naik() {
        if (!bukaPintu) {
            if (lantaiSkrng < LANTAI_ATAS) {
                lantaiSkrng++;
                System.out.println("Naik ke lantai " + lantaiSkrng);
            } else {
                System.out.println("Lantai sudah mencapai atas");
            }
        } else {
            System.out.println("Pintu masih terbuka");
        }
    }

    public void turun() {
        if (!bukaPintu) {
            if (lantaiSkrng > LANTAI_BAWAH) {
                lantaiSkrng--;
                System.out.println("Turun ke lantai " + lantaiSkrng);
            } else {
                System.out.println("Lantai sudah mencapai bawah");
            }
        } else {
            System.out.println("Pintu masih terbuka");
        }
    }

    public void setLantai(Integer tujuan) {
        if ((tujuan >= LANTAI_BAWAH) && (tujuan <= LANTAI_ATAS)) {
            while (lantaiSkrng != tujuan) {
                if (lantaiSkrng < tujuan) {
                    naik();
                } else {
                    turun();
                }
            }
        } else {
            System.out.println("Lantai tidak valid");
        }
    }

    public Integer getLantai() {
        return lantaiSkrng;
    }

    public Boolean getStatusPintu() {
        return bukaPintu;
    }
}
