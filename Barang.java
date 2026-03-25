import java.util.ArrayList;

public class Barang {
    private String pesanan;
    private String name;
    private double harga;
    private ArrayList<Orang> daftarPemesan;


public Barang (String NamaPesanan, double harga) {
    this.pesanan = NamaPesanan;
    this.name = NamaPesanan;
    this.harga = harga;
    this.daftarPemesan = new ArrayList<>();
}

public void addPemesan(Orang pemesan) {
    daftarPemesan.add(pemesan);}

    public double getSplitBill() {
        if (daftarPemesan.isEmpty()) return harga; // Jika tidak ada pemesan, kembalikan harga penuh
        return harga / daftarPemesan.size();
    }

    public String getName () {
        return name;
    }
    public double getHarga() {
        return harga;
    }
    public int getJumlahPemesan() {
        return daftarPemesan.size();
    }

}