package com.example.practicando_glide;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.practicando_glide.databinding.ItemBinding;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Imagen> image = new ArrayList<>();

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Imagen item = image.get(position);
        holder.bind(item);


    }

    @Override
    public int getItemCount() {
        return image.size();
    }
    public void setImages(List<Imagen> item) {
        this.image = item;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
    private ItemBinding binding;

        public ViewHolder(ItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Imagen image) {
            binding.textViewImage.setText(image.text);
            Glide.with(binding.getRoot()).load(image.url).into(binding.imageViewCard);
        }
    }
}
