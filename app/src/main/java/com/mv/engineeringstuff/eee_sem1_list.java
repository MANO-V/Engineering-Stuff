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
import androidx.fragment.app.FragmentTransaction;


public class eee_sem1_list extends Fragment {

    View view;
    Animation sem1_atg, sem2_atg, sem3_atg, sem4_atg, sem5_atg, sem6_atg;
    FrameLayout eng1, chy, pspp, m1, eg, phy1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.eee_sem1_list, container, false);
        sem1_papers();
        animation();
        return view;
    }

    private void sem1_papers() {
        eng1();
        chy();
        pspp();
        m1();
        eg();
        phy1();
    }


    private void animation() {
        sem1_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem1_atg);
        sem2_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem2_atg);
        sem3_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem3_atg);
        sem4_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem4_atg);
        sem5_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem5_atg);
        sem6_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem6_atg);


        eng1 = view.findViewById(R.id.eee_sem1_eng1);
        chy = view.findViewById(R.id.eee_sem1_chy);
        pspp = view.findViewById(R.id.eee_sem1_pspp);
        m1 = view.findViewById(R.id.eee_sem1_m1);
        eg = view.findViewById(R.id.eee_sem1_eg);
        phy1 = view.findViewById(R.id.eee_sem1_phy1);

        eng1.startAnimation(sem1_atg);
        chy.startAnimation(sem2_atg);
        pspp.startAnimation(sem3_atg);
        m1.startAnimation(sem4_atg);
        eg.startAnimation(sem5_atg);
        phy1.startAnimation(sem6_atg);

    }

    private void eng1() {

        eng1 = view.findViewById(R.id.eee_sem1_eng1);
        eng1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.semsesters, new eee_sem1_english1_units());
                transaction.replace(R.id.papers, new eee_sem1_english1_units());
                transaction.addToBackStack(null).commit();
            }
        });
    }

    private void chy() {
        chy = view.findViewById(R.id.eee_sem1_chy);
        chy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.semsesters, new eee_sem1_chy_units());
                transaction.replace(R.id.papers, new eee_sem1_chy_units());
                transaction.addToBackStack(null).commit();
            }
        });
    }

    private void pspp() {
        chy = view.findViewById(R.id.eee_sem1_pspp);
        chy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.semsesters, new eee_sem1_pspp_units());
                transaction.replace(R.id.papers, new eee_sem1_pspp_units());
                transaction.addToBackStack(null).commit();
            }
        });
    }

    private void m1() {
        m1 = view.findViewById(R.id.eee_sem1_m1);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.semsesters, new eee_sem1_m1_units());
                transaction.replace(R.id.papers, new eee_sem1_m1_units());
                transaction.addToBackStack(null).commit();
            }
        });
    }

    private void eg() {
        eg = view.findViewById(R.id.eee_sem1_eg);
        eg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.semsesters, new eee_sem1_eg_units());
                transaction.replace(R.id.papers, new eee_sem1_eg_units());
                transaction.addToBackStack(null).commit();
            }
        });
    }

    private void phy1() {
        phy1 = view.findViewById(R.id.eee_sem1_phy1);
        phy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.semsesters, new eee_sem1_phy1_units());
                transaction.replace(R.id.papers, new eee_sem1_phy1_units());
                transaction.addToBackStack(null).commit();
            }
        });
    }
}