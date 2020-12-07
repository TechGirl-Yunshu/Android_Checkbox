package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox NewYorkCheckBox;
    private CheckBox SeattleCheckBox;
    private CheckBox MiamiCheckBox;

    private Button showButton;
    private TextView showTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewYorkCheckBox = (CheckBox) findViewById(R.id.NewYorkCheckBoxID);
        SeattleCheckBox = (CheckBox) findViewById(R.id.SeattleCheckBoxID);
        MiamiCheckBox = (CheckBox) findViewById(R.id.MiamiCheckBoxID);

        showButton = (Button) findViewById(R.id.showButtonID);
        showTextView = (TextView) findViewById(R.id.resultID);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(NewYorkCheckBox.getText().toString() +  " status is: " + NewYorkCheckBox.isChecked() + "\n");
                stringBuilder.append(SeattleCheckBox.getText().toString() + " status is " + SeattleCheckBox.isChecked() + "\n");
                stringBuilder.append(MiamiCheckBox.getText().toString() + " status is " + MiamiCheckBox.isChecked() + "\n");

                showTextView.setText(stringBuilder);
            }
        });

    }
}