package com.asa.findmyvolunteer;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Anush on 29-04-2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private List<VictimData> victims;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nm,ph,st,rq,nmval,phval,sval,reqval;

        public MyViewHolder(View view) {
            super(view);
            nm=(TextView) view.findViewById(R.id.name);
            ph=(TextView) view.findViewById(R.id.phone);
            st=(TextView) view.findViewById(R.id.sit);
            rq=(TextView) view.findViewById(R.id.req);
            nmval=(TextView) view.findViewById(R.id.nmtext);
            phval=(TextView) view.findViewById(R.id.phtext);
            sval=(TextView) view.findViewById(R.id.stext);
            reqval=(TextView) view.findViewById(R.id.reqtext);
        }
    }
    public RecyclerAdapter(List<VictimData> victimsList)
    {
        this.victims=victimsList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        VictimData victimData = victims.get(position);
        holder.nmval.setText(victimData.getName());
        holder.phval.setText(victimData.getPhone());
        holder.sval.setText(victimData.getSit());
        holder.reqval.setText(victimData.getReq());
    }

    @Override
    public int getItemCount() {
        return victims.size();
    }
}