package com.geektech.mashinakgrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCar;

    private ArrayList<String> modelNameList = new ArrayList<>();
    private ArrayList<String> dollarPriceList = new ArrayList<>();
    private ArrayList<String> somPriceList = new ArrayList<>();
    private ArrayList<String> bodyTypeList = new ArrayList<>();
    private ArrayList<String> volumeList = new ArrayList<>();
    private ArrayList<String> driveTypeList = new ArrayList<>();
    private ArrayList<String> gearboxList = new ArrayList<>();
    private ArrayList<String> steeringList = new ArrayList<>();
    private ArrayList<String> millageList = new ArrayList<>();
    private ArrayList<Integer> pictureList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addCar();
        addCar();
        addCar();
        addCar();
        addCar();
        addCar();
        addCar();
        addCar();


        CarAdapter carAdapter = new CarAdapter(modelNameList, dollarPriceList, somPriceList,
                bodyTypeList, volumeList, driveTypeList, gearboxList, steeringList,
                millageList, pictureList);

        rvCar = findViewById(R.id.rv_car);
        rvCar.setAdapter(carAdapter);

    }

    private void addCar() {
        modelNameList.add("Lexus es · 2019");
        dollarPriceList.add("$51 427");
        somPriceList.add("4 320 000");
        bodyTypeList.add("Sedan");
        volumeList.add("2.5");
        driveTypeList.add("Front drive type");
        gearboxList.add("Variator");
        steeringList.add("Left");
        millageList.add("43 740");
        Integer picture1 = R.drawable.ic_es2019;
        pictureList.add(picture1);

        modelNameList.add("Mercedes Sprinter · 2008");
        dollarPriceList.add("$18 500");
        somPriceList.add("1 540 125");
        bodyTypeList.add("Bus");
        volumeList.add("2.2");
        driveTypeList.add("4WD");
        gearboxList.add("Manual");
        steeringList.add("Left");
        millageList.add("385 223");
        Integer picture2 = R.drawable.ic_sprinter2008;
        pictureList.add(picture2);

        modelNameList.add("Lexus es · 2007");
        dollarPriceList.add("$12 800");
        somPriceList.add("1 065 000");
        bodyTypeList.add("Sedan");
        volumeList.add("3.5");
        driveTypeList.add("Front drive type");
        gearboxList.add("Automatic");
        steeringList.add("Left");
        millageList.add("235 873");
        Integer picture3 = R.drawable.ic_es2007;
        pictureList.add(picture3);

        modelNameList.add("Daewoo Matiz · 2009");
        dollarPriceList.add("$5 165");
        somPriceList.add("430 000");
        bodyTypeList.add("Hatchback");
        volumeList.add("0.8");
        driveTypeList.add("Front drive type");
        gearboxList.add("Manual");
        steeringList.add("Left");
        millageList.add("150 000");
        Integer picture4 = R.drawable.ic_matiz2008;
        pictureList.add(picture4);
    }
}