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

public class p7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p7);
        Button btn = findViewById(R.id.btn1);
        FloatingActionButton fab = findViewById(R.id.fab1);
        Button btn2 = findViewById(R.id.btn2);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), pmain2.class);
                startActivity(intent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(p7.this);
                dlg.setTitle("가격표");
                dlg.setMessage("40분: 1000원 \n4시간: 5000원");
                dlg.setPositiveButton("확인", null);
                dlg.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), update.class);
                startActivityForResult(intent, 17);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        TextView textview17 = findViewById(R.id.textview17);

        if(requestCode == 17 && resultCode == 0) {
            textview17.setText(intent.getStringExtra("update"));
        }

    }
}