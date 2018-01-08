package com.abeer_m.login_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText pass;
    ImageButton sh;
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        pass = (EditText) findViewById(R.id.pass);
        Button b = (Button) findViewById(R.id.btn);
        sh = (ImageButton) findViewById(R.id.show);
        name.getBackground().setAlpha(179);
        pass.getBackground().setAlpha(179);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validation();
            }
        });
        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showpass();
            }
        });
    }

    protected void validation() {
        if (name.getText().toString().trim().length() ==0  || pass.getText().toString().trim().length() == 0) {
            Toast.makeText(this, "there is empty field ", Toast.LENGTH_LONG).show();

        }
        else{Toast.makeText(this, "login ", Toast.LENGTH_LONG).show();}
    }

    protected void showpass() {
        String[] a = {"show", "hide"};
        if (a[index] == "show") {
            pass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        } else {
            pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
        index++;
        if (index > 1) {
            index = 0;
        }

    }
}
