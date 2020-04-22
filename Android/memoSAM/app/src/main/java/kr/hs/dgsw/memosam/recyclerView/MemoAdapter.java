package kr.hs.dgsw.memosam.recyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import kr.hs.dgsw.memosam.domain.MemoBean;
import kr.hs.dgsw.memosam.R;

public class MemoAdapter extends RecyclerView.Adapter<MemoViewHolder> {

    private ArrayList<MemoBean> data;
    private ItemClickListener listener;

    public MemoAdapter(ArrayList<MemoBean> data, ItemClickListener listener){

        this.data = data;
        this.listener = listener;
    }

    @NonNull @Override
    public MemoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.item_memo, viewGroup, false);

        return new MemoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MemoViewHolder memoViewHolder, int i) {

        MemoBean memoBean = data.get(i);
        memoViewHolder.textViewTitle.setText(memoBean.getTitle());
        Date date = new Date(memoBean.getTime());

        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss", Locale.KOREA);
        memoViewHolder.textViewTime.setText(format.format(date));

        memoViewHolder.itemView.setOnClickListener(v -> listener.onItemClick(v, i));

    }

    @Override
    public int getItemCount() {

        if(data == null)
            return 0;

        else
            return data.size();
    }
}
