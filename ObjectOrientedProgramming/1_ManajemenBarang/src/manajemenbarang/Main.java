package manajemenbarang;

/**
 *
 * @author viandwi24
 */
public class Main {    
    private static Database database = new Database();
    private static Input input = new Input();
    
    public static void main(String[] args)
    {
        menu();
    }
    
    public static void banner()
    {
        System.out.println("===================================");
        System.out.println("===[ APLIKASI MANAJEMEN BARANG ]===");
        System.out.println("===================================");
    }
    
    public static void menu()
    {
        clear();
        banner();
        System.out.println("==[ MENU");
        System.out.println("[1] Barang");
        System.out.println("[2] Karyawan");
        System.out.println("[0] Keluar");
        Integer selectedMenu = input.getInt("Pilih Menu : ");
        switch (selectedMenu)
        {
            case 1:
                barang();
                break;
            case 2:
                karyawan();
                break;
                
            default:
                System.exit(0);
        }
    }
    
    public static void barang()
    {
        clear();
        banner();
        System.out.println("==[ BARANG");
        Barang[] listBarang = database.getBarang();
        if (listBarang.length == 0)
        {
            System.out.println("Tidak ada item.");
        }
        for (int i = 0; i < listBarang.length; i++)
        {
            Barang barang = listBarang[i];
            System.out.println("[" + (i+1) + "] " + barang.getName() + " - Rp" + barang.getCost());
        }
        
        // menu
        System.out.println();
        System.out.println("==[ MENU");
        System.out.println("[1] Tambah");
        System.out.println("[2] Hapus");
        System.out.println("[0] Main Menu");
        Integer selectedMenu = input.getInt("Pilih Menu : ");

        clear();
        banner();
        switch (selectedMenu)
        {
            case 1:
                System.out.println("==[ TAMBAH BARANG");
                Barang barang = new Barang();
                String name = input.get("Nama Barang : ");
                Integer cost = input.getInt("Harga Barang : ");
                barang.setName(name);
                barang.setCost(cost);
                database.addBarang(barang);
                barang();
                break;
                
            case 2:
                System.out.println("==[ HAPUS BARANG");
                Integer number = input.getInt("Nomor Barang Yang Ingin Dihapus : ");
                try {
                    database.barang.remove(number-1);
                } catch (Exception e) {
                    System.out.println("Gagal menghapus");
                }
                barang();
                break;
                
            default:
                menu();
        }
    }
    
    public static void karyawan()
    {
        clear();
        banner();
        
        // menampilkan semua karyawan
        Karyawan[] listKaryawan = database.getKaryawan();
        System.out.println("==[ KARYAWAN");
        if (listKaryawan.length == 0)
        {
            System.out.println("Tidak ada item.");
        }
        for (int i = 0; i < listKaryawan.length; i++)
        {
            Karyawan karyawan = listKaryawan[i];
            System.out.println("[" + (i+1) + "] " + karyawan.getName());
        }
        
        // menu
        System.out.println();
        System.out.println("==[ MENU");
        System.out.println("[1] Tambah");
        System.out.println("[2] Hapus");
        System.out.println("[0] Main Menu");

        clear();
        banner();
        Integer selectedMenu = input.getInt("Pilih Menu : ");
        switch (selectedMenu)
        {
            case 1:
                System.out.println("==[ TAMBAH KARYAWAN");
                Karyawan karyawan = new Karyawan();
                String name = input.get("Nama Karyawan : ");
                karyawan.setName(name);
                database.addKaryawan(karyawan);
                karyawan();
                break;
                
            case 2:
                System.out.println("==[ HAPUS KARYAWAN");
                Integer number = input.getInt("Nomor Karyawan Yang Ingin Dihapus : ");
                try {
                    database.barang.remove(number-1);
                } catch (Exception e) {
                    System.out.println("Gagal menghapus");
                }
                karyawan();
                break;
                
            default:
                menu();
        }
    }

    public static void clear()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
        }
    }
}
