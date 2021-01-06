package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mTextView;
    private EditText mEditText;
    private TextView mShowName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.mButton);
        mButton.setText(R.string.button_name);
        mTextView = (TextView) findViewById(R.id.mTextView);
        mTextView.setText(R.string.show_me);

        mEditText = (EditText) findViewById(R.id.mEditText);
        mShowName = (TextView) findViewById(R.id.mShowName);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredText;
                enteredText = mEditText.getText().toString();
                mShowName.setVisibility(View.VISIBLE);
                mShowName.setText(enteredText);
            }
        });





    }



//    public void showMe(View view){
//        mTextView.setText(R.string.show_me);
//        mButton.setText(R.string.new_button_name);
//    }


}