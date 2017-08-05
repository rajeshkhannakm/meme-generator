package com.example.rajeshkhanna.memegenerator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rajeshkhanna.memegenerator.R;

import org.w3c.dom.Text;

public class Fragment2 extends Fragment {

    public static TextView topTextView;
    public static TextView bottomTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);

        topTextView = (TextView) view.findViewById(R.id.textView1);
        bottomTextView = (TextView) view.findViewById(R.id.textView2);
        return view;
    }

    public void createMeme(String s1, String s2){
        topTextView.setText(s1);
        bottomTextView.setText(s2);
    }
}


