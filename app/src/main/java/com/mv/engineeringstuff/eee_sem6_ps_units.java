package com.mv.engineeringstuff;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import static android.content.Context.DOWNLOAD_SERVICE;
import static android.os.Environment.DIRECTORY_DOWNLOADS;
import static androidx.constraintlayout.widget.Constraints.TAG;


public class eee_sem6_ps_units extends Fragment {



    Animation atg1, atg2, atg3, atg4, atg5, atgrotate, atgrotatescale;
    View view;
    ImageView polygon;
    TextView sub_code, sub_name, anna_university_sullabus, regulation_2k17,eee_sub;
    Button _2_marks,Notes,question;
    FirebaseStorage firebaseStorage,firebaseStorage1;
    StorageReference storageReference,storageReference1;
    StorageReference ref,ref1;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view=inflater.inflate(R.layout.eee_sem6_ps_units,container,false);
       

        animation();
        Materials();
        return view;
    }

    private void Materials() {
        _2_marks();
        Notes();
        Question_Papers();
    }

    private void _2_marks() {
        _2_marks=view.findViewById(R.id._2_marks);
        _2_marks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Toast toast = Toast.makeText(getActivity(), "Available in upcoming updates", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

    }

    private void Question_Papers() {
        question=view.findViewById(R.id.question);
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storageReference1=firebaseStorage1.getInstance().getReference();
                ref1=storageReference1.child("EEE/SEM VI/EE8602 - PROTECTION AND SWITCHGEAR/EE8602 - PROTECTION AND SWITCHGEAR.pdf");

                ref1.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri)
                    {
                        Log.d(String.valueOf(TAG), "onSuccess: download url:"+uri.toString());
                        Toast.makeText(getActivity(),"Downloading",Toast.LENGTH_SHORT).show();
                        String url=uri.toString();
                        downloadflie(getActivity(), "EE8602 - PROTECTION AND SWITCHGEAR PREVIOUS YEAR QUESTION PAPER", ".pdf",url);

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d(String.valueOf(TAG), "onFailure: Error:"+e.getMessage());
                        Toast.makeText(getActivity(),"Some Error Occured",Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
    }


    private void Notes() {
        Notes=view.findViewById(R.id.notes);
        Notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("EEE/SEM VI/EE8602 - PROTECTION AND SWITCHGEAR/EE8602 - PROTECTION AND SWITCHGEAR.pdf");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri)
                    {
                        Log.d(String.valueOf(TAG), "onSuccess: download url:"+uri.toString());
                        Toast.makeText(getActivity(),"Downloading",Toast.LENGTH_SHORT).show();
                        String url=uri.toString();
                        downloadflie(getActivity(), "EE8602 - PROTECTION AND SWITCHGEAR", ".pdf",url);

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d(String.valueOf(TAG), "onFailure: Error:"+e.getMessage());
                        Toast.makeText(getActivity(),"Some Error Occured",Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
    }

    private void downloadflie(FragmentActivity activity, String fileName, String fileExtension, String url) {


        DownloadManager downloadManager=(DownloadManager) getActivity().getSystemService(DOWNLOAD_SERVICE);
        Uri uri=Uri.parse(url);
        DownloadManager.Request request =new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(DIRECTORY_DOWNLOADS,fileName+fileExtension);


        downloadManager.enqueue(request);

    }

    private void animation() {
        atg1 = AnimationUtils.loadAnimation(getActivity(), R.anim.atg1);
        atg2 = AnimationUtils.loadAnimation(getActivity(), R.anim.atg2);
        atg3 = AnimationUtils.loadAnimation(getActivity(), R.anim.atg3);
        atg4 = AnimationUtils.loadAnimation(getActivity(), R.anim.atg4);
        atg5 = AnimationUtils.loadAnimation(getActivity(), R.anim.atg5);


        _2_marks = view.findViewById(R.id._2_marks);
        Notes = view.findViewById(R.id.notes);
        question = view.findViewById(R.id.question);



        _2_marks.startAnimation(atg1);
        Notes.startAnimation(atg2);
        question.startAnimation(atg3);

        atgrotate = AnimationUtils.loadAnimation(getActivity(), R.anim.atgrotate);
        atgrotatescale = AnimationUtils.loadAnimation(getActivity(), R.anim.atgrotatescale);


        polygon = view.findViewById(R.id.polygon);
        sub_code = view.findViewById(R.id.sub_code);
        sub_name = view.findViewById(R.id.sub_name);
        anna_university_sullabus = view.findViewById(R.id.anna_university_sullabus);
        regulation_2k17 = view.findViewById(R.id.regulation_2k17);
        eee_sub=view.findViewById(R.id.eee_sub);


        polygon.startAnimation(atgrotate);
        sub_code.startAnimation(atgrotatescale);
        sub_name.startAnimation(atgrotatescale);
        anna_university_sullabus.startAnimation(atgrotatescale);
        regulation_2k17.startAnimation(atgrotatescale);
        eee_sub.startAnimation(atgrotatescale);

    }

}
   
