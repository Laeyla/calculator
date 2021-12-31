package com.example.calculator;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateButtonClick(View v) {
        EditText angkapertamaEditText= (EditText) findViewById(R.id.angkapertama);
        EditText angkakeduaEditText= (EditText) findViewById(R.id.angkakedua);

        int angkapertama = Integer.parseInt(angkapertamaEditText.getText().toString());
        int angkakedua = Integer.parseInt(angkakeduaEditText.getText().toString());

        RadioButton tambahRadioButton = (RadioButton) findViewById(R.id.tambahRadioButton);
        RadioButton kurangRadioButton = (RadioButton) findViewById(R.id.kurangRadioButton);
        RadioButton kaliRadioButton = (RadioButton) findViewById(R.id.kaliRadioButton);
        RadioButton bagiRadioButton = (RadioButton) findViewById(R.id.bagiRadioButton);

        int result = 0;

        if(tambahRadioButton.isChecked()){
            result = angkapertama + angkakedua;
        } else if(kurangRadioButton.isChecked()){
            result = angkapertama - angkakedua;
        } else if(kaliRadioButton.isChecked()){
            result = angkapertama * angkakedua;
        } else if(bagiRadioButton.isChecked()){
            result = angkapertama / angkakedua;
        }

        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        resultTextView.setText("Result: " + result);

        CheckBox recordResultCheckBox = (CheckBox) findViewById(R.id.recordResultCheckBox);
        
        if(recordResultCheckBox.isChecked()){
            result("Raeulst: " + result);
        }

    }

    private void result(String s) {
    }
}