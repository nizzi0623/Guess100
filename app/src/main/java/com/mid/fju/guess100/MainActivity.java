package com.mid.fju.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    int r =random.nextInt(99)+1;
    int min = 1;
    int max= 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

    }
    public void findViews () {
        TextView secret = (TextView) findViewById(R.id.secret);
        TextView info = (TextView) findViewById(R.id.info);
        EditText edNum = (EditText) findViewById(R.id.number);
        Button send = (Button) findViewById(R.id.send);
        int n = Integer.parseInt(edNum.getText().toString());

        while (n<r && n>min && n<max){
            new AlertDialog.Builder(this).setMessage(n + " to " + r).setPositiveButton("OK", null).show();
            break;
        }
        while (n>r && n>min && n<max){
            new AlertDialog.Builder(this).setMessage(min + " to " + n).setPositiveButton("OK", null).show();
            break;
        }
        while (n==r){
            new AlertDialog.Builder(this).setMessage("答對了").setPositiveButton("OK", null).show();
            break;
        }










    }
}
