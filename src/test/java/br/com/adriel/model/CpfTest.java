package br.com.adriel.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.adriel.Cpf;

public class CpfTest {

    @Test
    void isCpfValidoTeste(){
        final Cpf instancia = new Cpf("24373905100");

        assertTrue(instancia.isCpf("24373905100"));
    }
    @Test
    void isCpfInvalidoTeste(){
        final Cpf instancia = new Cpf("24373905100");

        assertFalse(instancia.isCpf("24373905111"));
    }
    @Test
    void removerMascaraTeste(){
        final Cpf instancia = new Cpf("243.739.051-00");
        String esperado = "24373905111";
        String obtido = instancia.removerMascaras("243.739.051-11");
        assertEquals(esperado, obtido);
    }
    @Test
    void cpfContrutorNumeroRepetidoTest(){
        assertThrows(IllegalArgumentException.class, ()-> new Cpf("11111111111"));
    }
    @Test
    void cpfContrutorNumeroInvalidoTest(){
        assertThrows(IllegalArgumentException.class, ()-> new Cpf("24373905111"));
    }
    @Test
    void cpfContrutorNumeroValidoTest(){
        final Cpf instancia = new Cpf("24373905100");
        final String esperado = "243.739.051-00";
        assertEquals(esperado, instancia.getValor());
    }
    @Test
    void cpfContrutorNumeroInvalidoMascaraTest(){
        assertThrows(IllegalArgumentException.class, ()-> new Cpf("243.739.051-11"));
    }
    @Test
    void cpfContrutorNumeroValidoMascaraTest(){
        final Cpf instancia = new Cpf("243.739.051-00");
        final String esperado = "243.739.051-00";
        assertEquals(esperado, instancia.getValor());
    }
    @Test
    void cpfNumeroRepetidoTeste(){
        final Cpf instancia = new Cpf("243.739.051-00");
        assertThrows(IllegalArgumentException.class, ()->instancia.setValor("11111111111"));
    }

    @Test
    void cpfNumeroInvalido(){
        final Cpf instancia = new Cpf("24373905100");
        assertThrows(IllegalArgumentException.class, ()->instancia.setValor("12345678900"));
    }

    @Test
    void cpfValidoSemMascara(){
        final Cpf instancia = new Cpf("24373905100");
        instancia.setValor("24373905100");

        final String esperado = "243.739.051-00";
        final String obtido = instancia.getValor();

        assertEquals(esperado, obtido);
    }
    @Test
    void cpfValidoComMascara(){
        final Cpf instancia = new Cpf("243.739.051-00");
        instancia.setValor("243.739.051-00");

        final String esperado = "243.739.051-00";
        final String obtido = instancia.getValor();

        assertEquals(esperado, obtido);
    }
}
