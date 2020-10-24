package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

public Spinner spCounterSelection;
public EditText txtEnteredText;
public TextView tvCharsCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtEnteredText = findViewById(R.id.txtEnteredText);
        this.tvCharsCount = findViewById(R.id.tvCharsCount);
        this.spCounterSelection = (Spinner) findViewById(R.id.spCounterSelection);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        this.spCounterSelection.setAdapter(adapter);
    }
   public void onBtnCountCharsClick(View View){

       if(txtEnteredText.getText().toString().length()==0) {
           //display Toast message
           Toast.makeText(this, "There is no text entered", Toast.LENGTH_SHORT).show();
       }
       else if(spCounterSelection.getSelectedItem().toString().equalsIgnoreCase("Chars")){
    String textas = txtEnteredText.getText().toString();
    int raides=Calculate.chars(textas);
    tvCharsCount.setText("Chars:"+raides);
}
else if(spCounterSelection.getSelectedItem().toString().equalsIgnoreCase("Words")){
    String textas = txtEnteredText.getText().toString();
    int zodziai=Calculate.words(textas);
    tvCharsCount.setText("Words: "+zodziai);
}
}
}
