package com.example.android.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class HistoryActivity extends AppCompatActivity {
    int score = 0;
    String playerN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        TextView message = (TextView) findViewById(R.id.welcome_message_history);
        String playerName = getIntent().getStringExtra("etName");
        message.setText(getString(R.string.welcome_message_history_quiz) + playerName);
        playerN = playerName;
    }

    public void getScore(View view) {
        /**
         * Getting the EditText from XML
         */
        EditText et_history_one = (EditText) findViewById(R.id.history_et_one);
        EditText et_history_two = (EditText) findViewById(R.id.history_et_four);
        EditText et_history_three = (EditText) findViewById(R.id.history_et_five);
        EditText et_history_four = (EditText) findViewById(R.id.history_et_seven);
        EditText et_history_five = (EditText) findViewById(R.id.history_et_eight);
        EditText et_history_six = (EditText) findViewById(R.id.history_et_nine);
        /**
         * Getting all CheckBoxes from xml
         */
        CheckBox cb_history_one = (CheckBox) findViewById(R.id.history_cb_1a);
        CheckBox cb_history_two = (CheckBox) findViewById(R.id.history_cb_1b);
        CheckBox cb_history_three = (CheckBox) findViewById(R.id.history_cb_1c);
        CheckBox cb_history_four = (CheckBox) findViewById(R.id.history_cb_1d);
        CheckBox cb_history_five = (CheckBox) findViewById(R.id.history_cb_3a);
        CheckBox cb_history_six = (CheckBox) findViewById(R.id.history_cb_3b);
        CheckBox cb_history_seven = (CheckBox) findViewById(R.id.history_cb_3c);
        CheckBox cb_history_eight = (CheckBox) findViewById(R.id.history_cb_3d);
        /**
         * Getting the input value from the EditText and storing it in a variable
         */
        String questionOne = et_history_one.getText().toString().trim();
        String questionTwo = et_history_two.getText().toString().trim();
        String questionThree = et_history_three.getText().toString().trim();
        String questionFour = et_history_four.getText().toString().trim();
        String questionFive = et_history_five.getText().toString().trim();
        String questionSix = et_history_six.getText().toString().trim();
        /**
         * Giving to all the CheckBoxes value true for isChecked()
         */
        boolean cb_h_one = cb_history_one.isChecked();
        boolean cb_h_two = cb_history_two.isChecked();
        boolean cb_h_three = cb_history_three.isChecked();
        boolean cb_h_four = cb_history_four.isChecked();
        boolean cb_h_five = cb_history_five.isChecked();
        boolean cb_h_six = cb_history_six.isChecked();
        boolean cb_h_seven = cb_history_seven.isChecked();
        boolean cb_h_eight = cb_history_eight.isChecked();
        /**
         * Define radio buttons
         */
        RadioButton rb_history_two = (RadioButton) findViewById(R.id.rb_history_1b);
        RadioButton rb_history_six = (RadioButton) findViewById(R.id.rb_history_2c);
        boolean rb_history_answer_one = rb_history_two.isChecked();
        boolean rb_history_answer_two = rb_history_six.isChecked();
        /**
         * Checking if the input is the right answer
         * If it is score ++
         * Else the score stays the same
         */
        if (questionOne.equalsIgnoreCase(getString(R.string.history_answer_one))) {
            score++;
        }
        if (questionTwo.equalsIgnoreCase(getString(R.string.history_answer_four))) {
            score++;
        }
        if (questionThree.equalsIgnoreCase(getString(R.string.history_answer_five))) {
            score++;
        }
        if (questionFour.equalsIgnoreCase(getString(R.string.history_answer_seven))) {
            score++;
        }
        if (questionFive.equalsIgnoreCase(getString(R.string.history_answer_eight))) {
            score++;
        }
        if (questionSix.equalsIgnoreCase(getString(R.string.history_answer_nine))) {
            score++;
        }
        /**
         * Check the answers from CheckBoxex, and calculates the score
         */
        if (cb_h_one && !cb_h_two && cb_h_three && cb_h_four) {
            score++;
        }
        if (!cb_h_five && cb_h_six && cb_h_seven && !cb_h_eight) {
            score++;
        }
        /**
         * Checking if the player chose the good answer by radio button
         * increase the score or keep it the same depending on case
         */
        if (rb_history_answer_one) {
            score++;
        }
        if (rb_history_answer_two) {
            score++;
        }
        /**
         * Checking the score and according to it a toast message will appear on the screen
         */
        if (score >= 9) {
            Toast.makeText(this, getString(R.string.toast_message) + score + " " + getString(R.string.toast_m1) + playerN, Toast.LENGTH_LONG).show();
        }
        if (score >= 5 && score < 9) {
            Toast.makeText(this, getString(R.string.toast_message) + score + " " + getString(R.string.toast_m2) + playerN, Toast.LENGTH_LONG).show();
        }
        if (score < 5) {
            Toast.makeText(this, getString(R.string.toast_message) + score + " " + getString(R.string.toast_m3) + playerN, Toast.LENGTH_LONG).show();
        }
        score = 0;
    }

    public void resetAll(View view) {
        score = 0;
        EditText et_history_one = (EditText) findViewById(R.id.history_et_one);
        EditText et_history_two = (EditText) findViewById(R.id.history_et_four);
        EditText et_history_three = (EditText) findViewById(R.id.history_et_five);
        EditText et_history_four = (EditText) findViewById(R.id.history_et_seven);
        EditText et_history_five = (EditText) findViewById(R.id.history_et_eight);
        EditText et_history_six = (EditText) findViewById(R.id.history_et_nine);
        et_history_one.setText(null);
        et_history_two.setText(null);
        et_history_three.setText(null);
        et_history_four.setText(null);
        et_history_five.setText(null);
        et_history_six.setText(null);
        CheckBox cb_history_one = (CheckBox) findViewById(R.id.history_cb_1a);
        CheckBox cb_history_two = (CheckBox) findViewById(R.id.history_cb_1b);
        CheckBox cb_history_three = (CheckBox) findViewById(R.id.history_cb_1c);
        CheckBox cb_history_four = (CheckBox) findViewById(R.id.history_cb_1d);
        CheckBox cb_history_five = (CheckBox) findViewById(R.id.history_cb_3a);
        CheckBox cb_history_six = (CheckBox) findViewById(R.id.history_cb_3b);
        CheckBox cb_history_seven = (CheckBox) findViewById(R.id.history_cb_3c);
        CheckBox cb_history_eight = (CheckBox) findViewById(R.id.history_cb_3d);
        cb_history_one.setChecked(false);
        cb_history_two.setChecked(false);
        cb_history_three.setChecked(false);
        cb_history_four.setChecked(false);
        cb_history_five.setChecked(false);
        cb_history_six.setChecked(false);
        cb_history_seven.setChecked(false);
        cb_history_eight.setChecked(false);
        RadioButton rb_history_one = (RadioButton) findViewById(R.id.rb_history_1a);
        RadioButton rb_history_two = (RadioButton) findViewById(R.id.rb_history_1b);
        RadioButton rb_history_three = (RadioButton) findViewById(R.id.rb_history_1c);
        RadioButton rb_history_four = (RadioButton) findViewById(R.id.rb_history_2a);
        RadioButton rb_history_five = (RadioButton) findViewById(R.id.rb_history_2b);
        RadioButton rb_history_six = (RadioButton) findViewById(R.id.rb_history_2c);
        rb_history_one.setChecked(false);
        rb_history_two.setChecked(false);
        rb_history_three.setChecked(false);
        rb_history_four.setChecked(false);
        rb_history_five.setChecked(false);
        rb_history_six.setChecked(false);
    }

    public void redirect(View view) {
        Intent intent = new Intent(HistoryActivity.this, GeographyActivity.class);
        intent.putExtra("etName", playerN);
        startActivity(intent);
    }
}
