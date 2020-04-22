package kr.hs.dgsw.memop;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import kr.hs.dgsw.memop.Domain.Memo;
import kr.hs.dgsw.memop.List.DBHelper;
import kr.hs.dgsw.memop.List.ItemClickListener;
import kr.hs.dgsw.memop.List.ListAdapter;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private DBHelper helper;
    private ArrayList<Memo> memos;
    private RecyclerView recyclerView;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new DBHelper(this, "memoDB", null, 1);
        memos = helper.getAll();
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new ListAdapter(memos, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Button buttonNewMemo = findViewById(R.id.buttonNewMemo);
        buttonNewMemo.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, MemoActivity.class);
            startActivityForResult(i,444);
        });
    }

    @Override
    public void onItemClick(View v, int Postion, int memoId) {
        Intent i = new Intent(MainActivity.this, MemoActivity.class);
        i.putExtra("memoId", memoId);
        startActivityForResult(i,444);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 444 && resultCode == RESULT_OK){

            memos.clear();
            memos.addAll(helper.getAll());
            adapter.notifyDataSetChanged();
        }
    }
}
