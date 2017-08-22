package com.bit.todolist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by suin on 2017-08-21.
 */

public class ToDoViewHolder extends RecyclerView.ViewHolder {
    TextView txt_item_date = null;
    TextView txt_item_memo = null;


    public ToDoViewHolder(View itemView) {
        super(itemView);

        txt_item_date = (TextView) itemView.findViewById(R.id.txt_item_date);
        txt_item_memo = (TextView) itemView.findViewById(R.id.txt_item_memo);


    }
}
