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

        if (cantidad.getText().toString().isEmpty() ){
            cantidad.requestFocus();
            cantidad.setError(recursos.getString(R.string.error_numero1));
            return false;
        }

        if ( Double.parseDouble(cantidad.getText().toString()) <= 0 ){
            cantidad.requestFocus();
            cantidad.setError(recursos.getString(R.string.error_numero1));
            return false;
        }

        return  true;

    }

    public void calcular(View v){
        double cant;
        resultado.setText("");

        int opciones_genero,opciones_tipo,opciones_marca;

        opciones_genero=genero_sp.getSelectedItemPosition();
        opciones_tipo=tipo_sp.getSelectedItemPosition();
        opciones_marca=marca_sp.getSelectedItemPosition();

        if (validar()){
            cant=Double.parseDouble(cantidad.getText().toString());
            double valores = metodo.calculo(cant,opciones_genero,opciones_tipo,opciones_marca);
            resultado.setText(""+String.format("%.2f",valores));
        }


    }




}
