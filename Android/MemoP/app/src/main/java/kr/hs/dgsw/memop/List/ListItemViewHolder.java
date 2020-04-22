package kr.hs.dgsw.memop.List;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import kr.hs.dgsw.memop.R;

public class ListItemViewHolder extends RecyclerView.ViewHolder {

    TextView textViewTitle;
    TextView textViewContent;
    TextView textViewDate;

    public ListItemViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewTitle = itemView.findViewById(R.id.textViewTitle);
        textViewContent = itemView.findViewById(R.id.textViewContent);
        textViewDate = itemView.findViewById(R.id.textViewDate);
    }
}
