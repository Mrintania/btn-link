package com.example.btnlink;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    //innerclass
    class pornsupat implements View.OnClickListener{
    @Override
    public void onClick(View view) {
        Intent goto_page2 = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(goto_page2);
    }
}
    @Override
    protected void onCreate(Bundle savedInsencestate) {
        super.onCreate(savedInsencestate);
        setContentView(R.layout.activity_main);

        Button bt1, bt2, bt3;

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);

        //M1
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goto_page2 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(goto_page2);
            }
        });

        //M2
        bt2.setOnClickListener(MainActivity.this);

        bt3.setOnClickListener(new pornsupat());
    }




    }
}