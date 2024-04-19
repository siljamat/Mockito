public class FakeHinnoittelija implements IHinnoittelija {
    private float alennus;
    public FakeHinnoittelija(float alennus) {
        this.alennus = alennus;
    }
    public float getAlennusProsentti(Asiakas asiakas, Tuote tuote) {
        return alennus;
    }

    public void setAlennusProsentti(Asiakas asiakas, float prosentti) {
        this.alennus = prosentti;
    }

    public void aloita() {
    }

    public void lopeta() {
    }
}