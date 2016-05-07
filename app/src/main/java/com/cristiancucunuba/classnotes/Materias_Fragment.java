package com.cristiancucunuba.classnotes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by VALENTINA on 07/05/2016.
 */
public class Materias_Fragment extends Fragment{
    View  myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.tareas,container,false);
        return myView;
    }
}
