package com.example.android.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultiplication;
    private TextView txtResult;
    private Button clrButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        operand1 = (EditText) findViewById(R.id.operand1);
        operand2 = (EditText) findViewById(R.id.operand2);
        btnAddition =(Button) findViewById(R.id.btnAddition);
        btnDivision =(Button) findViewById(R.id.btnDivision);
        btnMultiplication =(Button) findViewById(R.id.btnMultiplication);
        btnSubtraction =(Button) findViewById(R.id.btnSubtratction);
        txtResult = (TextView) findViewById(R.id.txtResult);
        clrButton = (Button) findViewById(R.id.btnClr);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                    double opr1, opr2;
                    opr1 = Double.parseDouble(operand1.getText().toString());
                    opr2 = Double.parseDouble(operand2.getText().toString());

                    double txtRes;
                    txtRes = opr1 + opr2;
                    txtResult.setText(Double.toString(txtRes));
                }else{
                    Toast.makeText(MainActivity.this,"Please Enter numbers",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                double opr1,opr2;
                opr1 = Double.parseDouble(operand1.getText().toString());
                opr2 = Double.parseDouble(operand2.getText().toString());

                double txtRes;
                txtRes=opr1-opr2;
                txtResult.setText(Double.toString(txtRes));
            }else {
                    Toast.makeText(MainActivity.this,"Please Enter numbers",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                    double opr1, opr2;
                    opr1 = Double.parseDouble(operand1.getText().toString());
                    opr2 = Double.parseDouble(operand2.getText().toString());

                    double txtRes;
                    txtRes = opr1 / opr2;
                    txtResult.setText(Double.toString(txtRes));
                }else{
                    Toast.makeText(MainActivity.this,"Please Enter numbers",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                    double opr1, opr2;
                    opr1 = Double.parseDouble(operand1.getText().toString());
                    opr2 = Double.parseDouble(operand2.getText().toString());

                    double txtRes;
                    txtRes = opr1 * opr2;
                    txtResult.setText(Double.toString(txtRes));
                }else{
                    Toast.makeText(MainActivity.this,"Please Enter numbers",Toast.LENGTH_LONG).show();
                }
                }
        });
        clrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                txtResult.setText("");
                operand1.requestFocus();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
