package kr.hs.dgsw.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class QuestionListActivity extends AppCompatActivity {

    private String password = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_list);
    }

    public void onConfirm(View v){

        EditText editTextpassword = findViewById(R.id.editTextPassword);
        if(password.equals(editTextpassword.getText().toString()))
            findViewById(R.id.layoutPassword).setVisibility(View.GONE);
        else{
            Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
