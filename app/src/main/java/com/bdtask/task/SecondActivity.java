package com.bdtask.task;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText title, description;
    Button save;
    String b;
    String titleText,descriptionText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        SharedPref.init(this);
        title = findViewById(R.id.titleId);
        description = findViewById(R.id.descriptionId);
        save = findViewById(R.id.saveId);
        Intent intent = getIntent();
        b = intent.getStringExtra("b");
        if (b.equals("b1")) {
            titleText=SharedPref.read("t1", "");
            descriptionText=SharedPref.read("d1", "");
            title.setText(titleText);
            description.setText(descriptionText);
        } else if (b.equals("b2")) {
            titleText= SharedPref.read("t2", "");
            descriptionText=SharedPref.read("d2", "");

            title.setText(titleText);
            description.setText(descriptionText);
        } else if (b.equals("b3")) {
            titleText=SharedPref.read("t3", "");
            descriptionText=SharedPref.read("d3", "");

            title.setText(titleText);
            description.setText(descriptionText);
        }
        else if (b.equals("b4")) {
            titleText= SharedPref.read("t4", "");
            descriptionText=SharedPref.read("d4", "");

            title.setText(titleText);
            description.setText(descriptionText);
        }
        else if (b.equals("b5")) {
            titleText=SharedPref.read("t5", "");
            descriptionText=SharedPref.read("d5", "");

            title.setText(titleText);
            description.setText(descriptionText);
        }
        Log.d("ppp", "onCreate: " + b);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b.equals("b1")) {
                    SharedPref.write("t1", title.getText().toString());
                    SharedPref.write("d1", description.getText().toString());
                    Toast.makeText(SecondActivity.this, "Save Successfully", Toast.LENGTH_SHORT).show();
                    onBackPressed();
                } else if (b.equals("b2")) {
                    SharedPref.write("t2", title.getText().toString());
                    SharedPref.write("d2", description.getText().toString());
                    Toast.makeText(SecondActivity.this, "Save Successfully", Toast.LENGTH_SHORT).show();
                    onBackPressed();
                } else if (b.equals("b3")) {
                    SharedPref.write("t3", title.getText().toString());
                    SharedPref.write("d3", description.getText().toString());
                    Toast.makeText(SecondActivity.this, "Save Successfully", Toast.LENGTH_SHORT).show();
                    onBackPressed();
                }
                else if (b.equals("b4")) {
                    SharedPref.write("t4", title.getText().toString());
                    SharedPref.write("d4", description.getText().toString());
                    Toast.makeText(SecondActivity.this, "Save Successfully", Toast.LENGTH_SHORT).show();
                    onBackPressed();
                }
                else if (b.equals("b5")) {
                    SharedPref.write("t5", title.getText().toString());
                    SharedPref.write("d5", description.getText().toString());
                    Toast.makeText(SecondActivity.this, "Save Successfully", Toast.LENGTH_SHORT).show();
                    onBackPressed();
                }
            }
        });
    }
}
