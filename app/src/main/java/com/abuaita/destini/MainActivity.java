package com.abuaita.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
       private TextView storyView;
       private Button topButton;
       private Button bottomButton;
       private int storyLevel;


      final private storyModel[] storyBank = {
         new storyModel(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2,2,1),
         new storyModel(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2,2,3),
         new storyModel(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2,5,4),
         new storyModel(R.string.T4_End),
         new storyModel(R.string.T5_End),
         new storyModel(R.string.T6_End)
       };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyView = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);

        storyView.setText(R.string.T1_Story);
        topButton.setText(R.string.T1_Ans1);
        bottomButton.setText(R.string.T1_Ans2);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(storyLevel < 3) {
                    updateStory(storyBank[storyLevel].getNextBath1());
                }else{
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("Game Over");
                    alert.setCancelable(false);
                    alert.setMessage("You have reached the End");
                    alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    alert.show();
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (storyLevel < 3) {
                    updateStory(storyBank[storyLevel].getNextBath2());
                }else{
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("Game Over");
                    alert.setCancelable(false);
                    alert.setMessage("You have reached the End");
                    alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
                    alert.show();
                }
            }
        });

    }

    private void updateStory(int level){
        if (level < 3) {
            storyLevel = level;
            storyView.setText(storyBank[level].getCurrentBath());
            topButton.setText(storyBank[level].getFirstBath());
            bottomButton.setText(storyBank[level].getSecondBath());
        }else{
            storyView.setText(storyBank[level].getCurrentBath());
            storyLevel = level;
            topButton.setText("");
            bottomButton.setText("");
        }
    }

}
