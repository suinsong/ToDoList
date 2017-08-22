package com.bit.todolist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;


/**
 * Created by suin on 2017-08-21.
 */

public class DBAdapter extends RecyclerView.Adapter<ToDoViewHolder> {

    @Override
    public ToDoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dbitem, parent, false);


        /*
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate((R.layout.dbitem, parent, false));
        */

        return new ToDoViewHolder(v);

    }


    //data
    @Override
    public void onBindViewHolder(ToDoViewHolder holder, int position) {
        holder.txt_item_memo.setText("20107-08-21");
        holder.txt_item_memo.setText("내가 할일");


    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
