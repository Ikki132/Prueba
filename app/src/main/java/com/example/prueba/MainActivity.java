package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4;
    TextView msg;
    EditText ET1, ET2;
    int n1, n2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= (Button) findViewById(R.id.btnsumar);
        btn2= (Button) findViewById(R.id.btnrestar);
        btn3= (Button) findViewById(R.id.btnmultiplicar);
        btn4= (Button) findViewById(R.id.btndividir);
        msg=(TextView) findViewById(R.id.result);
        ET1=(EditText) findViewById(R.id.ed1);
        ET2=(EditText) findViewById(R.id.ed2);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        n1= Integer.parseInt(ET1.getText().toString());
        n2= Integer.parseInt(ET2.getText().toString());
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.btnsumar){
            //Intent
            result= n1+n2;
            msg.setText(result);
            Intent siguiente= new Intent(this, ActivitySuma.class);
            startActivity(siguiente);
        }
        else if(view.getId()==R.id.btnrestar){
            result= n1-n2;
            msg.setText(result);
            Intent siguiente= new Intent(this, ActivityResta.class);
            startActivity(siguiente);
        }
        else if(view.getId()==R.id.btnmultiplicar){
            //mostrar mensaje
            result=n1*n2;
            msg.setText(result);

        }
        else if(view.getId()==R.id.btndividir){
            //mostrar en toast
            result=n1/n2;
            Toast.makeText(this, result,Toast.LENGTH_LONG).show();
        }

    }
}
