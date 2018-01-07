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


public class GeographyActivity extends AppCompatActivity {
    int score;
    String playerN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography);
        TextView message = (TextView) findViewById(R.id.welcome_message_geography);
        String playerName = getIntent().getStringExtra("etName");
        message.setText(getString(R.string.welcome_message_geography_quiz) + playerName);
        playerN = playerName;
    }

    public void getScore(View view) {
        /**
         * Defining the EditText
         */
        EditText geo_et_one = (EditText) findViewById(R.id.geo_et_one);
        EditText geo_et_two = (EditText) findViewById(R.id.geo_et_two);
        EditText geo_et_three = (EditText) findViewById(R.id.geo_et_five);
        EditText geo_et_four = (EditText) findViewById(R.id.geo_et_seven);
        EditText geo_et_five = (EditText) findViewById(R.id.geo_et_eight);
        EditText geo_et_six = (EditText) findViewById(R.id.geo_et_ten);
        /**
         * Defining the RadioButtons which are correct answers
         */
        RadioButton rb_geo_one = (RadioButton) findViewById(R.id.rb_geo3a);
        RadioButton rb_geo_two = (RadioButton) findViewById(R.id.rb_geo4c);
        RadioButton rb_geo_three = (RadioButton) findViewById(R.id.rb_geo6a);
        boolean rb_one = rb_geo_one.isChecked();
        boolean rb_two = rb_geo_two.isChecked();
        boolean rb_three = rb_geo_three.isChecked();
        /**
         * Defining the CheckBoxes
         */
        CheckBox cb_geo_one = (CheckBox) findViewById(R.id.geography_cb_a);
        CheckBox cb_geo_two = (CheckBox) findViewById(R.id.geography_cb_b);
        CheckBox cb_geo_three = (CheckBox) findViewById(R.id.geography_cb_c);
        CheckBox cb_geo_four = (CheckBox) findViewById(R.id.geography_cb_d);
        boolean cb_one = cb_geo_one.isChecked();
        boolean cb_two = cb_geo_two.isChecked();
        boolean cb_three = cb_geo_three.isChecked();
        boolean cb_four = cb_geo_four.isChecked();
        /**
         * Saving the EditText input in a variable
         */
        String questionOne = geo_et_one.getText().toString().trim();
        String questionTwo = geo_et_two.getText().toString().trim();
        String questionThree = geo_et_three.getText().toString().trim();
        String questionFour = geo_et_four.getText().toString().trim();
        String questionFive = geo_et_five.getText().toString().trim();
        String questionSix = geo_et_six.getText().toString().trim();
        /**
         * Checking if all the answers are correct and calculate score
         */
        if (questionOne.equalsIgnoreCase(getString(R.string.geo_et_answ_one))) {
            score++;
        }
        if (questionTwo.equalsIgnoreCase(getString(R.string.geo_et_answ_two))) {
            score++;
        }
        if (questionThree.equalsIgnoreCase(getString(R.string.geo_et_answ_three))) {
            score++;
        }
        if (questionFour.equalsIgnoreCase(getString(R.string.geo_et_answ_four))) {
            score++;
        }
        if (questionFive.equalsIgnoreCase(getString(R.string.geo_et_answ_five))) {
            score++;
        }
        if (questionSix.equalsIgnoreCase(getString(R.string.geo_et_answ_six))) {
            score++;
        }
        if (rb_one) {
            score++;
        }
        if (rb_two) {
            score++;
        }
        if (rb_three) {
            score++;
        }
        if (cb_one && !cb_two && cb_three && !cb_four) {
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

    /**
     * Resetting everything to initial value
     *
     * @param view
     */
    public void resetAll(View view) {
        score = 0;
        EditText geo_et_one = (EditText) findViewById(R.id.geo_et_one);
        EditText geo_et_two = (EditText) findViewById(R.id.geo_et_two);
        EditText geo_et_three = (EditText) findViewById(R.id.geo_et_five);
        EditText geo_et_four = (EditText) findViewById(R.id.geo_et_seven);
        EditText geo_et_five = (EditText) findViewById(R.id.geo_et_eight);
        EditText geo_et_six = (EditText) findViewById(R.id.geo_et_ten);
        geo_et_one.setText(null);
        geo_et_two.setText(null);
        geo_et_three.setText(null);
        geo_et_four.setText(null);
        geo_et_five.setText(null);
        geo_et_six.setText(null);
        CheckBox cb_geo_one = (CheckBox) findViewById(R.id.geography_cb_a);
        CheckBox cb_geo_two = (CheckBox) findViewById(R.id.geography_cb_b);
        CheckBox cb_geo_three = (CheckBox) findViewById(R.id.geography_cb_c);
        CheckBox cb_geo_four = (CheckBox) findViewById(R.id.geography_cb_d);
        cb_geo_one.setChecked(false);
        cb_geo_two.setChecked(false);
        cb_geo_three.setChecked(false);
        cb_geo_four.setChecked(false);
        RadioButton rb_geo_one = (RadioButton) findViewById(R.id.rb_geo3a);
        RadioButton rb_geo_two = (RadioButton) findViewById(R.id.rb_geo4c);
        RadioButton rb_geo_three = (RadioButton) findViewById(R.id.rb_geo6a);
        RadioButton rb_geo_four = (RadioButton) findViewById(R.id.rb_geo3b);
        RadioButton rb_geo_five = (RadioButton) findViewById(R.id.rb_geo4a);
        RadioButton rb_geo_six = (RadioButton) findViewById(R.id.rb_geo6b);
        RadioButton rb_geo_seven = (RadioButton) findViewById(R.id.rb_geo3c);
        RadioButton rb_geo_eight = (RadioButton) findViewById(R.id.rb_geo4b);
        RadioButton rb_geo_nine = (RadioButton) findViewById(R.id.rb_geo6c);
        rb_geo_one.setChecked(false);
        rb_geo_two.setChecked(false);
        rb_geo_three.setChecked(false);
        rb_geo_four.setChecked(false);
        rb_geo_five.setChecked(false);
        rb_geo_six.setChecked(false);
        rb_geo_seven.setChecked(false);
        rb_geo_eight.setChecked(false);
        rb_geo_nine.setChecked(false);

    }

    public void redirectH(View view) {
        Intent intent = new Intent(GeographyActivity.this, HistoryActivity.class);
        intent.putExtra("etName", playerN);
        startActivity(intent);
    }
}