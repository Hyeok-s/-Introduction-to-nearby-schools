package m2.p3.exam2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class m8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m8);
        Button btn = findViewById(R.id.btn1);
        FloatingActionButton fab = findViewById(R.id.fab1);
        Button btn2 = findViewById(R.id.btn2);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), emain2.class);
                startActivity(intent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(m8.this);
                dlg.setTitle("메뉴판");
                dlg.setMessage("왕교자 만두전골: 14000원 \n차돌순두부 짬뽕탕: 19000원 \n육전: 18000원 \n금복술국: 18000원 \n뚝배기어묵탕: 18000원");
                dlg.setPositiveButton("확인", null);
                dlg.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), update.class);
                startActivityForResult(intent, 8);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        TextView textview8 = findViewById(R.id.textview8);

        if(requestCode == 8 && resultCode == 0) {
            textview8.setText(intent.getStringExtra("update"));
        }

    }
}