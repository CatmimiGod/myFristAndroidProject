package fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.catmi.myfristandroidproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_voice extends Fragment {


    public fragment_voice() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_voice, container, false);
    }

}
