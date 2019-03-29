package bimal10p.com.magic8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askButton =(Button) findViewById(R.id.AskBtn);
        final ImageView magicBall =(ImageView) findViewById(R.id.imgBall);

        final int[] ballArray={
             R.drawable.ball1,
             R.drawable.ball2,
             R.drawable.ball3,
             R.drawable.ball4,
             R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Test","This is working");
                Random  randomNumGen= new Random();
                int num= randomNumGen.nextInt(5);
                Log.d("Test","The number is :"+num);

                magicBall.setImageResource(ballArray[num]);
            }
        });

    }
}
