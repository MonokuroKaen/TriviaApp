package com.example.android.triviaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    int score = 0;

    //All the correct global variable for EditText field, RadioButtons & Checkboxes.
    //Question 1
    private RadioGroup answerQuestionOneGroup;
    private RadioButton answerOne;
    //Question 2
    private EditText countryName;
    //Question 3
    private RadioGroup answerQuestionThreeGroup;
    private RadioButton answerThree;
    //Question 4
    private CheckBox pacificRim;
    private CheckBox starTrek;
    private CheckBox transformer;
    private CheckBox theExpendables;
    private CheckBox starWar;
    //Question Five
    private CheckBox digimon;
    private CheckBox monsterHunter;
    private CheckBox theSims;
    private CheckBox godEater;
    private CheckBox pokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//Starts the findViewById global variables

    //Question1 (RadioButton View)
    answerQuestionOneGroup = (RadioGroup) findViewById(R.id.question1);
    answerOne = (RadioButton) findViewById(R.id.button_4);
    //Question 2 (EditText View)
    countryName = (EditText)  findViewById(R.id.wakanda);
    //Question 3 (RadioButton View)
    answerQuestionThreeGroup = (RadioGroup) findViewById(R.id.question3);
    answerThree = (RadioButton) findViewById(R.id.button_7);
    //Question 4 (Checkbox View)
    pacificRim = (CheckBox) findViewById(R.id.checkbox1);
    starTrek = (CheckBox) findViewById(R.id.checkbox2);
    theExpendables = (CheckBox) findViewById(R.id.checkbox3);
    transformer = (CheckBox) findViewById(R.id.checkbox4);
    starWar = (CheckBox) findViewById(R.id.checkbox5);
    //Question 5 (Checkbox View)
    digimon = (CheckBox) findViewById(R.id.checkbox6);
    monsterHunter = (CheckBox) findViewById(R.id.checkbox7);
    theSims = (CheckBox) findViewById(R.id.checkbox8);
    godEater = (CheckBox) findViewById(R.id.checkbox9);
    pokemon = (CheckBox) findViewById(R.id.checkbox10);

    /**
     *  This Method calculate the score based on the amount of correct answers
     */
    public void submitAnswers (View view) {
        //Check for answers in question one (RadioButton View)
        if (answerOne.isChecked()) {
            score = score + 1;
        }

        //Check for answers in question two (EditTextView)
        String answerTwo = countryName.getText().toString();
        if (answerTwo.equalsIgnoreCase("wakanda")) {
            score = score + 1;
        }

        //Check for answers in question three (RadioButton View)
        if (answerThree.isChecked()) {
            score = score + 1;
        }

        //check for answers in question four (CheckBox View)
        if (pacificRim.isChecked() && transformer.isChecked()) {
            score = score + 2;
        }

        //check for answers in question Five (Checkbox View)
        if (godEater.isChecked() && monsterHunter.isChecked()) {
            score = score + 2;
        }

        if (score >= 3) {
            Toast.makeText(getBaseContext(), "Awesome Job! Your Final Score is: " + score + " out of 7.", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getBaseContext(), "Your score is: " + score + "out of 7. Try Again!", Toast.LENGTH_LONG).show();

        }
    }

    public void reset (View view) {
        //reset score
        score = 0;
        //reset question 1
        answerQuestionOneGroup.clearCheck();
        //reset question 2
        countryName.setText("");
        //reset question 3
        answerQuestionThreeGroup.clearCheck();
        //reset question 4
        pacificRim.setChecked(false);
        transformer.setChecked(false);
        theExpendables.setChecked(false);
        starTrek.setChecked(false);
        starWar.setChecked(false);
        //reset question 5
        monsterHunter.setChecked(false);
        godEater.setChecked(false);
        digimon.setChecked(false);
        theSims.setChecked(false);
        pokemon.setChecked(false);
    }
}
