package com.task.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText data1;
    TextView output;
    Button no1,no2,no3,no4,no5,no6,no7,no8,no9,no0,addition,subraction,multiplication,division,equal,clear,decimal;
    double val1 = Double.NaN;
    double val2;
    double ans=0.0;
    char action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setid();

        no0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.setText(data1.getText().toString() + "0");
            }
        });
        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.setText(data1.getText().toString() + "1");
            }
        });
        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.setText(data1.getText().toString() + "2");
            }
        });
        no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.setText(data1.getText().toString() + "3");
            }
        });
        no4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.setText(data1.getText().toString() + "4");
            }
        });
        no5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.setText(data1.getText().toString() + "5");
            }
        });
        no6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.setText(data1.getText().toString() + "6");
            }
        });
        no7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.setText(data1.getText().toString() + "7");
            }
        });
        no8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.setText(data1.getText().toString() + "8");
            }
        });
        no9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.setText(data1.getText().toString() + "9");
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.setText(data1.getText().toString() + ".");
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action='/';
                output.setText(String.valueOf(val1) + "/");
                data1.setText(null);
            }
        });
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action='+';
                output.setText(String.valueOf(val1) + "+");
                data1.setText(null);
            }
        });
        subraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action='-';
                output.setText(String.valueOf(val1) + "-");
                data1.setText(null);
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action='*';
                output.setText(String.valueOf(val1) + "*");
                data1.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action='=';
               // if (val2==0 && acti)
                output.setText(output.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(ans));
                data1.setText(null);
                //output.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data1.getText().length()>0){
                    CharSequence num = data1.getText().toString();
                    data1.setText(num.subSequence(0, num.length()-1));
                }
                else{
                    data1.setText(null);
                    val1 = Double.NaN;
                    val2 = Double. NaN;
                    output.setText(null);
                    ans=0.0;
                }
            }
        });
    }
    private  void setid(){
        data1 = (EditText) findViewById(R.id.data1);
        output = (TextView) findViewById(R.id.output);
        no1 = (Button) findViewById(R.id.no1);
        no2 = (Button) findViewById(R.id.no2);
        no3 = (Button) findViewById(R.id.no3);
        no4= (Button) findViewById(R.id.no4);
        no5 = (Button) findViewById(R.id.no5);
        no6 = (Button) findViewById(R.id.no6);
        no7 = (Button) findViewById(R.id.no7);
        no8 = (Button) findViewById(R.id.no8);
        no9 = (Button) findViewById(R.id.no9);
        no0 = (Button) findViewById(R.id.no0);
        addition = (Button) findViewById(R.id.addition);
        subraction = (Button) findViewById(R.id.subraction);
        multiplication = (Button) findViewById(R.id.multiplication);
        division = (Button) findViewById(R.id.division);
        equal = (Button) findViewById(R.id.equal);
        clear = (Button) findViewById(R.id.clear);
        decimal = (Button) findViewById(R.id.dot);

    }
    private  void compute(){
        if(!Double.isNaN(val1)){
           val2 = Double.parseDouble(data1.getText().toString());
           ans=0.0;
           switch (action){
               case '+' :
                   ans = val1+val2;
                   break;
               case '-' :
                   ans = val1-val2;
                   break;
               case '*' :
                   ans = val1*val2;
                   break;
               case '/' :
                   if(val2==0)
                   {Toast.makeText(MainActivity.this,"Divide By Zero Error",Toast.LENGTH_LONG).show();
                     }
                   else
                       ans = val1/val2;
                   break;
               case '=' :
                   break;

       }

    }
        else{
            val1 = Double.parseDouble(data1.getText().toString());
        }


    }
}

