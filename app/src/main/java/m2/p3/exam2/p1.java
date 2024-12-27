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

public class p1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1);
        Button btn = findViewById(R.id.btn1);
        FloatingActionButton fab = findViewById(R.id.fab1);
        Button btn2 = findViewById(R.id.btn2);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(p1.this);
                dlg.setTitle("가격표");
                dlg.setMessage("기본네컷(2장): 4000원 \n멀티프레임(2장): 4000원 \n디즈니네컷(2장): 5000원 \n캐릭터프레임(2장): 5000원");
                dlg.setPositiveButton("확인", null);
                dlg.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), update.class);
                startActivityForResult(intent, 11);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        TextView textview11 = findViewById(R.id.textview11);

        if(requestCode == 11 && resultCode == 0) {
            textview11.setText(intent.getStringExtra("update"));
        }

    }
}