package UF3.codiqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button snap = findViewById(R.id.button);
        TextView token = findViewById(R.id.textView);

        snap.setOnClickListener(v -> {
            Intent i = new Intent(this,ScanActivity.class);
            startActivity(i);
        });

        token.setText(getIntent().getExtras().getString("token"));
    }
}