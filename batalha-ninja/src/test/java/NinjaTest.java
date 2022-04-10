import org.junit.Assert;
import org.junit.Test;

public class NinjaTest {
    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar() {
        // Arrange
        Jutsu rasengan = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Naruto", rasengan);
        Jutsu sabakuKyu = new Jutsu(3, 8);
        Ninja ninjaOponente = new Ninja("Gaara", sabakuKyu);
        int nivelChakraEsperado = 90;

        // Act
        ninjaAtacante.atacar(ninjaOponente);

        // Assert
        Assert.assertEquals(nivelChakraEsperado, ninjaOponente.getChakra());
    }


}
