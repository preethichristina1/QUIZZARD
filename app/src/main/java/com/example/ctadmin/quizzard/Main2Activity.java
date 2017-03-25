package com.example.ctadmin.quizzard;

/**
 * Created by ctadmin on 25-03-2017.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authors);
        Button gotoButton = (Button) findViewById(R.id.gotoButton);


        gotoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(gotoIntent);
            }

            }
        );
    }
}
