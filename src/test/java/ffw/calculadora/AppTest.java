package ffw.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Calculadora calculadora;
  

    @Before
    public void init()
    {
        calculadora = Mockito.mock(Calculadora.class);
       
    }
    /**
     * Testa quantas vezes o objeto Calculadora foi instanciado comparado a 0
     */

    @Test
    public void testInstance(){
        
        assertEquals(0, calculadora.getInstanceCount());
    }

    /**
     * Testa quantas vezes o objeto Calculadora foi instanciado comparado a 1
     */

    @Test
    public void testInstanceZero(){
        Calculadora calcTeste = new Calculadora();
        assertEquals(1, calcTeste.getInstanceCount());
    }

    /**
     * Testa a soma
     */

    @Test
    public void testSoma(){
        Mockito.when(calculadora.soma(2, 3)).thenReturn(5);
        int resultado = this.calculadora.soma(2, 3);
        assertEquals(5, resultado);
        
    }

    /**
     * Testa a subtração
     */

    @Test
    public void testSub(){
        Mockito.when(calculadora.subtracao(4, 2)).thenReturn(2);
        int resultado = this.calculadora.subtracao(4, 2);
        assertEquals(2, resultado);
        
    }

    /**
     * Testa a multiplicação
     */

    @Test
    public void testMulti(){
        Mockito.when(calculadora.multiplicacao(2, 3)).thenReturn(6);
        int resultado = this.calculadora.multiplicacao(2, 3);
        assertEquals(6, resultado);
        
    }

    /**
     * Testa a divisão
     */

    @Test
    public void testDiv(){
        Mockito.when(calculadora.divisao(9, 3)).thenReturn(3);
        int resultado = this.calculadora.divisao(9, 3);
        assertEquals(3, resultado);
        
    }

    
}
