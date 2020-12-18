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


public class eee_sem4_list extends Fragment {
    View view;
    Animation sem1_atg, sem2_atg, sem3_atg, sem4_atg, sem5_atg,sem6_atg;
    FrameLayout m4,em2,td,mi,lic,cs;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         view=inflater.inflate(R.layout.eee_sem4_list,container,false);
        sem4_papers();
        animation();
        return view;

    }
    private void sem4_papers() {
        m4();
        em2();
        td();
        mi();
        lic();
        cs();
    }

    private void m4() {

        m4=view.findViewById(R.id.eee_sem4_m4);
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem4_m4_units()).replace(R.id.papers, new eee_sem3_ppe_units());transaction.addToBackStack(null).commit();
            }
        });
    }

    private void em2() {
        em2 = view.findViewById(R.id.eee_sem4_em2);
        em2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem4_em2_units()).replace(R.id.papers, new eee_sem4_em2_units());transaction.addToBackStack(null).commit();

            }
        });
    }

    private void td() {
        td = view.findViewById(R.id.eee_sem4_td);
        td.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem4_td_units()).replace(R.id.papers, new eee_sem4_td_units());transaction.addToBackStack(null).commit();

            }
        });
    }

    private void mi() {
        mi=view.findViewById(R.id.eee_sem4_mi);
        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem4_mi_units()).replace(R.id.papers, new eee_sem4_mi_units());transaction.addToBackStack(null).commit();
            }
        });

    }
    private void lic() {
        lic = view.findViewById(R.id.eee_sem4_lic);
        lic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem4_lic_units()).replace(R.id.papers, new eee_sem4_lic_units());transaction.addToBackStack(null).commit();

            }
        });
    }

    private void cs() {
        cs = view.findViewById(R.id.eee_sem4_cs);
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem4_cs_units()).replace(R.id.papers, new eee_sem4_cs_units());transaction.addToBackStack(null).commit();

            }
        });
    }

    private void animation() {
        sem1_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem1_atg);
        sem2_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem2_atg);
        sem3_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem3_atg);
        sem4_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem4_atg);
        sem5_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem5_atg);
        sem6_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem6_atg);


        m4 = view.findViewById(R.id.eee_sem4_m4);
        em2 = view.findViewById(R.id.eee_sem4_em2);
        td = view.findViewById(R.id.eee_sem4_td);
        mi = view.findViewById(R.id.eee_sem4_mi);
        lic = view.findViewById(R.id.eee_sem4_lic);
        cs = view.findViewById(R.id.eee_sem4_cs);

        m4.startAnimation(sem1_atg);
        em2.startAnimation(sem2_atg);
        td.startAnimation(sem3_atg);
        mi.startAnimation(sem4_atg);
        lic.startAnimation(sem5_atg);
        cs.startAnimation(sem6_atg);

    }
}
