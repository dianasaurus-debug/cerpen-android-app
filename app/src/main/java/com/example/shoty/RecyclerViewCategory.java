package com.example.shoty;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewCategory extends RecyclerView.Adapter<RecyclerViewCategory.MyView> {

    private List<String> list;

    public class MyView extends RecyclerView.ViewHolder {

        public TextView textView;

        public MyView(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.textview1);
        }
    }

    public RecyclerViewCategory(List<String> horizontalList) {
        this.list = horizontalList;
    }

    @Override
    public MyView onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_item, parent, false);
        return new MyView(itemView);
    }
    int row_index=0;
    @Override
    public void onBindViewHolder(final MyView holder, final int position) {
        CardView cardview = (CardView)holder.itemView.findViewById(R.id.cardview);
        holder.textView.setText(list.get(position));
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index=position;
                notifyDataSetChanged();
            }
        });
        if(row_index==position){
            cardview.setCardBackgroundColor(Color.rgb(181, 189, 201));
        }
        else
        {
            if (position == 0) {
                cardview.setCardBackgroundColor(Color.parseColor("#FF9800"));
            }
            else if (position == 1) {
                cardview.setCardBackgroundColor(Color.rgb(255, 176, 217));
            }
            else if(position == 2){
                cardview.setCardBackgroundColor(Color.BLACK);
            }
            else if(position == 3){
                cardview.setCardBackgroundColor(Color.rgb(156, 120, 150));
            }
            else if(position == 4){
                cardview.setCardBackgroundColor(Color.rgb(135, 134, 191));
            }
            else if(position == 5){
                cardview.setCardBackgroundColor(Color.rgb(15, 148, 141));
            }
            else if(position == 6){
                cardview.setCardBackgroundColor(Color.rgb(207, 166, 64));
            }
            else if(position == 7){
                cardview.setCardBackgroundColor(Color.rgb(168, 173, 10));
            }
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
