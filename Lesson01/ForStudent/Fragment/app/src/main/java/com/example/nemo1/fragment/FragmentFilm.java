package com.example.nemo1.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FragmentFilm extends Fragment {
    ListView lvFilm;
    private List<Film> films;
    private FilmAdapter filmAdapter;
    private View view;
    private OnClickListner mListener;
    private int screenOrientation;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnClickListner) {
            mListener = (OnClickListner) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    public FragmentFilm() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_film, container, false);
        lvFilm = view.findViewById(R.id.lv_film);
        films = new ArrayList<>();
        initData();
        filmAdapter = new FilmAdapter(getActivity(), films);
        lvFilm.setAdapter(filmAdapter);
        return view;
    }

    private void initData() {
        films.add(new Film(R.drawable.darkspiderman, "Dark Spider Man", "4.5", "2011", "Hành Động"));
        films.add(new Film(R.drawable.killer, "Killer", "4.5", "2013", "Hành Động"));
        films.add(new Film(R.drawable.guardianofthegalaxy, "Guradian Of The Galaxy", "4.8", "2011", "Hành Động"));
        films.add(new Film(R.drawable.insiders, "Insider", "4.5", "2008", "Hành Động"));
        films.add(new Film(R.drawable.panthernoire, "Pathernoire", "4.7", "2011", "Hành Động"));
        films.add(new Film(R.drawable.ava, "Ava", "4.9", "2009", "Hành Động"));
        films.add(new Film(R.drawable.matilda, "Maltida", "4.5", "2014", "Hành Động"));
        films.add(new Film(R.drawable.darkspiderman, "Dark Spider Man", "4.8", "2012", "Hành Động"));
        films.add(new Film(R.drawable.killer, "Killer", "4.5", "2013", "Hành Động"));
        films.add(new Film(R.drawable.guardianofthegalaxy, "Guradian Of The Galaxy", "4.8", "2011", "Hành Động"));
        films.add(new Film(R.drawable.insiders, "Insider", "4.5", "2008", "Hành Động"));
        films.add(new Film(R.drawable.panthernoire, "Pathernoire", "4.7", "2011", "Hành Động"));
        films.add(new Film(R.drawable.ava, "Ava", "4.9", "2009", "Hành Động"));
        films.add(new Film(R.drawable.matilda, "Maltida", "4.5", "2014", "Hành Động"));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        lvFilm = getActivity().findViewById(R.id.lv_film);
        films = new ArrayList<>();
        initData();
        filmAdapter = new FilmAdapter(getActivity(), films);
        lvFilm.setAdapter(filmAdapter);

        screenOrientation = getActivity().getResources().getConfiguration().orientation;
        lvFilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (screenOrientation){
                    case 1:
                        // màn hình đứng :
                        Intent intent = new Intent(getActivity(), DetailActivity.class);
                        intent.putExtra("detail", films.get(i));
                        getActivity().startActivity(intent);
                        break;
                    case 2:
                        // màn hình ngang :
                        mListener.OnClicked(films.get(i));
                        break;
                }
            }
        });
    }

    public interface OnClickListner {
        void OnClicked(Film film );
    }
}
