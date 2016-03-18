package rodrigo.triqui;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {
    int[] tablero = new int[9];
    ImageView uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve;
    boolean gana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno = (ImageView) findViewById(R.id.uno);
        dos = (ImageView) findViewById(R.id.dos);
        tres = (ImageView) findViewById(R.id.tres);
        cuatro = (ImageView) findViewById(R.id.cuatro);
        cinco = (ImageView) findViewById(R.id.cinco);
        seis = (ImageView) findViewById(R.id.seis);
        siete = (ImageView) findViewById(R.id.siete);
        ocho = (ImageView) findViewById(R.id.ocho);
        nueve = (ImageView) findViewById(R.id.nueve);

        for (int i = 0; i <= 8; i++) {
            tablero[i] = 0;
        }
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.uno:
                uno.setImageResource(R.drawable.x);
                tablero[0]=1;
                break;

            case R.id.dos:
                dos.setImageResource(R.drawable.x);
                tablero[1]=1;
                break;

            case R.id.tres:
                tres.setImageResource(R.drawable.x);
                tablero[2]=1;
                break;

            case R.id.cuatro:
                cuatro.setImageResource(R.drawable.x);
                tablero[3]=1;
                break;

            case R.id.cinco:
                cinco.setImageResource(R.drawable.x);
                tablero[4]=1;
                break;

            case R.id.seis:
                seis.setImageResource(R.drawable.x);
                tablero[5]=1;
                break;

            case R.id.siete:
                siete.setImageResource(R.drawable.x);
                tablero[6]=1;
                break;

            case R.id.ocho:
                ocho.setImageResource(R.drawable.x);
                tablero[7]=1;
                break;

            case R.id.nueve:
                nueve.setImageResource(R.drawable.x);
                tablero[8]=1;
                break;

            default:
                break;
        }
    }
}


