package kr.hs.dgsw.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton easy = findViewById(R.id.radioButtonEASY);
        RadioButton hard = findViewById(R.id.radioButtonHARD);
    }

    public void onSetting(View view){
        //설정버튼 누를떄 온클릭리스너임
        startActivity(new Intent(this, QuestionActivity.class));
    }
}
