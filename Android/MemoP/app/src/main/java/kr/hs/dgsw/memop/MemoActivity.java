package kr.hs.dgsw.memop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

import kr.hs.dgsw.memop.Domain.Memo;
import kr.hs.dgsw.memop.List.DBHelper;

public class MemoActivity extends AppCompatActivity {

    private Memo memo;
    private DBHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);
        final EditText editTitle = findViewById(R.id.editTitle);
        final EditText editContent = findViewById(R.id.editContent);
        Button buttonStore = findViewById(R.id.buttonStore);
        Button buttonDelete = findViewById(R.id.buttonDelete);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        helper = new DBHelper(this, "memoDB", null, 1);

        Intent i = getIntent();
        memo = helper.get(i.getIntExtra("memoId", -444));

        if (memo != null) {

            editTitle.setText(memo.getMemoTitle());
            editContent.setText(memo.getMemoContent());
        } else buttonDelete.setEnabled(false);


        buttonStore.setOnClickListener(v -> {

            String title = editTitle.getText().toString();
            String content = editContent.getText().toString();

            Memo testMemo = new Memo(title, content);

            if (memo != null) {

                testMemo.setMemoId(memo.getMemoId());
                helper.update(testMemo);
            } else {
                helper.insert(testMemo);
            }
            setResult(RESULT_OK);
            finish();
        });

        buttonDelete.setOnClickListener(v -> {

            if (memo == null) return;

            helper.delete(memo);
            setResult(RESULT_OK);
            finish();
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return false;
    }
}
