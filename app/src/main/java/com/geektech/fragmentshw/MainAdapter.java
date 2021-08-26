package com.geektech.fragmentshw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private ArrayList<Song> list;
    private OnClick onClick;

    public void setList(ArrayList<Song> list, OnClick onClick ) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        this.onClick = onClick;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView number, song, artist, duration;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.numberTv);
            song = itemView.findViewById(R.id.songTv);
            artist = itemView.findViewById(R.id.artistTv);
            duration = itemView.findViewById(R.id.durationTv);
        }

        public void onBind(Song s) {
            number.setText(s.getNumber());
            song.setText(s.getSong());
            artist.setText(s.getArtist());
            duration.setText(s.getDuration());

            itemView.setOnClickListener(v -> {
                onClick.onItemClick(s);
            });
        }
    }

    public interface OnClick {
        void onItemClick(Song s);
    }
}
