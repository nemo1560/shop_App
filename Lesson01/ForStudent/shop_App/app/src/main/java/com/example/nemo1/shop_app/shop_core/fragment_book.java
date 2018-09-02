package com.example.nemo1.shop_app.shop_core;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.nemo1.shop_app.R;
import com.example.nemo1.shop_app.shop_core.data.adapter_book;
import com.example.nemo1.shop_app.shop_core.data.mBook;
import com.example.nemo1.shop_app.shop_core.entity.eBook;

import java.util.List;

public class fragment_book extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    private ListView listView;
    private adapter_book adapter_book;
    private List<eBook> eBookList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book,container,false);
        listView = view.findViewById(R.id.fragment_book);
        eBookList = new mBook().geteBookList();
        adapter_book = new adapter_book(getContext(),R.layout.listview_book,eBookList);
        listView.setAdapter(adapter_book);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
