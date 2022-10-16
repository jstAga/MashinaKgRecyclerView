package com.geektech.mashinakgrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView tvModelName;
    private TextView tvDollarPrice;
    private TextView tvSomPrice;
    private TextView tvBodyType;
    private TextView tvVolume;
    private TextView tvDriveType;
    private TextView tvGearbox;
    private TextView tvSteering;
    private TextView tvMillage;
    private ImageView ivPicture;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);

        initViews(itemView);
    }

    public void bind(String modelName, String dollarPrice, String somPrice, String bodyType,
                     String volume, String driveType, String gearbox,
                     String steering, String millage, Integer picture) {

        tvModelName.setText(modelName);
        tvDollarPrice.setText(dollarPrice);
        tvSomPrice.setText(somPrice);
        tvBodyType.setText(bodyType);
        tvVolume.setText(volume);
        tvDriveType.setText(driveType);
        tvGearbox.setText(gearbox);
        tvSteering.setText(steering);
        tvMillage.setText(millage);
        ivPicture.setImageResource(picture);
    }


    private void initViews(View itemView) {

        tvModelName = itemView.findViewById(R.id.tv_model_name);
        tvDollarPrice = itemView.findViewById(R.id.tv_model_dollar_price);
        tvSomPrice = itemView.findViewById(R.id.tv_model_som_price);
        tvBodyType = itemView.findViewById(R.id.tv_body_type);
        tvVolume = itemView.findViewById(R.id.tv_volume);
        tvDriveType = itemView.findViewById(R.id.tv_drive_type);
        tvGearbox = itemView.findViewById(R.id.tv_gearbox);
        tvSteering = itemView.findViewById(R.id.tv_steering);
        tvMillage = itemView.findViewById(R.id.tv_millage);
        ivPicture = itemView.findViewById(R.id.iv_picture);
    }
}
