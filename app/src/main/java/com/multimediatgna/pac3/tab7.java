package com.multimediatgna.pac3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link tab7#newInstance} factory method to
 * create an instance of this fragment.
 */
public class tab7 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public MyRecycleViewAdapter myadapter;
    public ArrayList<String> mypasbusarray;

    public tab7() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment tab7.
     */
    // TODO: Rename and change types and number of parameters
    public static tab7 newInstance(String param1, String param2) {
        tab7 fragment = new tab7();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        MainActivity main = (MainActivity) getActivity();

        View myview=inflater.inflate(R.layout.fragment_tab7, container, false);
        RecyclerView myrecyclerView = myview.findViewById(R.id.myrecyclerview);
        myrecyclerView.setHasFixedSize(true);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(myview.getContext()));
        mypasbusarray = new ArrayList<>();
        mypasbusarray.add("Nom de la persona");
        mypasbusarray.add("Número de telèfon");
        mypasbusarray.add("Orígen (parada a triar de la bossa)");
        mypasbusarray.add("Destí (parada a triar de la bossa)");
        mypasbusarray.add("Data (dia desitjat)");
        mypasbusarray.add("Motivació (Metge, treball, gestions, ...)");
        mypasbusarray.add("Número de Places");
        myadapter = new MyRecycleViewAdapter(main,mypasbusarray);
        myrecyclerView.setAdapter(myadapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(myrecyclerView.getContext(),1);
        myrecyclerView.addItemDecoration(dividerItemDecoration);
        myadapter.notifyDataSetChanged();
        return myview;

    }
}