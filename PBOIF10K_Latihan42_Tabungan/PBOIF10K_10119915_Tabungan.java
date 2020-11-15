/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Menampilkan output saldo tabungan
 */
public class Tabungan {
    
private final int saldo;
    
    
    public Tabungan(int saldo) {  
      this.saldo = saldo;
    }

    public int ambilUang (int jumlah){
        return saldo - jumlah;
    }
    
}