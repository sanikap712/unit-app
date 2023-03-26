package com.example.unit;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void kilogramTogram(View view) {
        EditText userInputText;


        userInputText=findViewById(R.id.num);


        String userInputString=userInputText.getText().toString();

        double userInputDouble=Double.parseDouble(userInputString);

        double outputDouble=(userInputDouble*1000);

        String outputString=Double.toString(outputDouble);

        Toast.makeText(this,"Conversion of kilogram to gram is "+outputString,Toast.LENGTH_LONG).show();

    }

    public void GramTokilogram(View view){
        EditText userInputText;


        userInputText=findViewById(R.id.num);


        String userInputString=userInputText.getText().toString();
        double userInputDouble=Double.parseDouble(userInputString);
        double outputDouble=(userInputDouble/1000);
        String outputString=Double.toString(outputDouble);

        Toast.makeText(this,"Conversion of gram to kilogram is "+outputString,Toast.LENGTH_LONG).show();

    }
}