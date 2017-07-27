package mx.org.inegi.movil_ikqss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{
    Button botoninicial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarObjetos();
        inicializarEventos();
    }

    private void inicializarObjetos() {
        botoninicial=(Button)findViewById(R.id.button);
    }

    private void inicializarEventos() {
        botoninicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, Principal.class);
                intent.putExtra("user", "ejemplo");
                //startActivityForResult(intent, 0);
                startActivity(intent);
            }
        });
    }
}
