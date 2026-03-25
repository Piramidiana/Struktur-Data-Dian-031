public class TransferBank implements Pembayaran {
    private String namaBank;
    private String nomorRekening;
    private boolean statusTransfer;

    public TransferBank(String namaBank, String nomorRekening) {
        this.namaBank = namaBank;
        this.nomorRekening = nomorRekening;
        this.statusTransfer = false;
    }

    public void bayar(double jumlah) {
        System.out.println("Transfer Rp" + jumlah + " via " + namaBank);
        System.out.println("No. Rekening: " + nomorRekening);
        this.statusTransfer = true;
    }

    public String getNamaMetode() { return "Transfer Bank - " + namaBank; }
    public boolean getStatus() { return statusTransfer; }
}