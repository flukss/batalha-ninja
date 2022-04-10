public class Ninja {
    private String nome;
    private int chakra = 100;
    private Jutsu jutsuPrincipal;

    public Ninja (String nome, Jutsu jutsuPrincipal) {
        this.nome = nome;
        this.jutsuPrincipal = jutsuPrincipal;
    }

    public void receberGolpe (int dano) {
        this.chakra = this.chakra - dano;
    }
    public void atacar (Ninja ninjaOponente) {
        this.chakra = this.chakra - this.jutsuPrincipal.getChakra();
        ninjaOponente.receberGolpe(this.jutsuPrincipal.getDano());
    }
    public String getNome() {
        return nome;
    }
    public int getChakra() {
        return chakra;
    }
}
