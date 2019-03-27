package com.bdtask.task;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2, b3, b4, b5;
    String bt1,bt2,bt3,bt4,bt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPref.init(this);
        init();
        bt1=SharedPref.read("t1", "");
        bt2=SharedPref.read("t2", "");
        bt3=SharedPref.read("t3", "");
        bt4=SharedPref.read("t4", "");
        bt5=SharedPref.read("t5", "");
        if (bt1!=null){
            b1.setText(bt1);
        }if (bt2!=null){
            b2.setText(bt2);
        }if (bt3!=null){
            b3.setText(bt3);
        }if (bt4!=null){
            b4.setText(bt4);
        }
        if (bt5 != null) {
            b5.setText(bt5);
        }

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        bt1=SharedPref.read("t1", "");
        bt2=SharedPref.read("t2", "");
        bt3=SharedPref.read("t3", "");
        bt4=SharedPref.read("t4", "");
        bt5=SharedPref.read("t5", "");
        if (bt1!=null){
            b1.setText(bt1);
        }if (bt2!=null){
            b2.setText(bt2);
        }if (bt3!=null){
            b3.setText(bt3);
        }if (bt4!=null){
            b4.setText(bt4);
        }
        if (bt5 != null) {
            b5.setText(bt5);
        }

    }

    private void init() {
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b1:
                Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
                intent1.putExtra("b","b1");
                startActivity(intent1);
                break;
            case R.id.b2:
                Intent intent2 = new Intent(MainActivity.this, SecondActivity.class);
                intent2.putExtra("b","b2");
                startActivity(intent2);
                break;
            case R.id.b3:
                Intent intent3 = new Intent(MainActivity.this, SecondActivity.class);
                intent3.putExtra("b","b3");
                startActivity(intent3);
                break;
            case R.id.b4:
                Intent intent4 = new Intent(MainActivity.this, SecondActivity.class);
                intent4.putExtra("b","b4");
                startActivity(intent4);
                break;
            case R.id.b5:
                Intent intent5 = new Intent(MainActivity.this, SecondActivity.class);
                intent5.putExtra("b","b5");
                startActivity(intent5);
                break;
        }
    }
}
