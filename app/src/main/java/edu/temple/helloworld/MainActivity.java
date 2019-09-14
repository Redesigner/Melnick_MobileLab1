package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //END-BOILERPLATE

        final Button button = findViewById(R.id.button_id);
        final String buttonPressed = getResources().getString(R.string.button_pressed);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button.setText(buttonPressed);
            }
        });
    }
}
