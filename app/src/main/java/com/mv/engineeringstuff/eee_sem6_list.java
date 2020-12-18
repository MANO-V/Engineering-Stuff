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


public class eee_sem6_list extends Fragment {
    View view;
    Animation sem1_atg, sem2_atg, sem3_atg, sem4_atg, sem5_atg,atg6;
    FrameLayout ssd,ps,es,pe1,pe2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         view=inflater.inflate(R.layout.eee_sem6_list,container,false);
        sem6_papers();

        animation();
        return view;

    }
    private void sem6_papers() {
        ssd();
        ps();
        es();


    }
    private void ssd() {

        ssd=view.findViewById(R.id.eee_sem6_ssd);
        ssd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem6_ssd_units()).replace(R.id.papers, new eee_sem6_ssd_units());transaction.addToBackStack(null).commit();
            }
        });
    }

    private void ps() {
        ps = view.findViewById(R.id.eee_sem6_ps);
        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem6_ps_units()).replace(R.id.papers, new eee_sem6_ps_units());transaction.addToBackStack(null).commit();

            }
        });
    }

    private void es() {
        es=view.findViewById(R.id.eee_sem6_es);
        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem6_es_units()).replace(R.id.papers, new eee_sem6_es_units());transaction.addToBackStack(null).commit();
            }
        });
    }

    private void animation() {
        sem1_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem1_atg);
        sem2_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem2_atg);
        sem3_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem3_atg);
        sem4_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem4_atg);
        sem5_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem5_atg);




        ssd = view.findViewById(R.id.eee_sem6_ssd);
        ps = view.findViewById(R.id.eee_sem6_ps);
        es = view.findViewById(R.id.eee_sem6_es);
        pe1 = view.findViewById(R.id.eee_sem6_pe1);
        pe2 = view.findViewById(R.id.eee_sem6_pe2);




        ssd.startAnimation(sem1_atg);
        ps.startAnimation(sem2_atg);
        es.startAnimation(sem3_atg);
        pe1.startAnimation(sem4_atg);
        pe2.startAnimation(sem5_atg);


    }
}
