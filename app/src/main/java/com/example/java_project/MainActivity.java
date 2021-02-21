package com.example.java_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Question>questions=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);

        QuestionAdapter adapter = new QuestionAdapter(this, questions);

        recyclerView.setAdapter(adapter);


        Button finishButton=findViewById(R.id.button2);


        RadioButton radioButton=findViewById(R.id.radioButton);
        RadioButton radioButton1=findViewById(R.id.radioButton2);
        RadioButton radioButton2=findViewById(R.id.radioButton3);
        RadioButton radioButton3=findViewById(R.id.radioButton4);
        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(1);
            }
        });


        /*finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //finishQuiz();
            }
        });*/



    }

    private void finishQuiz(){

        Intent intent=new Intent(MainActivity.this,FinishActivity.class);
        startActivity(intent);
    }

    private void  checkAnswer(int a){
        //if(a==Integer.parseInt(questions))
    }

    private void setInitialData() {
        Question question=new Question(1,R.drawable.q1uestion,"In which country is the city of Cincinnati located?"
                ,"Italy","Spain","USA","Canada","3");
        Question question1=new Question(2,R.drawable.q2niderland,"Which state flag is shown in the photo?"
                ,"France","Russia","Slovakia","Netherlands","4");
        Question question2=new Question(3,R.drawable.noroot,"Which state flag is shown in the photo?"
                ,"France","Russia","Slovakia","Netherlands","4");
        Question question3=new Question(4,R.drawable.q4greenland,"Which state flag is shown in the photo?"
                ,"France","Russia","Slovakia","Netherlands","4");
        Question question4=new Question(5,R.drawable.atakama,"Which state flag is shown in the photo?"
                ,"France","Russia","Slovakia","Netherlands","4");

        questions.add(question);
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);

    }
}