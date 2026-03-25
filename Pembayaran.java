public interface Pembayaran {
    void bayar(double jumlah);
    String getNamaMetode();
    boolean getStatus();
}