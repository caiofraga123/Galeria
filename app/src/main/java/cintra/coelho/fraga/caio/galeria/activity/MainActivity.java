package cintra.coelho.fraga.caio.galeria.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.controls.actions.FloatAction;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import cintra.coelho.fraga.caio.galeria.R;

public class MainActivity extends AppCompatActivity {

    static int NEW_ITEM_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fabAddItem = findViewById(R.layout.fa);
    }
}