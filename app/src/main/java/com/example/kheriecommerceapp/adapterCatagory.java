package com.example.kheriecommerceapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapterCatagory extends RecyclerView.Adapter<adapterCatagory.ViewHolder> {

    private List<adapterCatagory> adapterCatagoryList;

    @NonNull
    @Override
    public adapterCatagory.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.catagoryitem,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterCatagory.ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView cat_image;
        private TextView cat_text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cat_image = itemView.findViewById(R.id.home_catagory);
            cat_text = itemView.findViewById(R.id.textView3);

        }

        private void setCatName(String name){
cat_text.setText(name);
    }
    }
}
