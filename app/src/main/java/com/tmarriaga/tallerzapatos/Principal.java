package com.tmarriaga.tallerzapatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.res.Resources;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;



public class Principal extends AppCompatActivity {

    private EditText cantidad;
    private TextView resultado;
    private Resources recursos;
    private Spinner genero_sp,tipo_sp,marca_sp;
    private String genero[],tipo[],marca[];
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cantidad=findViewById(R.id.txtcantidad);
        resultado=findViewById(R.id.lblvalpagar);

        recursos=this.getResources();

        genero_sp=findViewById(R.id.cmbgenero);
        genero=recursos.getStringArray(R.array.listagenero);
        ArrayAdapter<String> adapter= new ArrayAdapter(this,android.R.layout.simple_spinner_item,genero);
        genero_sp.setAdapter(adapter);

        tipo_sp=findViewById(R.id.cmbtipo);
        tipo=recursos.getStringArray(R.array.listatipo);
        ArrayAdapter<String> adapter1 =new ArrayAdapter(this,android.R.layout.simple_spinner_item,tipo);
        tipo_sp.setAdapter(adapter1);

        marca_sp=findViewById(R.id.cmbmarca);
        marca=recursos.getStringArray(R.array.listamarca);
        ArrayAdapter<String> adapter2 =new ArrayAdapter(this,android.R.layout.simple_spinner_item,marca);
        marca_sp.setAdapter(adapter2);

        boton=findViewById(R.id.btntotal);

    }

    public boolean validar(){
        double cant = Double.parseDouble(cantidad.getText().toString());

        if (cant <= 0 ){
            cantidad.requestFocus();
            cantidad.setError(recursos.getString(R.string.error_numero1));
            return false;
        }
        return  true;
    }


    public void calculo(View v){
        double cant, valor=0;
        resultado.setText("");/*setear la caja*/
        int opciones_genero,opciones_tipo,opciones_marca;
        cant=Double.parseDouble(cantidad.getText().toString());

        opciones_genero=genero_sp.getSelectedItemPosition();
        opciones_tipo=tipo_sp.getSelectedItemPosition();
        opciones_marca=marca_sp.getSelectedItemPosition();

        if (validar()) {
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
                                    valor = metodo.total_pago(cant, 110000);
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
        }
        resultado.setText(""+String.format("%.2f",valor));

    }
}
