package manajemenbarang;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viandwi24
 */
public class Database {
    public List<Barang> barang = new ArrayList<Barang>();
    public List<Karyawan> karyawan = new ArrayList<Karyawan>();
    
    public Barang[] getBarang()
    {
        return this.barang.toArray(new Barang[this.barang.size()]);
    }
    
    public void addBarang(Barang barang)
    {
        this.barang.add(barang);
    }
    
    public Karyawan[] getKaryawan()
    {
        return this.karyawan.toArray(new Karyawan[this.karyawan.size()]);
    }
    
    public void addKaryawan(Karyawan karyawan)
    {
        this.karyawan.add(karyawan);
    }
}
