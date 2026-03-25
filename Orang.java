import java.util.ArrayList;

public class Orang {
    private String nama;
    private String nomor;
    private ArrayList<Barang> daftarPesanan;
    private boolean terbayar;

    public Orang (String nama, String nomor) {
        this.nama = nama;
        this.nomor = nomor;
        this.daftarPesanan = new ArrayList<>();
        this.terbayar = false;
    }

    public void addPesanan(Barang pesanan) {
        daftarPesanan.add(pesanan);
        pesanan.addPemesan(this);
    }

    public double getTotalTagihan() {
        double total = 0;
        for (Barang pesanan : daftarPesanan) {
            total += pesanan.getSplitBill();
        }
        return total;
    }

    public void bayar(Pembayaran method) {
        System.out.println(nama + " telah membayar tagihan sebesar: " + getTotalTagihan());
        method.bayar(getTotalTagihan());
        this.terbayar = true;
    }
public String getNama() {
    return nama;
}
    
public boolean getTerbayar() {
    return terbayar;
}
}