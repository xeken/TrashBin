package kr.hs.dgsw.memosam.activity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import kr.hs.dgsw.memosam.dabaBase.MemoDBHelper;
import kr.hs.dgsw.memosam.domain.MemoBean;
import kr.hs.dgsw.memosam.R;
import kr.hs.dgsw.memosam.recyclerView.ItemClickListener;
import kr.hs.dgsw.memosam.recyclerView.MemoAdapter;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    public static final int REQ_MEMO = 444;
    private ArrayList<MemoBean> data;
    private MemoDBHelper helper;

    private RecyclerView recyclerView;
    private MemoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new MemoDBHelper(this, "db", null, 1);
        data = helper.get();

        recyclerView = findViewById(R.id.recyclerView);
        adapter = new MemoAdapter(data, this);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode != REQ_MEMO) return;

        this.data = helper.get();
        adapter.notifyDataSetChanged();
    }

    public void onButtonNew(View v){

        Intent i = new Intent(this, MemoActivity.class);
        startActivityForResult(i, REQ_MEMO);
    }

    @Override
    public void onItemClick(View view, int i) {

        Intent intent = new Intent(this, MemoActivity.class);
        intent.putExtra("id", data.get(i).getId());

        startActivityForResult(intent, REQ_MEMO);
    }
}
