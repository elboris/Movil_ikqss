package mx.org.inegi.movil_ikqss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by ANDRES.LARA on 26/07/2017.
 */

public class Notas  extends AppCompatActivity {
    private ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notas);
        imgBack= (ImageView) findViewById(R.id.imgBackNotas);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
