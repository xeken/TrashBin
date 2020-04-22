package kr.hs.dgsw.memop.List;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import kr.hs.dgsw.memop.Domain.Memo;
import kr.hs.dgsw.memop.MainActivity;
import kr.hs.dgsw.memop.R;

public class ListAdapter extends RecyclerView.Adapter<ListItemViewHolder> {

    private ArrayList<Memo> memos;
    private ItemClickListener listener;

    public ListAdapter(ArrayList<Memo> memos, ItemClickListener listener) {
        this.memos = memos;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ListItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.memo_item, viewGroup, false);
        return new ListItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListItemViewHolder listItemViewHolder, int i) {

        final Memo memo = memos.get(i);
        listItemViewHolder.textViewTitle.setText(memo.getMemoTitle());
        listItemViewHolder.textViewContent.setText(String.valueOf(memo.getMemoContent()));
        listItemViewHolder.textViewDate.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA).format(new Date(memo.getDate())));

        listItemViewHolder.itemView.setOnClickListener(v->{
            listener.onItemClick(v, listItemViewHolder.getAdapterPosition(), memo.getMemoId());
        });
    }

    @Override
    public int getItemCount() {

        if(memos == null)
            return 0;
        else
            return memos.size();
    }
}
