package com.example.android.quiz_o_matic3000;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /** Declaration of the constant of # of questions **/
    private final int NUMBER_OF_QUESTIONS = 10;

    /** Declaration of key global variables: # of unanswered, right and wrong answers **/
    private int numberOfErrors;
    private int numberOfRight;
    private int numberOfUnanswered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view){
        numberOfErrors = 0;
        numberOfRight = 0;
        numberOfUnanswered = NUMBER_OF_QUESTIONS;

        checkQuestion1();
        checkQuestion2();
        checkQuestion3();
        checkQuestion4();
        checkQuestion5();
        checkQuestion6();
        checkQuestion7();
        checkQuestion8();
        checkQuestion9();
        checkQuestion10();

        if (numberOfRight == 10)
        {
            Toast.makeText(this, getString(R.string.toast_win), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, getString(R.string.toast_errors, numberOfErrors, numberOfRight, numberOfUnanswered), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     *  Gets Question 1 answers and checks if the answer is right
     */
    private void checkQuestion1(){
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.a1_yes);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.a1_no);

        if (radioButton2.isChecked()){
            numberOfRight++;
            numberOfUnanswered--;

        } else if(radioButton1.isChecked()){
            numberOfErrors++;
            numberOfUnanswered--;
        }
    }

    /**
     *  Gets Question 2 answers and checks if the answer is right
     */
    private void checkQuestion2(){
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.a2_yes);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.a2_no);

        if (radioButton1.isChecked()){
            numberOfRight++;
            numberOfUnanswered--;

        } else if(radioButton2.isChecked()){
            numberOfErrors++;
            numberOfUnanswered--;
        }
    }

    /**
     *  Gets Question 3 answers and checks if the answer is right
     */
    private void checkQuestion3(){
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.a3_yes);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.a3_no);

        if (radioButton1.isChecked()){
            numberOfRight++;
            numberOfUnanswered--;

        } else if(radioButton2.isChecked()){
            numberOfErrors++;
            numberOfUnanswered--;
        }
    }

    /**
     *  Gets Question 4 answers and checks if the answer is right
     */
    private void checkQuestion4(){
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.a4_yes);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.a4_no);

        if (radioButton2.isChecked()){
            numberOfRight++;
            numberOfUnanswered--;

        } else if(radioButton1.isChecked()){
            numberOfErrors++;
            numberOfUnanswered--;
        }
    }

    /**
     *  Gets Question 5 answer and checks if the answer is right
     */
    private void checkQuestion5(){
        EditText editText = (EditText) findViewById(R.id.a5_text);
        String userText = editText.getText().toString().toLowerCase();

        if (userText.contains(getString(R.string.a5_answer).toLowerCase())){
            numberOfRight++;
            numberOfUnanswered--;

        } else if(!editText.getText().toString().isEmpty()) {
            numberOfErrors++;
            numberOfUnanswered--;
        }
    }

    /**
     *  Gets Question 6 answers and checks if the answer is right
     */
    private void checkQuestion6(){
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.a6_1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.a6_2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.a6_3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.a6_4);

        if (checkBox1.isChecked() && checkBox3.isChecked() && !checkBox2.isChecked() && !checkBox4.isChecked()){
            numberOfRight++;
            numberOfUnanswered--;

        } else if (checkBox1.isChecked() || checkBox3.isChecked() || checkBox2.isChecked() || checkBox4.isChecked()){
            numberOfErrors++;
            numberOfUnanswered--;
        }
    }

    /**
     *  Gets Question 7 answers and checks if the answer is right
     */
    private void checkQuestion7(){
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.a7_yes);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.a7_no);

        if (radioButton1.isChecked()){
            numberOfRight++;
            numberOfUnanswered--;

        } else if(radioButton2.isChecked()){
            numberOfErrors++;
            numberOfUnanswered--;
        }
    }

    /**
     *  Gets Question 8 answers and checks if the answer is right
     */
    private void checkQuestion8(){
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.a8_yes);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.a8_no);

        if (radioButton1.isChecked()){
            numberOfRight++;
            numberOfUnanswered--;

        } else if(radioButton2.isChecked()){
            numberOfErrors++;
            numberOfUnanswered--;
        }
    }

    /**
     *  Gets Question 9 answers and checks if the answer is right
     */
    private void checkQuestion9(){
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.a9_yes);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.a9_no);

        if (radioButton2.isChecked()){
            numberOfRight++;
            numberOfUnanswered--;

        } else if(radioButton1.isChecked()){
            numberOfErrors++;
            numberOfUnanswered--;
        }
    }

    /**
     *  Gets Question 10 answers and checks if the answer is right
     */
    private void checkQuestion10(){
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.a10_yes);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.a10_no);

        if (radioButton1.isChecked()){
            numberOfRight++;
            numberOfUnanswered--;

        } else if(radioButton2.isChecked()){
            numberOfErrors++;
            numberOfUnanswered--;
        }
    }
}
