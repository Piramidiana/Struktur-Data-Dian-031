import java.util.ArrayList;

public class Tagihan {
    private String judulTagihan;
    private ArrayList<Orang> peserta;
    private ArrayList<Barang> daftarBarang;

    public Tagihan(String judulTagihan) {
        this.judulTagihan = judulTagihan;
        this.peserta = new ArrayList<>();
        this.daftarBarang = new ArrayList<>();
    }

    public void tambahPeserta(Orang o) { peserta.add(o); }
    public void tambahBarang(Barang b) { daftarBarang.add(b); }

    public void tampilRingkasan() {
        System.out.println("\n===== " + judulTagihan + " =====");
        for (Orang o : peserta) {
            System.out.println(o.getNama() +
                " | Tagihan: Rp" + o.getTotalTagihan() +
                " | Lunas: " + (o.getTerbayar() ? "Ya" : "Belum"));
        }
    }

    public static void main(String[] args) {
        Tagihan tagihan = new Tagihan("Split Bill Nongkrong Ciamso"); 

        Orang o1 = new Orang("Michie", "2009");
        Orang o2 = new Orang("Piramidiana", "2006");
        Orang o3 = new Orang("Greesel", "2007");

        Barang b1 = new Barang("Thai Tea", 25000);
        Barang b2 = new Barang("Nasi Hainan", 30000);
        Barang b3 = new Barang("Nasi Goreng Carbonara", 35000);

        o1.addPesanan(b1);
        o2.addPesanan(b2);
        o3.addPesanan(b3);
        
        tagihan.tambahPeserta(o1);
        tagihan.tambahPeserta(o2);
        tagihan.tambahPeserta(o3);
        tagihan.tambahBarang(b1);
        tagihan.tambahBarang(b2);
        tagihan.tambahBarang(b3);
        

       
        o1.bayar(new TransferBank("Jago", "1234567890"));
        o2.bayar(new TransferBank("BCA", "0987654321"));
        o3.bayar(new TransferBank("BRI", "1122334455"));


        tagihan.tampilRingkasan();
    }
}