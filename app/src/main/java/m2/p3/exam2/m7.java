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

public class m7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m7);
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
                AlertDialog.Builder dlg = new AlertDialog.Builder(m7.this);
                dlg.setTitle("메뉴판");
                dlg.setMessage("기절초풍 갈비탕: 15000원 \n만두 갈비탕 :14000원 \n리북 손만두: 6000원 \n새콤달콤 꼬막무침: 10000원 \n바삭새우튀김: 13000원");
                dlg.setPositiveButton("확인", null);
                dlg.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), update.class);
                startActivityForResult(intent, 7);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        TextView textview7 = findViewById(R.id.textview7);

        if(requestCode == 7 && resultCode == 0) {
            textview7.setText(intent.getStringExtra("update"));
        }

    }
}