package com.example.btnlink;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    //innerclass
    class pornsupat implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent goto_page2 = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(goto_page2);
        }
    }

    //
    class innn implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Intent goto_r = new Intent(MainActivity.this , MainActivity2.class);
            startActivity(goto_r);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1, bt2, bt3;
        ImageView intania;

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);

        intania = findViewById(R.id.intania);
        intania.setOnClickListener(new innn());

        //M1
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goto_page2 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(goto_page2);
            }
        });

        //M2
        //bt2.setOnClickListener(MainActivity.this);

        //M3
        bt3.setOnClickListener(new pornsupat());
    }

    public void test(View v){
        Intent goto_page2 = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(goto_page2);
    }
}
