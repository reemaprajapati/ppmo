package com.example.otimus.ppmo.fragments;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.otimus.ppmo.R;
import com.example.otimus.ppmo.adapters.TenderItemAdapter;
import com.example.otimus.ppmo.model.TenderItem;
import com.example.otimus.ppmo.rest.ApiClient;
import com.example.otimus.ppmo.rest.ApiInterface;
import com.example.otimus.ppmo.rest.ApiInterfaceGoods;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentGoods extends Fragment {

    RecyclerView recyclerView;
    ArrayList<TenderItem> tenderItems=new ArrayList<>();
    TenderItemAdapter tenderItemAdapter;
    ProgressDialog mProgressDialog;
    public FragmentGoods() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView= (RecyclerView) rootView.findViewById(R.id.recyclerView_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
        tenderItemAdapter= new TenderItemAdapter(getActivity(), tenderItems, new TenderItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(TenderItem item) {
            }
        });
        recyclerView.setAdapter(tenderItemAdapter);
        mProgressDialog = new ProgressDialog(getActivity());
        mProgressDialog.setIndeterminate(true);
        mProgressDialog.setMessage("Loading...");
        mProgressDialog.show();
        ApiInterfaceGoods apiInterface= ApiClient.getClient().create(ApiInterfaceGoods.class);
        Call<List<TenderItem>> call=apiInterface.getGoods();
        call.enqueue(new Callback<List<TenderItem>>() {
            @Override
            public void onResponse(Call<List<TenderItem>> call, Response<List<TenderItem>> response) {
                tenderItems.addAll(response.body());
                if (mProgressDialog.isShowing())
                    mProgressDialog.dismiss();
                tenderItemAdapter.notifyDataSetChanged();
                Log.d("item",String.valueOf(tenderItems.size()));
                Log.d("output",String.valueOf(tenderItems.get(1).getId()));
            }

            @Override
            public void onFailure(Call<List<TenderItem>> call, Throwable t) {
                if (mProgressDialog.isShowing())
                    mProgressDialog.dismiss();
                Snackbar mySnackbar = Snackbar.make(getActivity().findViewById(android.R.id.content),"No Internet Connection",Snackbar.LENGTH_INDEFINITE);
                mySnackbar.setAction("TRY AGAIN",new myUndoListener());
                mySnackbar.show();
                Toast.makeText(getActivity(), "Check your Internet Connection", Toast.LENGTH_SHORT).show();
                System.out.println("Throwed"+t);
            }
        });
        return rootView;
    }
    public  class myUndoListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            getActivity().finish();
            startActivity(getActivity().getIntent());
        }
    }

}
