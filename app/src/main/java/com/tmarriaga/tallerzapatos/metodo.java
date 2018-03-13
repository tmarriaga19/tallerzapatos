package com.tmarriaga.tallerzapatos;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by android on 12/03/2018.
 */

public class metodo {
    public static double total_pago(double cantidad, double precio){
        return cantidad*precio;
    }



    public static double calculo(Double cant,  int opciones_genero,int opciones_tipo,int opciones_marca){
        double valor=0;

            switch (opciones_genero) {
                case 0:/*hombre*/
                    switch (opciones_tipo) {
                        case 0:/*zapatilla*/
                            switch (opciones_marca) {
                                case 0:/*nike*/
                                    valor = metodo.total_pago(cant, 120000);
                                    break;
                                case 1:/*adiddas*/
                                    valor = metodo.total_pago(cant, 140000);
                                    break;
                                case 2:/*puma*/
                                    valor = metodo.total_pago(cant, 130000);
                                    break;
                            }
                            break;
                        case 1:/*clasico*/
                            switch (opciones_marca) {
                                case 0:/*nike*/
                                    valor = metodo.total_pago(cant, 50000);
                                    break;
                                case 1:/*adiddas*/
                                    valor = metodo.total_pago(cant, 80000);
                                    break;
                                case 2:/*puma*/
                                    valor = metodo.total_pago(cant, 100000);
                                    break;
                            }
                            break;
                    }

                    break;
                case 1:/*mujer*/
                    switch (opciones_tipo) {
                        case 0:/*zapatilla*/
                            switch (opciones_marca) {
                                case 0:/*nike*/
                                    valor = metodo.total_pago(cant, 100000);
                                    break;
                                case 1:/*adiddas*/
                                    valor = metodo.total_pago(cant, 130000);
                                    break;
                                case 2:/*puma*/
                                    valor = metodo.total_pago(cant, 110000);
                                    break;
                            }
                            break;
                        case 1:/*clasico*/
                            switch (opciones_marca) {
                                case 0:/*nike*/
                                    valor = metodo.total_pago(cant, 60000);
                                    break;
                                case 1:/*adidas*/
                                    valor = metodo.total_pago(cant, 70000);
                                    break;
                                case 2:/*puma*/
                                    valor = metodo.total_pago(cant, 120000);
                                    break;
                            }
                            break;
                    }

                    break;
            }

        return valor;

    }

}


