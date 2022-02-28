package com.multimediatgna.pac3;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.ViewHolder> {

    private ArrayList<String> mData;
    private LayoutInflater mInflater;

    public MyRecycleViewAdapter(MainActivity mainActivity, ArrayList<String> myrows) {
        this.mInflater = LayoutInflater.from(mainActivity);
        this.mData = myrows;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder  {
        TextView myTextView;
        ViewHolder(View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.mytextview);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String myrow = mData.get(position);
        holder.myTextView.setText(myrow);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


}