package edu.asu.msse.ssmishr2.mydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    //onCreate is called whn a new activity is created
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //get the intent Passed over into it.
        Intent intent = getIntent();

        //get the message stored/passed on by intent
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Textview where we going to display the message
        TextView textView = new TextView(this);

        //set the text inside textview
        textView.setText(message);

        //Set the activity content from a layout resource. The resource
        // will be inflated, adding all top-level views to the activity.
        //We can put the textView as this is  an object.
        setContentView(textView);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
