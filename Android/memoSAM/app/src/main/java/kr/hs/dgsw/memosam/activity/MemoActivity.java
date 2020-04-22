package kr.hs.dgsw.memosam.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import kr.hs.dgsw.memosam.dabaBase.MemoDBHelper;
import kr.hs.dgsw.memosam.domain.MemoBean;
import kr.hs.dgsw.memosam.R;

public class MemoActivity extends AppCompatActivity {

    private MemoDBHelper helper;
    private int id;
    private MemoBean memoBean;

    private EditText editTextTitle;
    private EditText editTextBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);

        editTextTitle = findViewById(R.id.editTextTitle);
        editTextBody = findViewById(R.id.editTextBody);

        helper = new MemoDBHelper(this, "db", null, 1);
        id = getIntent().getIntExtra("id", -1);

        if(id > -1){

            memoBean = helper.get(id);

            if(memoBean != null){
                editTextTitle.setText(memoBean.getTitle());
                editTextBody.setText(memoBean.getBody());
            }
        }
        else
            memoBean = new MemoBean();
    }

    public void onSave(View v){

        memoBean.setTitle(editTextTitle.getText().toString());
        memoBean.setBody(editTextBody.getText().toString());

        if(id > -1)
            helper.update(memoBean);
        else
            helper.insert(memoBean);

        setResult(RESULT_OK);
        finish();
    }

    public void onDelete(View v){

        if(id > -1){

            helper.delete(id);
            setResult(RESULT_OK);
        }
        finish();
    }
}
