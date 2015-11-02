package com.example.irina.hiddenfruit;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity implements View.OnClickListener{
    ImageButton btnNewGame, btnContinue, btnSettings, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewGame = (ImageButton)findViewById(R.id.btnNewGame);
        btnContinue = (ImageButton)findViewById(R.id.btnContinue);
        btnSettings = (ImageButton)findViewById(R.id.btnSettings);
        btnExit = (ImageButton)findViewById(R.id.btnExit);

        btnExit.setOnClickListener(this);
        btnSettings.setOnClickListener(this);
        btnContinue.setOnClickListener(this);
        btnNewGame.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnNewGame:
                intent = new Intent(this, LevelList.class);
                startActivity(intent);
                break;
            case R.id.btnContinue:

                break;
            case R.id.btnSettings:

                break;
            case R.id.btnExit:

                break;
        }

    }
}
