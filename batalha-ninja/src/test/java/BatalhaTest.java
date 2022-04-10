import org.junit.Assert;
import org.junit.Test;

public class BatalhaTest {
    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi() {
        // arrange
        Jutsu amaterasu = new Jutsu(3,10);
        Ninja ninjaUm = new Ninja("Itachi", amaterasu);
        Jutsu rasengan = new Jutsu(5, 4);
        Ninja ninjaDois = new Ninja("Naruto", rasengan);
        Batalha batalha = new Batalha();

        // act
        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        // assert
        Assert.assertSame(ninjaUm, ninjaVencedor);
    }
    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi() {
        // arrange
        Jutsu rasengan = new Jutsu(5, 4);
        Ninja ninjaUm = new Ninja("Naruto", rasengan);
        Jutsu amaterasu = new Jutsu(5,10);
        Ninja ninjaDois = new Ninja("Itachi", amaterasu);
        Batalha batalha = new Batalha();

        // act
        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        // assert
        Assert.assertSame(ninjaDois, ninjaVencedor);
    }
    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra() {
        // arrange
        Jutsu rasengan = new Jutsu(5, 5);
        Ninja ninjaUm = new Ninja("Naruto", rasengan);
        Jutsu chidori = new Jutsu(3,9);
        Ninja ninjaDois = new Ninja("Sasuke", chidori);
        Batalha batalha = new Batalha();

        // act
        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        // assert
        Assert.assertSame(ninjaDois, ninjaVencedor);
    }
    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar() {
        // arrange
        Jutsu rasengan = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("Naruto", rasengan);
        Jutsu chidori = new Jutsu(5,10);
        Ninja ninjaDois = new Ninja("Sasuke", chidori);
        Batalha batalha = new Batalha();

        // act
        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        // assert
        Assert.assertSame(ninjaUm, ninjaVencedor);
    }
}
