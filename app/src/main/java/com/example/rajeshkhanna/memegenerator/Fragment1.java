package com.example.rajeshkhanna.memegenerator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment1 extends Fragment{

    EditText topEditText;
    EditText bottomEditText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        topEditText = (EditText) view.findViewById(R.id.editText1);
        bottomEditText = (EditText) view.findViewById(R.id.editText2);
        Button button = (Button) view.findViewById(R.id.apply_button);


        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        getTop();
                    }
                }
        );
        return view;
    }

    Fragment2 f = new Fragment2();
    void getTop(){
        String topText,bottomText;
        topText = topEditText.getText().toString();
        bottomText = bottomEditText.getText().toString();
        f.createMeme(topText, bottomText);
    }
}


