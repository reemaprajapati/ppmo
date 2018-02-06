package com.example.otimus.ppmo.fragments;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.otimus.ppmo.R;
import com.example.otimus.ppmo.adapters.CategoryItemAdapter;
import com.example.otimus.ppmo.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCategory extends Fragment implements View.OnClickListener  {


    private GridLayoutManager lLayout;
    List<Category> list;
    CategoryItemAdapter categoryItemAdapter ;
    RecyclerView rview;
    ProgressDialog mProgressDialog;
    public FragmentCategory() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_category, container, false);
        list=new ArrayList<Category>();
        lLayout = new GridLayoutManager(getActivity(), 2);
        RecyclerView rView=(RecyclerView)rootView.findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        list.add(new Category(R.drawable.goods_24dp,"Goods"));
        list.add(new Category(R.drawable.works,"Works"));
        list.add(new Category(R.drawable.consultancy_services,"Consultancy Services"));
        list.add(new Category(R.drawable.other_services,"Other Services"));
        list.add(new Category(R.drawable.ration,"Ration"));
        list.add(new Category(R.drawable.usercommittee,"User Committee"));

        categoryItemAdapter=new CategoryItemAdapter(getActivity(),list);
        rView.setAdapter(categoryItemAdapter);
        return rootView;
    }

    @Override
    public void onClick(View view) {

    }
}
