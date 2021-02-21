package com.example.java_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    List<Question>questions;

    public QuestionAdapter(Context context, List<Question> questions) {
        this.inflater = LayoutInflater.from(context);
        this.questions = questions;
    }

    @NonNull
    @Override
    public QuestionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionAdapter.ViewHolder holder, int position) {
        Question question = questions.get(position);
        holder.imageView.setImageResource(question.getImage());
        holder.question.setText(question.getId()+"."+question.getQuestion());
        holder.radioButton.setText(question.getFist());
        holder.radioButton1.setText(question.getSecond());
        holder.radioButton2.setText(question.getThird());
        holder.radioButton3.setText(question.getFourth());
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView question;
        final RadioButton radioButton;
        final RadioButton radioButton1;
        final RadioButton radioButton2;
        final RadioButton radioButton3;
        ViewHolder(View view){
            super(view);
            imageView = (ImageView)view.findViewById(R.id.imageFilterView2);
            question = (TextView) view.findViewById(R.id.textView);
            radioButton=(RadioButton) view.findViewById(R.id.radioButton);
            radioButton1 =(RadioButton) view.findViewById(R.id.radioButton2);
            radioButton2= (RadioButton) view.findViewById(R.id.radioButton3);
            radioButton3= (RadioButton) view.findViewById(R.id.radioButton4);
        }
    }
}
