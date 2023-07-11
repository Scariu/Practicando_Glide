package com.example.practicando_glide;

import android.content.ClipData;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practicando_glide.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    List<ClipData.Item> data = returnItemList();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(getLayoutInflater(), container, false);
        Adapter adapter = new Adapter();
        adapter.setData(data);
        binding.recyclerView.setAdapter(adapter);
        return binding.getRoot();
    }

    private List<ClipData.Item> returnItemList(){
        List<ClipData.Item> listItem = new ArrayList<>();
        ClipData.Item item01 = new ClipData.Item("Zhuo Cheng you","https://unsplash.com/photos/UBvtBr_FmrY/download?force=true&w=640");
        ClipData.Item item02 = new ClipData.Item("billow926","https://unsplash.com/photos/pNoP-qVwBFQ/download?force=true&w=640");
        ClipData.Item item03 = new ClipData.Item("PhilippDeiß","https://unsplash.com/photos/LfJx0gqqiEc/download?force=true&w=64 0");
        ClipData.Item item04 = new ClipData.Item("Huper by Joshua Earle","https://unsplash.com/photos/_p8gVNNsWw4/download?force=true&w=640");
        ClipData.Item item05 = new ClipData.Item("Melnychuk Nataliya","https://unsplash.com/photos/rnPGCe7LsQo/download?force=true&w=640");
        ClipData.Item item06 = new ClipData.Item("Teagan Maddux","https://unsplash.com/photos/k2DbTXQ0yrQ/download?force=true&w=640");
        ClipData.Item item07 = new ClipData.Item("Chen Liu","https://unsplash.com/photos/kZH8X0q4Nvo/download?force=true&w=640");
        ClipData.Item item08 = new ClipData.Item("John Fornander","https://unsplash.com/photos/iNqJx-VOceI/download?force=true&w=640");
        ClipData.Item item09 = new ClipData.Item("Parker Coffman","https://unsplash.com/photos/mNWrQ9O6KZw/download?force=true&w=640");
        ClipData.Item item10 = new ClipData.Item("XPS","https://unsplash.com/photos/8pb7Hq539Zw/download?force=true&w=640");
        ClipData.Item item11 = new ClipData.Item("Daniel J. Schwarz","https://unsplash.com/photos/l8BvDmt8Ac4/download?force=true&w=640");
        ClipData.Item item12 = new ClipData.Item("Wesley Armstrong","https://unsplash.com/photos/q0wqYpyWDpc/download?force=true&w=640");

        listItem.add(item01);
        listItem.add(item02);
        listItem.add(item03);
        listItem.add(item04);
        listItem.add(item05);
        listItem.add(item06);
        listItem.add(item07);
        listItem.add(item08);
        listItem.add(item09);
        listItem.add(item10);
        listItem.add(item11);
        listItem.add(item12);

        return listItem;
    }

}

