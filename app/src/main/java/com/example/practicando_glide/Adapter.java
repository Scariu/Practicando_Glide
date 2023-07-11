package com.example.practicando_glide;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practicando_glide.databinding.ItemBinding;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<ClipData.Item> imagenes;
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        String item = String.valueOf(imagenes.get(position));
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return imagenes.size();
    }
    public void setData(List<ClipData.Item> data) {
        this.imagenes = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
private ItemBinding itemBinding;
        public ViewHolder(ItemBinding binding) {
            super(binding.getRoot());
        }

        public void bind(String imagenes) {
        }
    }
}
