package com.geektech.mashinakgrecyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private ArrayList<String> modelNameList;
    private ArrayList<String> dollarPriceList;
    private ArrayList<String> somPriceList;
    private ArrayList<String> bodyTypeList;
    private ArrayList<String> volumeList;
    private ArrayList<String> driveTypeList;
    private ArrayList<String> gearboxList;
    private ArrayList<String> steeringList;
    private ArrayList<String> millageList;
    private ArrayList<Integer> pictureList;


    public CarAdapter(ArrayList<String> modelNameList, ArrayList<String> dollarPriceList,
                      ArrayList<String> somPriceList, ArrayList<String> bodyTypeList,
                      ArrayList<String> volumeList, ArrayList<String> driveTypeList,
                      ArrayList<String> gearboxList, ArrayList<String> steeringList,
                      ArrayList<String> millageList, ArrayList<Integer> pictureList) {
        this.modelNameList = modelNameList;
        this.dollarPriceList = dollarPriceList;
        this.somPriceList = somPriceList;
        this.bodyTypeList = bodyTypeList;
        this.volumeList = volumeList;
        this.driveTypeList = driveTypeList;
        this.gearboxList = gearboxList;
        this.steeringList = steeringList;
        this.millageList = millageList;
        this.pictureList = pictureList;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_car, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.bind(modelNameList.get(position), dollarPriceList.get(position),
                somPriceList.get(position), bodyTypeList.get(position), volumeList.get(position),
                driveTypeList.get(position), gearboxList.get(position), steeringList.get(position),
                millageList.get(position), pictureList.get(position));
    }

    @Override
    public int getItemCount() {
        return modelNameList.size();
    }
}
