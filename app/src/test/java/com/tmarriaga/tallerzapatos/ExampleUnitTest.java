package com.tmarriaga.tallerzapatos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void hombre_zapatilla_nike(){
        double  cant = 5;
        int opciones_genero=0,opciones_tipo=0,opciones_marca=0;
        double res = metodo.calculo(cant,opciones_genero,opciones_tipo,opciones_marca);
        assertEquals(600000,res,0 );
    }

    @Test
    public void hombre_clasico_nike(){
        double  cant = 4;
        int opciones_genero=0,opciones_tipo=1,opciones_marca=0;
        double res = metodo.calculo(cant,opciones_genero,opciones_tipo,opciones_marca);
        assertEquals(200000,res,0 );
    }

    @Test
    public void mujer_zapatilla_nike(){
        double  cant = 5;
        int opciones_genero=1,opciones_tipo=0,opciones_marca=0;
        double res = metodo.calculo(cant,opciones_genero,opciones_tipo,opciones_marca);
        assertEquals(500000,res,0 );
    }

    @Test
    public void mujer_clasico_nike(){
        double  cant = 4;
        int opciones_genero=1,opciones_tipo=1,opciones_marca=0;
        double res = metodo.calculo(cant,opciones_genero,opciones_tipo,opciones_marca);
        assertEquals(240000,res,0 );
    }



}