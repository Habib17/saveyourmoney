package com.example.habib.savemoney.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.habib.savemoney.ModelData.Transaksi;
import com.example.habib.savemoney.R;

import java.util.ArrayList;

/**
 * Created by robi on 12/5/2018.
 */

public class AdapterTransaksi extends RecyclerView.Adapter<AdapterTransaksi.TransaksiViewHolder> {
    private static final String TAG = "AdapterTransaksi";
    LayoutInflater minflater;
    ArrayList<Transaksi> transaksi;
    Context context;

    public AdapterTransaksi(ArrayList<Transaksi> transaksi, Context context) {
        this.minflater = LayoutInflater.from(context);
        this.transaksi = transaksi;
        this.context = context;
    }

    public class TransaksiViewHolder extends RecyclerView.ViewHolder {
        TextView nominal, keperluan, jenis;
        RecyclerView.Adapter adapter;

        public TransaksiViewHolder(View itemView, AdapterTransaksi adapter) {
            super(itemView);

            nominal = itemView.findViewById(R.id.nominal);
            keperluan = itemView.findViewById(R.id.keperluan);
            jenis = itemView.findViewById(R.id.jenis);

            this.adapter = adapter;
        }
    }

    @NonNull
    @Override
    public TransaksiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = minflater.inflate(R.layout.list_row, parent, false);
        return new TransaksiViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull TransaksiViewHolder holder, int position) {
        Transaksi current = transaksi.get(position);
        holder.nominal.setText(current.getNominal());
        holder.keperluan.setText(current.getKeperluan());
        holder.jenis.setText(current.getJenis());
    }

    @Override
    public int getItemCount() {
        return transaksi.size();
    }
}
