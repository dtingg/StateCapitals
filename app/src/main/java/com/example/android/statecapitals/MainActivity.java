package com.example.android.statecapitals;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton albanyRB;
    RadioButton austinRB;
    RadioButton lansingRB;
    RadioButton concordRB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        albanyRB = findViewById(R.id.albany);
        austinRB = findViewById(R.id.austin);
        lansingRB = findViewById(R.id.lansing);
        concordRB = findViewById(R.id.concord);
    }

    //Capital of New York
    public int questionOne() {
        if (albanyRB.isChecked()) {
            return 1;
        }
        return 0;
    }

    //Capital of Texas
    public int questionTwo() {
        if (austinRB.isChecked()) {
            return 1;
        }
        return 0;
    }

    //Capital of Michigan
    public int questionThree() {
        if (lansingRB.isChecked()) {
            return 1;
        }
        return 0;
    }

    //Capital of New Hampshire
    public int questionFour() {
        if (concordRB.isChecked()) {
            return 1;
        }
        return 0;
    }

    //Capital of Washington State
    public int questionFive() {
        EditText q5Text = findViewById(R.id.q5Text);
        String q5Answer = q5Text.getText().toString();
        if (q5Answer.equals("Olympia")) {
            return 1;
        }
        return 0;
    }

    //State Capitals who have hosted the Olympics
    public int questionSix() {
        CheckBox atlantaBox = findViewById(R.id.atlanta);
        CheckBox lakePlacidBox = findViewById(R.id.lakePlacid);
        CheckBox losAngelesBox = findViewById(R.id.losAngeles);
        CheckBox saltLakeCityBox = findViewById(R.id.saltLakeCity);
        CheckBox squawValleyBox = findViewById(R.id.squawValley);
        CheckBox stLouisBox = findViewById(R.id.stLouis);

        if (atlantaBox.isChecked() && !lakePlacidBox.isChecked() && !losAngelesBox.isChecked() && saltLakeCityBox.isChecked() && !squawValleyBox.isChecked() && !stLouisBox.isChecked()) {
            return 1;
        }
        return 0;
    }

    //Grade Quiz
    public void gradeQuiz(View view) {
        int questionOne = questionOne();
        int questionTwo = questionTwo();
        int questionThree = questionThree();
        int questionFour = questionFour();
        int questionFive = questionFive();
        int questionSix = questionSix();
        int correct = questionOne + questionTwo + questionThree + questionFour + questionFive + questionSix;

        displayCorrect(correct);
    }

    //Toast message with player name and number correct
    public void displayCorrect(int correct) {
        EditText Name = findViewById(R.id.name_field);
        String playerName = Name.getText().toString();
        Toast.makeText(this, playerName + ", your score is: " + correct + " out of 6.", Toast.LENGTH_LONG).show();
    }

    //Reset quiz
    public void resetQuiz(View view) {
        EditText playerName = findViewById(R.id.name_field);
        playerName.getText().clear();

        RadioGroup q1RGroup = findViewById(R.id.q1RGroup);
        q1RGroup.clearCheck();

        RadioGroup q2RGroup = findViewById(R.id.q2RGroup);
        q2RGroup.clearCheck();

        RadioGroup q3RGroup = findViewById(R.id.q3RGroup);
        q3RGroup.clearCheck();

        RadioGroup q4RGroup = findViewById(R.id.q4RGroup);
        q4RGroup.clearCheck();

        EditText q5Text = findViewById(R.id.q5Text);
        q5Text.getText().clear();

        CheckBox atlantaBox = findViewById(R.id.atlanta);
        CheckBox lakePlacidBox = findViewById(R.id.lakePlacid);
        CheckBox losAngelesBox = findViewById(R.id.losAngeles);
        CheckBox saltLakeCityBox = findViewById(R.id.saltLakeCity);
        CheckBox squawValleyBox = findViewById(R.id.squawValley);
        CheckBox stLouisBox = findViewById(R.id.stLouis);

        atlantaBox.setChecked(false);
        lakePlacidBox.setChecked(false);
        losAngelesBox.setChecked(false);
        saltLakeCityBox.setChecked(false);
        squawValleyBox.setChecked(false);
        stLouisBox.setChecked(false);
    }
}
