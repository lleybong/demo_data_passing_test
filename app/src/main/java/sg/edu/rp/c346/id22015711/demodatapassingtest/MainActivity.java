package sg.edu.rp.c346.id22015711.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPassInteger;
    Button btnPassChar;

    TextView textViewDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassChar = findViewById(R.id.buttonPassChar);
        textViewDouble = findViewById(R.id.textView);

        btnPassInteger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value",1);
                startActivity(intent);
            }
        });

        btnPassInteger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("value","a");
                startActivity(intent);
            }
        });

        textViewDouble.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("value",99.99);
                startActivity(intent);
            }
        });
    }
}