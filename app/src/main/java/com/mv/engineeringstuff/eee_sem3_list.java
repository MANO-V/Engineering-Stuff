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


public class eee_sem3_list extends Fragment {
    View view;

    Animation sem1_atg, sem2_atg, sem3_atg, sem4_atg, sem5_atg,sem6_atg;
    FrameLayout m3,dlc,emt,em1,edc,ppe;
    Button m3_1,dlc_1,emt_1,em1_1,edc_1,ppe_1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         view=inflater.inflate(R.layout.eee_sem3_list,container,false);
        sem3_papers();
animation();
        return view;

    }

    private void sem3_papers() {
        m3();
        dlc();
        emt();
        em1();
        edc();
        ppe();
    }

    private void m3() {

        m3=view.findViewById(R.id.eee_sem3_m3);
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem3_m3_units()).replace(R.id.papers, new eee_sem3_m3_units())
                        ;transaction.addToBackStack(null).commit();
            }
        });
    }

    private void dlc() {
        dlc = view.findViewById(R.id.eee_sem3_dlc);
        dlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem3_dlc_units()).replace(R.id.papers, new eee_sem3_dlc_units());transaction.addToBackStack(null).commit();

            }
        });
    }

    private void emt() {
        emt = view.findViewById(R.id.eee_sem3_emt);
        emt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem3_emt_units()).replace(R.id.papers, new eee_sem3_emt_units());transaction.addToBackStack(null).commit();

            }
        });
    }

    private void em1() {
        em1=view.findViewById(R.id.eee_sem3_em1);
        em1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem3_em1_units()).replace(R.id.papers, new eee_sem3_em1_units());transaction.addToBackStack(null).commit();
            }
        });
    }
    private void edc() {
        edc = view.findViewById(R.id.eee_sem3_edc);
        edc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem3_edc_units()).replace(R.id.papers, new eee_sem3_edc_units());transaction.addToBackStack(null).commit();

            }
        });
    }

    private void ppe() {
        ppe = view.findViewById(R.id.eee_sem3_ppe);
        ppe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getFragmentManager().beginTransaction().replace(R.id.semsesters, new eee_sem3_ppe_units()).replace(R.id.papers, new eee_sem3_ppe_units());transaction.addToBackStack(null).commit();

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


        m3 = view.findViewById(R.id.eee_sem3_m3);
        dlc = view.findViewById(R.id.eee_sem3_dlc);
        emt = view.findViewById(R.id.eee_sem3_emt);
        em1 = view.findViewById(R.id.eee_sem3_em1);
        edc = view.findViewById(R.id.eee_sem3_edc);
        ppe = view.findViewById(R.id.eee_sem3_ppe);

        m3.startAnimation(sem1_atg);
        dlc.startAnimation(sem2_atg);
        emt.startAnimation(sem3_atg);
        em1.startAnimation(sem4_atg);
        edc.startAnimation(sem5_atg);
        ppe.startAnimation(sem6_atg);
    }
}
