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

public class m5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m5);
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
                AlertDialog.Builder dlg = new AlertDialog.Builder(m5.this);
                dlg.setTitle("메뉴판");
                dlg.setMessage("제주생오겹살(180g): 15000원 \n국내산 암돼지(180g): 14000원 \n제주생목살(180g): 15000원 \n제주 가브리살(150g): 15000원 \n제주 항정살(150g): 15000원");
                dlg.setPositiveButton("확인", null);
                dlg.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), update.class);
                startActivityForResult(intent, 5);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        TextView textview5 = findViewById(R.id.textview5);

        if(requestCode == 5 && resultCode == 0) {
            textview5.setText(intent.getStringExtra("update"));
        }

    }
}