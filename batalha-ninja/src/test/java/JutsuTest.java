import org.junit.Assert;
import org.junit.Test;

public class JutsuTest {
    @Test
    public void deveAtribuirOValorMaximoDeChakraSeOValorDeChakraGastoNoJutsuSejaMaiorQueOPermitido() {
        // arrange
        Jutsu jutsu = new Jutsu(100, 10);
        int valorDeChakraEsperado = 5;

        //assert
        Assert.assertEquals(valorDeChakraEsperado, jutsu.getChakra());
    }
    @Test
    public void deveAtribuirOValorMaximoDeDanoSeODanoForMaiorQueOPermitido() {
        //arrange
        Jutsu jutsu = new Jutsu(5, 100);
        int valorDoDanoEsperado = 10;

        //assert
        Assert.assertEquals(valorDoDanoEsperado, jutsu.getDano());
    }
    @Test
    public void deveReceberOValorCorretoDeChakraSeEstiverDentroDoPermitido() {
        //arrange
        Jutsu jutsu = new Jutsu(3, 7);
        int valorDeChakraEsperado = 3;

        //act
        Assert.assertEquals(valorDeChakraEsperado, jutsu.getChakra());
    }
    @Test
    public void deveReceberOValorCorretoDeDanoSeEstiverDentroDoPermitido() {
        //arrange
        Jutsu jutsu = new Jutsu(3, 7);
        int valorDoDanoEsperado = 7;

        //assert
        Assert.assertEquals(valorDoDanoEsperado, jutsu.getDano());
    }
    @Test
    public void deveAtribuirOValorMinimoDeChakraSeOValorDeChakraGastoNoJutsuSejaMenorQueOPermitido() {
        // arrange
        Jutsu jutsu = new Jutsu(0, 10);
        int valorDeChakraEsperado = 1;

        //assert
        Assert.assertEquals(valorDeChakraEsperado, jutsu.getChakra());
    }
    @Test
    public void deveAtribuirOValorMinimoDeDanoSeODanoForMenorQueOPermitido() {
        //arrange
        Jutsu jutsu = new Jutsu(3, -4);
        int valorDoDanoEsperado = 1;

        //assert
        Assert.assertEquals(valorDoDanoEsperado, jutsu.getDano());
    }
}


