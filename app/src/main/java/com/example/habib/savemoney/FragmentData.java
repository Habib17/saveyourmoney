package com.example.habib.savemoney;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.habib.savemoney.Adapter.AdapterTransaksi;
import com.example.habib.savemoney.ModelData.Transaksi;

import java.util.ArrayList;

public class FragmentData extends Fragment {
    private static final String TAG = "Fragment Data";

    ArrayList<Transaksi> transaksi = new ArrayList<>();
    AdapterTransaksi adapter;

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_data, container, false);

        transaksi.add(new Transaksi("50000", "Makan", "Pengeluaran"));
        transaksi.add(new Transaksi("20000", "Transportasi", "Pengeluaran"));

        recyclerView = view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new AdapterTransaksi(transaksi, context);
        recyclerView.setAdapter(adapter);
        return view;
    }


}
