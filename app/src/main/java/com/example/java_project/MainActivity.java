package com.example.java_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Question>questions=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final TextView textView=(TextView) findViewById(R.id.textView);
        final ImageView imageView=(ImageView) findViewById(R.id.imageFilterView2);
        final RadioButton radioButton= (RadioButton) findViewById(R.id.radioButton);
        final RadioButton radioButton1=(RadioButton) findViewById(R.id.radioButton2);
        final RadioButton radioButton2=(RadioButton) findViewById(R.id.radioButton3);
        final RadioButton radioButton3=(RadioButton) findViewById(R.id.radioButton4);
        textView.setText(question.id+"."+ question.question);
        imageView.setImageResource(R.drawable.q1uestion);
        radioButton.setText(question.fist);
        radioButton1.setText(question.second);
        radioButton2.setText(question.third);
        radioButton3.setText(question.fourth);*/
        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        QuestionAdapter adapter = new QuestionAdapter(this, questions);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);

    }

    private void setInitialData() {
        Question question=new Question(1,R.drawable.q1uestion,"In which country is the city of Cincinnati located?"
                ,"Italy","Spain","USA","Canada","USA");
        Question question1=new Question(2,R.drawable.q2niderland,"Which state flag is shown in the photo?"
                ,"France","Russia","Slovakia","Netherlands","Netherlands");
        Question question2=new Question(3,R.drawable.noroot,"Which state flag is shown in the photo?"
                ,"France","Russia","Slovakia","Netherlands","Netherlands");
        Question question3=new Question(4,R.drawable.q4greenland,"Which state flag is shown in the photo?"
                ,"France","Russia","Slovakia","Netherlands","Netherlands");
        Question question4=new Question(5,R.drawable.atakama,"Which state flag is shown in the photo?"
                ,"France","Russia","Slovakia","Netherlands","Netherlands");

        questions.add(question);
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);

    }
}