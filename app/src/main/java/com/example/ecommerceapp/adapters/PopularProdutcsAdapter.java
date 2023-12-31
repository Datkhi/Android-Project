package com.example.ecommerceapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ecommerceapp.R;
import com.example.ecommerceapp.activities.DetailedActivity;
import com.example.ecommerceapp.models.PopularProductsModel;
import com.example.ecommerceapp.models.ProductsModel;

import java.util.List;

public class PopularProdutcsAdapter extends RecyclerView.Adapter<PopularProdutcsAdapter.ViewHolder> {

    private Context context;
//    private List<PopularProductsModel> popularProductsModelList;
    private List<ProductsModel> productsModelList;

//    public PopularProdutcsAdapter(Context context, List<PopularProductsModel> popularProductsModelList) {
//        this.context = context;
//        this.popularProductsModelList = popularProductsModelList;
//    }
    public PopularProdutcsAdapter(Context context, List<ProductsModel> productsModelList) {
        this.context = context;
        this.productsModelList = productsModelList;
    }

    @NonNull
    @Override
    public PopularProdutcsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PopularProdutcsAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(productsModelList.get(position).getImg_url()).into(holder.imageView);
        holder.name.setText(productsModelList.get(position).getName());
        holder.price.setText(String.valueOf(productsModelList.get(position).getPrice()));

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailedActivity.class);
                intent.putExtra("detailed", productsModelList.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return productsModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name, price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.all_img);
            name = itemView.findViewById(R.id.all_product_name);
            price = itemView.findViewById(R.id.all_price);
        }
    }
}
