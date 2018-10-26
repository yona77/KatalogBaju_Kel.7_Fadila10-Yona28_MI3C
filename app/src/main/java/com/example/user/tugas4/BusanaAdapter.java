package com.example.user.tugas4;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class BusanaAdapter extends RecyclerView.Adapter<BusanaAdapter.MyViewHolder> {

    private List<BusanaModel> myMenu;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView nama,ukuran, harga;
        public MyViewHolder(View v) {
            super(v);
            nama = itemView.findViewById(R.id.nama);
            ukuran=itemView.findViewById(R.id.ukuran);
            harga = itemView.findViewById(R.id.harga);
        }
    }
    public BusanaAdapter(List<BusanaModel> myMenu) {
        this.myMenu = myMenu;
    }
    @Override
    public BusanaAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_menu, parent, false);
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        BusanaModel menu = myMenu.get(position);
        holder.nama.setText(menu.getNama());
        holder.ukuran.setText(menu.getUkuran());
        holder.harga.setText(menu.getHarga());

    }
    @Override
    public  int getItemCount() {
        return  myMenu.size() ;
    }
}
