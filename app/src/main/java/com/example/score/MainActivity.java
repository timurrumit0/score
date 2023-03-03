package com.example.score;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewCount1;
    TextView textViewCount2;
    int count1=0;
    int count2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyMainActivity", "onCreate");

        if(savedInstanceState != null){
            count1 = savedInstanceState.getInt("score1");
            count2 = savedInstanceState.getInt("score2");
        }
        initViews();
        textViewCount1.setText(""+(count1));
        textViewCount2.setText(""+(count2));
        textViewCount1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count1++;
                textViewCount1.setText(""+(count1));
            }
        });
    textViewCount2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            count2++;
            textViewCount2.setText(""+(count2));
        }
    });
}
    private void  initViews(){
        textViewCount1=findViewById(R.id.textCount1);
        textViewCount2=findViewById(R.id.textCount2);
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score1", count1);
        outState.putInt("score2", count2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MyMainActivity", "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MyMainActivity", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MyMainActivity", "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MyMainActivity", "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MyMainActivity", "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MyMainActivity", "onDestroy");
    }
}