package com.dynamicviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    Pager pager;
    ArrayList<ImageModel> imageModelsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.pager);

        imageModelsArray =  new ArrayList<>();
        ImageModel imageModel = new ImageModel();
        imageModel.setId(0);
        imageModel.setImageUrl("https://images.wholesalecatalogsurat.com/images/300/12879.jpg");
        imageModelsArray.add(imageModel);

        ImageModel imageModel1 = new ImageModel();
        imageModel1.setId(1);
        imageModel1.setImageUrl("https://images.wholesalecatalogsurat.com/images/300/12880.jpg");
        imageModelsArray.add(imageModel1);

        ImageModel imageModel2 = new ImageModel();
        imageModel2.setId(2);
        imageModel2.setImageUrl("https://images.wholesalecatalogsurat.com/images/300/12881.jpg");
        imageModelsArray.add(imageModel2);

        ImageModel imageModel3 = new ImageModel();
        imageModel3.setId(3);
        imageModel3.setImageUrl("https://images.wholesalecatalogsurat.com/images/300/12882.jpg");
        imageModelsArray.add(imageModel3);

        pager = new Pager(this, imageModelsArray);
        viewPager.setAdapter(pager);

    }
}
