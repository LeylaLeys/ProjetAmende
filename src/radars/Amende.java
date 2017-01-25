package radars;

/**
 * Created by Leys on 25/01/2017.
 */
import java.io.Serializable;

public class Amende implements Serializable {
    private static int numero_ = 0;
    private int numero;
    private String immatriculation;
    private int tarif;
    private boolean payee = false;

    public Amende() { super(); }

    public Amende(String immatriculation, int tarif) {
        numero_++;
        numero = numero_;
        this.immatriculation = immatriculation;
        this.tarif = tarif;
    }

    public int getNumero() {
        return numero;
    }
    public String getImmatriculation() {
        return immatriculation;
    }
    public int getTarif() { return tarif; }

    public void setNumero(int numero) { this.numero = numero; }
    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }
    public void setTarif(int tarif) { this.tarif = tarif; }

    @Override
    public String toString() {
        return String.format("Amende n°%d de %d EUR pour %s",numero,tarif,immatriculation);
    }

    public boolean isPayee() {
        return payee;
    }

    public void setPayee(boolean payee) {
        this.payee = payee;
    }
}
