package m2.p3.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab1 = findViewById(R.id.fab1);
        FloatingActionButton fab2 = findViewById(R.id.fab2);

        Button m1 = findViewById(R.id.m1);
        Button m2 = findViewById(R.id.m2);
        Button m3 = findViewById(R.id.m3);
        Button m4 = findViewById(R.id.m4);

        Button p1 = findViewById(R.id.p1);
        Button p2 = findViewById(R.id.p2);
        Button p3 = findViewById(R.id.p3);
        Button p4 = findViewById(R.id.p4);

        TabHost tabhost=findViewById(R.id.tab);
        tabhost.setup();

        TabHost.TabSpec eat =tabhost.newTabSpec("tab1").setIndicator("맛집");
        eat.setContent(R.id.iv1);
        tabhost.addTab(eat);

        TabHost.TabSpec play = tabhost.newTabSpec("tab2").setIndicator("놀것");
        play.setContent(R.id.iv2);
        tabhost.addTab(play);



        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), m1.class);
                startActivity(intent);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), m2.class);
                startActivity(intent);
            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), m3.class);
                startActivity(intent);
            }
        });

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), m4.class);
                startActivity(intent);
            }
        });

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), p1.class);
                startActivity(intent);
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), p2.class);
                startActivity(intent);
            }
        });

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), p3.class);
                startActivity(intent);
            }
        });

        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), p4.class);
                startActivity(intent);
            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), emain2.class);
                startActivity(intent);
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), pmain2.class);
                startActivity(intent);
            }
        });


    }
}