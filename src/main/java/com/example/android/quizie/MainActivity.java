package com.example.android.quizie;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @SuppressLint("NewApi")
    int score = 0;
    public void submit1(View view) {
        RadioButton radiobutton11 = (RadioButton) findViewById(R.id.rb11);
        if(radiobutton11.isChecked() == true)
            radiobutton11.setTextColor(Color.RED);
        RadioButton radiobutton13 = (RadioButton) findViewById(R.id.rb13);
        if(radiobutton13.isChecked() == true)
            radiobutton13.setTextColor(Color.RED);
        RadioButton radiobutton14 = (RadioButton) findViewById(R.id.rb14);
        if(radiobutton14.isChecked() == true)
            radiobutton14.setTextColor(Color.RED);
        RadioButton radiobutton12 = (RadioButton) findViewById(R.id.rb12);
        radiobutton12.setTextColor(getResources().getColor(R.color.colorAccent));
        if(radiobutton12.isChecked())
            score++;
    }
       public void submit2(View view) {
        RadioButton radiobutton21 = (RadioButton) findViewById(R.id.rb21);
        if(radiobutton21.isChecked() == true)
            radiobutton21.setTextColor(Color.RED);
        RadioButton radiobutton22 = (RadioButton) findViewById(R.id.rb22);
        if(radiobutton22.isChecked() == true)
            radiobutton22.setTextColor(Color.RED);
        RadioButton radiobutton24 = (RadioButton) findViewById(R.id.rb24);
        if(radiobutton24.isChecked() == true)
            radiobutton24.setTextColor(Color.RED);
        RadioButton radiobutton23 = (RadioButton) findViewById(R.id.rb23);
        radiobutton23.setTextColor(getResources().getColor(R.color.colorAccent));
           if(radiobutton23.isChecked() == true)
               score++;
    }
    public void submit3(View view) {
        RadioButton radiobutton32 = (RadioButton) findViewById(R.id.rb32);
        if(radiobutton32.isChecked() == true)
            radiobutton32.setTextColor(Color.RED);
        RadioButton radiobutton33 = (RadioButton) findViewById(R.id.rb33);
        if(radiobutton33.isChecked() == true)
            radiobutton33.setTextColor(Color.RED);
        RadioButton radiobutton34 = (RadioButton) findViewById(R.id.rb34);
        if(radiobutton34.isChecked() == true)
            radiobutton34.setTextColor(Color.RED);
        RadioButton radiobutton31 = (RadioButton) findViewById(R.id.rb31);
        radiobutton31.setTextColor(getResources().getColor(R.color.colorAccent));
        if(radiobutton31.isChecked() == true)
            score++;
    }
    public void submit4(View view) {
        RadioButton radiobutton41 = (RadioButton) findViewById(R.id.rb41);
        if(radiobutton41.isChecked() == true)
            radiobutton41.setTextColor(Color.RED);
        RadioButton radiobutton43 = (RadioButton) findViewById(R.id.rb43);
        if(radiobutton43.isChecked() == true)
            radiobutton43.setTextColor(Color.RED);
        RadioButton radiobutton44 = (RadioButton) findViewById(R.id.rb44);
        if(radiobutton44.isChecked() == true)
            radiobutton44.setTextColor(Color.RED);
        RadioButton radiobutton42 = (RadioButton) findViewById(R.id.rb42);
        radiobutton42.setTextColor(getResources().getColor(R.color.colorAccent));
        if(radiobutton42.isChecked() == true)
            score++;
    }
    public void submit5(View view){
        RadioButton radiobutton52 = (RadioButton) findViewById(R.id.rb52);
        if(radiobutton52.isChecked() == true)
            radiobutton52.setTextColor(Color.RED);
        RadioButton radiobutton53 = (RadioButton) findViewById(R.id.rb53);
        if(radiobutton53.isChecked() == true)
            radiobutton53.setTextColor(Color.RED);
        RadioButton radiobutton54 = (RadioButton) findViewById(R.id.rb54);
        if(radiobutton54.isChecked() == true)
            radiobutton54.setTextColor(Color.RED);
        RadioButton radiobutton51 = (RadioButton) findViewById(R.id.rb51);
        radiobutton51.setTextColor(getResources().getColor(R.color.colorAccent));
        if(radiobutton51.isChecked() == true)
            score++;
        TextView textview = (TextView) findViewById(R.id.text);
        textview.setText("YOUR SCORE IS "+score);
    }
}
