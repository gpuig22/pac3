package com.multimediatgna.autocarespenedstabmenu;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.VideoView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link tab6#newInstance} factory method to
 * create an instance of this fragment.
 */
public class tab6 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private CardView mycardview;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public static String PACKAGE_NAME;

    public tab6() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment tab6.
     */
    // TODO: Rename and change types and number of parameters
    public static tab6 newInstance(String param1, String param2) {
        tab6 fragment = new tab6();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PACKAGE_NAME = BuildConfig.APPLICATION_ID;
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.fragment_tab6, container, false);
        mycardview = myview.findViewById(R.id.myvideo);
        mycardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoView mysimpleVideoView = (VideoView) getActivity().findViewById(R.id.myvideoView);
                mysimpleVideoView = view.findViewById(R.id.myvideoView);
                mysimpleVideoView.setVideoURI(Uri.parse("android.resource://" + PACKAGE_NAME + "/" + R.raw.videobuspenedes));

                mysimpleVideoView.start();
            }
        });
        return myview;
    }
}