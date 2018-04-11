package com.karl.gux.gkjam.Activities;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.karl.gux.gkjam.Classes.Chord;
import com.karl.gux.gkjam.R;

import java.util.List;

public class ChordListAdapter extends RecyclerView.Adapter<ChordListAdapter.MyViewHolder>{

    List<Chord> listOfItems;

    public ChordListAdapter(List<Chord> chordList) {
        this.listOfItems = chordList;
    }


    @Override
    public ChordListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chord_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ChordListAdapter.MyViewHolder holder, final int position) {
        Chord chord = listOfItems.get(position);
        holder.chordItem.setText(chord.getChord());

        holder.deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("================", "onClick: " + position);
                listOfItems.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listOfItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView chordItem;
        ImageView deleteButton;

        public MyViewHolder(View itemView) {
            super(itemView);

            chordItem = itemView.findViewById(R.id.chord_item);
            deleteButton = itemView.findViewById(R.id.delete_button);
        }
    }



}
