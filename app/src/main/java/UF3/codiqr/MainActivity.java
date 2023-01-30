package UF3.codiqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String value = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button snap = findViewById(R.id.button);
        TextView token = findViewById(R.id.textView);
        token.setText("Aquí aparecerá el token");

        snap.setOnClickListener(v -> {
            Intent i = new Intent(this,ScanActivity.class);
            startActivity(i);
        });

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            token.setText(extras.getString("token"));
        }
    }
}