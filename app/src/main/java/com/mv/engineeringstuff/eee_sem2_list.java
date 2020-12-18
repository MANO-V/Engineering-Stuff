package com.mv.engineeringstuff;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;


public class eee_sem2_list extends Fragment {
    View view;
    Animation sem1_atg,sem2_atg,sem3_atg,sem4_atg,sem5_atg,sem6_atg;
    FrameLayout evs,ct,m2,phy2,te,bcm;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         view=inflater.inflate(R.layout.eee_sem2_list,container,false);
        sem2_papers();
     


        animation();


        return view;

    }
    private void sem2_papers() {
        evs();
        ct();
        m2();
        phy2();
        te();
        bcm();
    }

    private void evs() {

        evs=view.findViewById(R.id.eee_sem2_evs);
        evs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction();
                 transaction.replace(R.id.semsesters, new eee_sem2_evs_units());
                 transaction.replace(R.id.papers, new eee_sem2_evs_units());
                 transaction.addToBackStack(null).commit();
            }
        });




    }

    private void ct() {
        ct = view.findViewById(R.id.eee_sem2_ct);
        ct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem2_ct_units());
                 transaction.replace(R.id.semsesters, new eee_sem2_ct_units());
                transaction.replace(R.id.papers, new eee_sem2_ct_units());
                transaction.addToBackStack(null).commit();

            }
        });

    }

    private void m2() {
        m2 = view.findViewById(R.id.eee_sem2_m2);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction();
                 transaction.replace(R.id.semsesters, new eee_sem2_m2_units());
                transaction.replace(R.id.papers, new eee_sem2_m2_units());
                transaction.addToBackStack(null).commit();

            }
        });
    }

    private void phy2() {
        phy2=view.findViewById(R.id.eee_sem2_phy2);
        phy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction();
                 transaction.replace(R.id.semsesters, new eee_sem2_phy2_units());
                transaction.replace(R.id.papers, new eee_sem2_phy2_units());
                 transaction.addToBackStack(null).commit();
            }
        });
    }
    private void te() {
        te = view.findViewById(R.id.eee_sem2_te);
        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem2_te_units()).replace(R.id.papers, new eee_sem2_te_units());transaction.addToBackStack(null).commit();

            }
        });
    }

    private void bcm() {
        bcm = view.findViewById(R.id.eee_sem2_bcm);
        bcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem2_bcm_units()).replace(R.id.papers, new eee_sem2_bcm_units());transaction.addToBackStack(null).commit();

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


        evs = view.findViewById(R.id.eee_sem2_evs);
        ct = view.findViewById(R.id.eee_sem2_ct);
        m2 = view.findViewById(R.id.eee_sem2_m2);
        phy2 = view.findViewById(R.id.eee_sem2_phy2);
        te = view.findViewById(R.id.eee_sem2_te);
        bcm = view.findViewById(R.id.eee_sem2_bcm);

        evs.startAnimation(sem1_atg);
        ct.startAnimation(sem2_atg);
        m2.startAnimation(sem3_atg);
        phy2.startAnimation(sem4_atg);
       te.startAnimation(sem5_atg);
       bcm.startAnimation(sem6_atg);


    }
}
