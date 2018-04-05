package com.karl.gux.gkjam.Activities;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.karl.gux.gkjam.Classes.Note;
import com.karl.gux.gkjam.R;

import java.util.List;

public class NoteListAdpater extends RecyclerView.Adapter<NoteListAdpater.MyViewHolder>{

    List<Note> listOfItems;

    public NoteListAdpater(List<Note> noteList) {
        this.listOfItems = noteList;
    }


    @Override
    public NoteListAdpater.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.note_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NoteListAdpater.MyViewHolder holder, final int position) {
        Note note = listOfItems.get(position);
        holder.noteItem.setText(note.getNote());

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

        TextView noteItem;
        Button deleteButton;

        public MyViewHolder(View itemView) {
            super(itemView);

            noteItem = itemView.findViewById(R.id.note_item);
            deleteButton = itemView.findViewById(R.id.delete_button);
        }
    }



}
