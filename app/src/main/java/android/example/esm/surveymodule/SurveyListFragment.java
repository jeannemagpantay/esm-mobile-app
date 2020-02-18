package android.example.esm.surveymodule;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.example.esm.R;


public class SurveyListFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_surveylist, container, false);

        FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        SurveyFragment surveyFragment = new SurveyFragment();
        ft.replace(R.id.frame_recycler, surveyFragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
        return rootView;
    }

}