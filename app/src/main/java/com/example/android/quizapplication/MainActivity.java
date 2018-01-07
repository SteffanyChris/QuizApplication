package com.example.android.quizapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * binding the xml buttons to java code
         */
        Button historyButton = (Button) findViewById(R.id.history_button);
        Button geographyButton = (Button) findViewById(R.id.geography_button);
        /**
         * Methods called when the buttons are pressed
         */
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etName =(EditText) findViewById(R.id.edit_text_name);
                String name=etName.getText().toString();
                Intent intent = new Intent(MainActivity.this,HistoryActivity.class);
                intent.putExtra("etName",name);
                startActivity(intent);
            }
        });
        geographyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etName =(EditText) findViewById(R.id.edit_text_name);
                String name=etName.getText().toString();
                Intent intent=new Intent(MainActivity.this , GeographyActivity.class);
                intent.putExtra("etName", name);
                startActivity(intent);
            }
        });
    }

    /**
     * Get't the name that the user type in the EditText
     * Stores the typed data in a variable
     * @return
     */

    public void emailMe(View view){
        Intent intent= new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(intent.EXTRA_EMAIL,new String[] {"quizSupport@gmail.com"});
        if(intent.resolveActivity(getPackageManager())!= null){
            startActivity(intent);
        }
    }

}
