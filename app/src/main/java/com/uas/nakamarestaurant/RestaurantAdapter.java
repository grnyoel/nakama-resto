//package com.uas.nakamarestaurant;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {
//
//    private List<Restaurant> restaurantList;
//
//    public RestaurantAdapter(List<Restaurant> restaurantList) {
//        this.restaurantList = restaurantList;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurant, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        Restaurant restaurant = restaurantList.get(position);
//        holder.nameTextView.setText(restaurant.getName());
//        holder.descriptionTextView.setText(restaurant.getDescription());
//        holder.imageView.setImageResource(restaurant.getImageResId());
//    }
//
//    @Override
//    public int getItemCount() {
//        return restaurantList.size();
//    }
//
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        public TextView nameTextView;
//        public TextView descriptionTextView;
//        public ImageView imageView;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            nameTextView = itemView.findViewById(R.id.restaurant_name);
//            descriptionTextView = itemView.findViewById(R.id.restaurant_description);
//            imageView = itemView.findViewById(R.id.restaurant_image);
//        }
//    }
//}
