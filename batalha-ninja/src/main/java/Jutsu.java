public class Jutsu {
    private int chakra;
    private int dano;

    public Jutsu (int chakra, int dano) {
        if (chakra > 5) {
            chakra = 5;
        }
        if (chakra <= 0) {
            chakra = 1;
        }
        if (dano > 10) {
            dano = 10;
        }
        if (dano <= 0) {
            dano = 1;
        }

        this.chakra = chakra;
        this.dano = dano;
    }

    public int getDano() {
        return this.dano;
    }
    public int getChakra() {
        return this.chakra;
    }
}
