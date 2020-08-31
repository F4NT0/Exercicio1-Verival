package F4NT0;

/**
 * Autor: Gabriel Fanto Stundner
 * Dificuldade: Não consegui colocar o novo POM.xml e fazer funcionar
 */

import static org.junit.Assert;
import org.junit.Test;

import jdk.internal.jline.internal.TestAccessible;

import org.junit.BeforeEach;


public class AppTest 
{
    // @BeforeEach
    // public void initiate(){
    //     App teste = new App();
    // }

    @Test
    public void shouldBeFourBarsOneKg(){
        App teste = new App();
        int[] expected = {0,4};
        int[] result = teste.qtdadeBarras(4);
        Assert.assertArrayEquals(expected,result);
    }

    @Test
    public void shouldBeOneBarFiveKg(){
        App teste = new App();
        int[] expected = {1,0};
        int[] result = teste.qtdadeBarras(5);
        Assert.assertArrayEquals(expected,result);
    }

    @Test
    public void shouldBeFiveBarFiveKg(){
        App teste = new App();
        int[] expected = {5,0};
        int[] result = teste.qtdadeBarras(25);
        Assert.assertArrayEquals(expected,result);
    }

    @Test
    public void shouldBeOndeBarOneKg(){
        App teste = new App();
        int[] expected = {0,1};
        int[] result = teste.qtdadeBarras(1);
        Assert.assertArrayEquals(expected,result);
    }
}
