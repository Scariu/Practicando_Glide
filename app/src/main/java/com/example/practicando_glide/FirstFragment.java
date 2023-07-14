package com.example.practicando_glide;

import android.content.ClipData;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
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
    List<Imagen>image = returnItemList();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private String imageText;

    private String imageUrl;


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
        adapter.setImages(image);
        binding.recyclerView.setAdapter(adapter);
        return binding.getRoot();
    }


    private List<Imagen> returnItemList() {
        List<Imagen> listItem = new ArrayList<>();
        Imagen item01 = new Imagen("Zhuo Cheng you", "https://unsplash.com/photos/UBvtBr_FmrY/download?force=true&w=640");
        Imagen item02 = new Imagen("billow926", "https://unsplash.com/photos/pNoP-qVwBFQ/download?force=true&w=640");
        Imagen item03 = new Imagen("PhilippDeiß", "https://unsplash.com/photos/LfJx0gqqiEc/download?force=true&w=64 0");
        Imagen item04 = new Imagen("Huper by Joshua Earle", "https://unsplash.com/photos/_p8gVNNsWw4/download?force=true&w=640");
        Imagen item05 = new Imagen("Melnychuk Nataliya", "https://unsplash.com/photos/rnPGCe7LsQo/download?force=true&w=640");
        Imagen item06 = new Imagen("Teagan Maddux", "https://unsplash.com/photos/k2DbTXQ0yrQ/download?force=true&w=640");
        Imagen item07 = new Imagen("Chen Liu", "https://unsplash.com/photos/kZH8X0q4Nvo/download?force=true&w=640");
        Imagen item08 = new Imagen("John Fornander", "https://unsplash.com/photos/iNqJx-VOceI/download?force=true&w=640");
        Imagen item09 = new Imagen("Parker Coffman", "https://unsplash.com/photos/mNWrQ9O6KZw/download?force=true&w=640");
        Imagen item10 = new Imagen("XPS", "https://unsplash.com/photos/8pb7Hq539Zw/download?force=true&w=640");
        Imagen item11 = new Imagen("Daniel J. Schwarz", "https://unsplash.com/photos/l8BvDmt8Ac4/download?force=true&w=640");
        Imagen item12 = new Imagen("Wesley Armstrong", "https://unsplash.com/photos/q0wqYpyWDpc/download?force=true&w=640");

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

