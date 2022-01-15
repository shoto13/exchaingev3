package com.journey13.exchainge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class settingsChangeTagline extends AppCompatActivity {

    private Button changeTaglineButton;
    private EditText changeTaglineEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_change_tagline);

        changeTaglineButton = findViewById(R.id.confirmChangesButton);
        changeTaglineEditText = findViewById(R.id.changeTaglineEditText);

        changeTaglineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(changeTaglineEditText.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "You must enter your new tag line in the field above", Toast.LENGTH_SHORT).show();
                } else {

                    String newTag = changeTaglineEditText.getText().toString();
                    setNewTagline(newTag);
                }
            }
        });


    }

    public void setNewTagline(String tagline) {
        //TODO UPDATE TAGLINE IN FIREBASE WITHIN THIS FUNCTION
    }


}