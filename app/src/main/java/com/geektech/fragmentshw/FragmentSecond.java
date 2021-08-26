package com.geektech.fragmentshw;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentSecond extends Fragment implements MainAdapter.OnClick {

    private RecyclerView recyclerView;
    private MainAdapter adapter;
    private ArrayList<Song> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
        createDivider();
    }

    private void createDivider() {
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new Song("1", "Save your tears", "TheWeeknd", "3:11"));
        list.add(new Song("2", "Friends", "Marshmello", "3:40"));
        list.add(new Song("3", "Straightenin", "Migos", "3:24"));
        list.add(new Song("4", "99", "Russ", "2:57"));
        list.add(new Song("5", "BANKROLL", "BROCKHAMPTON", "3:09"));
        list.add(new Song("6", "GANG GANG", "Polo G, Lil Wayne", "3:33"));
        list.add(new Song("7", "After Hours", "TheWeeknd", "3:23"));
        list.add(new Song("8", "Hold My Liquor", "Kanye West", "3:25"));
        list.add(new Song("9", "Miss The Rage", "Trippie Redd, Playboi Carti", "3:11"));
        list.add(new Song("10", "m y . l i f e", "J. Cole, 21 Savage, Morray", "3:34"));


    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.fragmentRv);
        adapter = new MainAdapter();
        adapter.setList(list, this);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onItemClick(Song s) {
        Intent intent = new Intent(getActivity(), MainActivity2.class);
        startActivity(intent);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        String text = s.getSong().toString();
        intent.putExtra("text_key", text);
        startActivity(intent);
    }
}