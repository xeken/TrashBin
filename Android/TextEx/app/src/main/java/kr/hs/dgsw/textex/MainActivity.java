package kr.hs.dgsw.textex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button save;
    private EditText topText, mainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        save = findViewById(R.id.button);
        topText = findViewById(R.id.topText);
        mainText = findViewById(R.id.mainText);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(topText.getText().toString().equals("")  || topText.getText().toString().equals(null) )
                    Toast.makeText(MainActivity.this,"제목이 없읍니다.", Toast.LENGTH_SHORT).show();
                else if(mainText.getText().toString().equals("") || mainText.getText().toString().equals(null) )
                    Toast.makeText(MainActivity.this ,"본문 내용이 없읍니다.", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this ,"저장 되었읍니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
