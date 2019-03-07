package com.example.blade.sesion9;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.blade.sesion9.beans.ItemProduct;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTechnology extends Fragment {

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public FragmentTechnology() {}
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_technology, container, false);
        RecyclerView recyclerView = (RecyclerView)
                view.findViewById(R.id.fragment_technology_recycler_view);
        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // Use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        ArrayList<ItemProduct> myDataSet = new ArrayList<ItemProduct>();
        ItemProduct itemProduct = new ItemProduct();
        itemProduct.setTitle("MacBook Pro 17\"");
        itemProduct.setStore("BestBuy");
        itemProduct.setLocation("Zapopan, Jalisco");
        itemProduct.setPhone("33 12345678");
        itemProduct.setImage(0);

        myDataSet.add(itemProduct);

        ItemProduct itemProduct2 = new ItemProduct();
        itemProduct2.setTitle("Alienware");
        itemProduct2.setStore("BestBuy");
        itemProduct2.setLocation("Zapopan, Jalisco");
        itemProduct2.setPhone("33 12345678");
        itemProduct2.setImage(1);

        myDataSet.add(itemProduct2);

        ItemProduct itemProduct3 = new ItemProduct();
        itemProduct3.setTitle("MacBook Pro 17\"");
        itemProduct3.setStore("BestBuy");
        itemProduct3.setLocation("Zapopan, Jalisco");
        itemProduct3.setPhone("33 12345678");
        itemProduct3.setImage(0);

        myDataSet.add(itemProduct3);

        mAdapter = new AdapterProduct(getActivity(), myDataSet);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}
