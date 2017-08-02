package fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.catmi.myfristandroidproject.R;

import adapter.PicAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_member extends Fragment {


    public fragment_member() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_member, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ViewPager viewPager = getActivity().findViewById(R.id.viewpager);
        viewPager.setAdapter(new PicAdapter());
    }
}
