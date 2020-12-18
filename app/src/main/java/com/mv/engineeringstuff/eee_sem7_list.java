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


public class eee_sem7_list extends Fragment {
    View view;
    Animation sem1_atg, sem2_atg, sem3_atg, sem4_atg, sem5_atg,sem6_atg;
    FrameLayout hve,pso,res,op2,pe3,pe4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         view=inflater.inflate(R.layout.eee_sem7_list,container,false);
        sem7_papers();

        animation();
        return view;

    }
    private void sem7_papers() {
        hve();
        pso();
        res();


    }

    private void hve() {

        hve=view.findViewById(R.id.eee_sem7_hve);
        hve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem7_hve_units()).replace(R.id.papers, new eee_sem7_hve_units());transaction.addToBackStack(null).commit();
            }
        });
    }

    private void pso() {
        pso = view.findViewById(R.id.eee_sem7_pso);
        pso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem7_pso_units()).replace(R.id.papers, new eee_sem7_pso_units());transaction.addToBackStack(null).commit();

            }
        });
    }

    private void res() {
        res=view.findViewById(R.id.eee_sem7_res);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem7_res_units()).replace(R.id.papers, new eee_sem7_res_units());transaction.addToBackStack(null).commit();
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



        hve = view.findViewById(R.id.eee_sem7_hve);
        pso = view.findViewById(R.id.eee_sem7_pso);
        res = view.findViewById(R.id.eee_sem7_res);
        op2 = view.findViewById(R.id.eee_sem7_op2);
        pe3 = view.findViewById(R.id.eee_sem7_pe3);
        pe4 = view.findViewById(R.id.eee_sem7_pe4);



        hve.startAnimation(sem1_atg);
        pso.startAnimation(sem2_atg);
        res.startAnimation(sem3_atg);
        op2.startAnimation(sem4_atg);
        pe3.startAnimation(sem5_atg);
        pe4.startAnimation(sem6_atg);


    }
}
