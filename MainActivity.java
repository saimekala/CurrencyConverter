package com.dixit.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


public void buttonClicked(View view){

    EditText curName = (EditText)findViewById(R.id.curName);

    Double dollarAmount = Double.parseDouble(curName.getText().toString());

    Double rupeeAmount = dollarAmount*68.86;

    Toast.makeText(MainActivity.this,"Rupee ="+String.format("%.2f",rupeeAmount),Toast.LENGTH_LONG).show();


}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
