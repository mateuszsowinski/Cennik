package pl.leshy.paraserjson;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

/**
 * Created by Sowa on 02.02.2017.
 */

public class Loading extends AppCompatActivity{

    ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        progressBar = (ProgressBar) findViewById(R.id.progressBar2);
        progressBar.setMax(100);
        progressBar.setProgress(0);

        Thread thread = new Thread() {

            public void run() {
                try {
                    for (int i= 0; i <100; i++){
                        progressBar.setProgress(i);
                        sleep(20);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        };
        thread.start();
    }
}
