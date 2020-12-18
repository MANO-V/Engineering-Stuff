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


public class eee_sem5_list extends Fragment {
    View view;
    Animation sem1_atg, sem2_atg, sem3_atg, sem4_atg, sem5_atg,atg6;
    FrameLayout psa,mpmc,pe,dsp,oops,op1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         view=inflater.inflate(R.layout.eee_sem5_list,container,false);
        sem5_papers();
        animation();
        return view;

    }
    private void sem5_papers() {
        psa();
        mpmc();
        pe();
        dsp();
        oops();

    }

    private void psa() {

        psa=view.findViewById(R.id.eee_sem5_psa);
        psa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem5_psa_units()).replace(R.id.papers, new eee_sem5_psa_units());transaction.addToBackStack(null).commit();
            }
        });

    }

    private void mpmc() {
        mpmc = view.findViewById(R.id.eee_sem5_mpmc);
        mpmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem5_mpmc_units()).replace(R.id.papers, new eee_sem5_mpmc_units());transaction.addToBackStack(null).commit();

            }
        });
    }

    private void pe() {
        pe = view.findViewById(R.id.eee_sem5_pe);
        pe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem5_pe_units()).replace(R.id.papers, new eee_sem5_pe_units());transaction.addToBackStack(null).commit();

            }
        });
    }

    private void dsp() {
        dsp=view.findViewById(R.id.eee_sem5_dsp);
        dsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem5_dsp_units()).replace(R.id.papers, new eee_sem5_dsp_units());transaction.addToBackStack(null).commit();
            }
        });
    }
    private void oops() {
        oops = view.findViewById(R.id.eee_sem5_oops);
        oops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem5_oops_units()).replace(R.id.papers, new eee_sem5_oops_units());transaction.addToBackStack(null).commit();

            }
        });
    }



    private void animation() {
        sem1_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem1_atg);
        sem2_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem2_atg);
        sem3_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem3_atg);
        sem4_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem4_atg);
        sem5_atg = AnimationUtils.loadAnimation(getActivity(), R.anim.sem5_atg);
        atg6 = AnimationUtils.loadAnimation(getActivity(), R.anim.atg6);



        psa = view.findViewById(R.id.eee_sem5_psa);
        mpmc = view.findViewById(R.id.eee_sem5_mpmc);
        pe = view.findViewById(R.id.eee_sem5_pe);
        dsp = view.findViewById(R.id.eee_sem5_dsp);
        oops = view.findViewById(R.id.eee_sem5_oops);
        op1 = view.findViewById(R.id.eee_sem5_op1);



        psa.startAnimation(sem1_atg);
        mpmc.startAnimation(sem2_atg);
        pe.startAnimation(sem3_atg);
        dsp.startAnimation(sem4_atg);
        oops.startAnimation(sem5_atg);
        op1.startAnimation(sem5_atg);


    }
}
