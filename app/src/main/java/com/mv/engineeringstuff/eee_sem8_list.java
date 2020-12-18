package com.mv.engineeringstuff;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;


public class eee_sem8_list extends Fragment {
    View view;
    Animation sem1_atg, sem2_atg;
    FrameLayout pe5,pe6;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         view=inflater.inflate(R.layout.eee_sem8_list,container,false);

        animation();
        return view;

    }

    private void animation() {
        sem1_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem1_atg);
        sem2_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem2_atg);




        pe5 = view.findViewById(R.id.eee_sem8_pe5);
        pe6 = view.findViewById(R.id.eee_sem8_pe6);



        pe5.startAnimation(sem1_atg);
        pe6.startAnimation(sem2_atg);



    }
}
