package edu.galileo.seguridadcivil;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Dashboard extends AppCompatActivity {
    TextView btnGestionCamara;
    Usuario usuar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        btnGestionCamara = (TextView)findViewById(R.id.btnGestionCamara);
        btnGestionCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, GestionCamara.class);
                startActivity(i);

            }

        });

    }


    public void ubicacion(View view) {
        Intent i = new Intent(Dashboard.this, MyLocation.class);

        startActivity(i);

    }

    public void llamadapi(View view){
        usuar= API.BuscarUsuario(2,Dashboard.this);

    }

}
