public class Batalha {

    public Ninja lutar (Ninja ninjaUm, Ninja ninjaDois) {
        if (ninjaUm.getNome().equalsIgnoreCase("itachi")) { // Checagem de excessão
            return ninjaUm;
        }
        if (ninjaDois.getNome().equalsIgnoreCase("itachi")) { // Checagem de excessão
            return ninjaDois;
        }
        ninjaUm.atacar(ninjaDois);
        ninjaUm.atacar(ninjaDois);
        ninjaUm.atacar(ninjaDois);

        ninjaDois.atacar(ninjaUm);
        ninjaDois.atacar(ninjaUm);
        ninjaDois.atacar(ninjaUm);

        if (ninjaUm.getChakra() >= ninjaDois.getChakra()) {
            return ninjaUm;
        }
            return ninjaDois;
    }
}

