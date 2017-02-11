package com.example.android.learnto;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;

    Button textLeftButton;

    Button textRightButton;

    ImageView principalImageView;

    TextView pageCounterTextView;

    TextView instructionTextView;

    TextView titleTextView;
    //Some write


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        textLeftButton = (Button) findViewById(R.id.left_button);
        textLeftButton.setVisibility(View.GONE);

        textRightButton = (Button) findViewById(R.id.right_button);
        textRightButton.setText("Start");

        principalImageView = (ImageView) findViewById(R.id.image_view);

        pageCounterTextView = (TextView) findViewById(R.id.page_counter_text_view);
        pageCounterTextView.setVisibility(View.GONE);

        instructionTextView = (TextView) findViewById(R.id.instruction_text_view);
        instructionTextView.setVisibility(View.GONE);

        titleTextView = (TextView) findViewById(R.id.title_text_view);
        titleTextView.setText("Don't be a Sith!!" + "\n" +
                "\nMake the first step toward a new powerful language!!!");

    }



    //
    //Increment the counter and updates the view
    //

    public void showNextView(View view) {
        if (counter == 5) {
            return;
        }
        counter++;
        display();
    }



    //
    //Decrement the counter and updates the view
    //

    public void showPreviousView(View view) {
        if (counter == 0) {
            return;
        }
        if (counter == 5) {
            counter = 0;
            display();
            return;
        }
        counter--;
        display();
    }



    //
    //Update all the view based on counter value
    //

    private void display() {



        //
        //Update button visibility and text based on counter value
        //

        if (counter > 0) {
            textLeftButton.setText("Back");
            textLeftButton.setVisibility(View.VISIBLE);
            textRightButton.setText("Next");
            pageCounterTextView.setVisibility(View.VISIBLE);
            instructionTextView.setVisibility(View.VISIBLE);
            titleTextView.setVisibility(View.GONE);
        } else {
            textRightButton.setText("Start");
            pageCounterTextView.setVisibility(View.GONE);
            instructionTextView.setVisibility(View.INVISIBLE);
        }
        if (counter == 0) {
            textLeftButton.setVisibility(View.GONE);
            textRightButton.setVisibility(View.VISIBLE);
            titleTextView.setVisibility(View.VISIBLE);
            instructionTextView.setVisibility(View.GONE);
        }
        if (counter == 5) {
            textLeftButton.setVisibility(View.VISIBLE);
            textLeftButton.setText("May the Code by with You!");
            textRightButton.setVisibility(View.GONE);
        }
        pageCounterTextView.setText(counter + "/5");



        //
        //Update principalImageView and instructionTextView based on counter value
        //

        if (counter == 0) {
            principalImageView.setImageResource(R.drawable.img);
        }
        if (counter == 1) {
            principalImageView.setImageResource(R.drawable.img1);
            String htmlText = "Join the nearest <A HREF='https://developers.google.com/groups/?hl=it'>Google Developer Group.</A>"
                    + "<br><br>Search on Google for your city.";
            instructionTextView.setText(Html.fromHtml(htmlText));
            //needed to enable click on the link
            instructionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (counter == 2) {
            principalImageView.setImageResource(R.drawable.img2);
            String htmlText = "Go to class and go straight through the adversity with the <A HREF='https://plus.google.com/communities/105153134372062985968'>community</A> support."
                    + "<br><br>Teacher are more useful than you think, don't be shy!";
            instructionTextView.setText(Html.fromHtml(htmlText));
            //needed to enable click on the link
            instructionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (counter == 3) {
            principalImageView.setImageResource(R.drawable.img3);
            instructionTextView.setText("Very important!!" + "\n" + "\nDON'T GIVE UP!!" + "\n" + "\nDon't be afraid, because all people before of you have had the same problems.");
        }
        if (counter == 4) {
            principalImageView.setImageResource(R.drawable.img4);
            String htmlText = "Use the following sites to help you to importing features written by other people from the community."
                    + "<br><br><A HREF='https://github.com/'>GitHub</A>"
                    + "<br><br><A HREF='http://stackoverflow.com/'>StackOverflow</A>"
                    + "<br><br>Share your code!";
            instructionTextView.setText(Html.fromHtml(htmlText));
            //needed to enable click on the link
            instructionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (counter == 5) {
            principalImageView.setImageResource(R.drawable.img5);
            String htmlText = "Design the user interface using <A HREF='https://www.google.com/design/spec/material-design/introduction.html'>Google material design guidelines.</A>"
                    + "<br><br>Get inspired by other apps you already use.";
            instructionTextView.setText(Html.fromHtml(htmlText));
            //needed to enable click on the link
            instructionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
