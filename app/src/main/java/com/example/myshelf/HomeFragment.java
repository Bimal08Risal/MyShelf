package com.example.myshelf;


import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    private RecyclerView categoryRecyclerView;
    private CategoryAdaptor categoryAdaptor;
    private RecyclerView testing;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        categoryRecyclerView = view.findViewById(R.id.category_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        categoryRecyclerView.setLayoutManager(layoutManager);

        final List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
        categoryModelList.add(new CategoryModel("Link","Home"));
        categoryModelList.add(new CategoryModel("Link","Course Books"));
        categoryModelList.add(new CategoryModel("Link","Literature"));
        categoryModelList.add(new CategoryModel("Link","Cooking"));
        categoryModelList.add(new CategoryModel("Link","Sports"));
        categoryModelList.add(new CategoryModel("Link","History"));
        categoryModelList.add(new CategoryModel("Link","Religion"));
        categoryModelList.add(new CategoryModel("Link","Romance"));
        categoryModelList.add(new CategoryModel("Link","Travel"));

        categoryAdaptor = new CategoryAdaptor(categoryModelList);
        categoryRecyclerView.setAdapter(categoryAdaptor);
        categoryAdaptor.notifyDataSetChanged();

        ////////Banner Slider
        List<SliderModel> sliderModelList = new ArrayList<SliderModel>();

        sliderModelList.add(new SliderModel(R.drawable.banner_slider1,"#ffffff"));
        sliderModelList.add(new SliderModel(R.drawable.banner_slider2,"#ffffff"));
        sliderModelList.add(new SliderModel(R.drawable.banner_slider1,"#ffffff"));

        sliderModelList.add(new SliderModel(R.drawable.banner_slider2,"#ffffff"));
        sliderModelList.add(new SliderModel(R.drawable.banner_slider3,"#ffffff"));
        sliderModelList.add(new SliderModel(R.drawable.banner_slider4,"#ffffff"));

        sliderModelList.add(new SliderModel(R.drawable.banner_slider5,"#ffffff"));
        sliderModelList.add(new SliderModel(R.drawable.banner_slider4,"#ffffff"));
        sliderModelList.add(new SliderModel(R.drawable.banner_slider5,"#ffffff"));
        ////////Banner Slider


        ///////// Horizontal Product Layout

        List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.product_image,"Priya Sufi","Subin Bhattrai","Rs.281.00/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.product_image,"Priya Sufi","Subin Bhattrai","Rs.281.00/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.product_image,"Priya Sufi","Subin Bhattrai","Rs.281.00/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.product_image,"Priya Sufi","Subin Bhattrai","Rs.281.00/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.product_image,"Priya Sufi","Subin Bhattrai","Rs.281.00/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.product_image,"Priya Sufi","Subin Bhattrai","Rs.281.00/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.product_image,"Priya Sufi","Subin Bhattrai","Rs.281.00/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.product_image,"Priya Sufi","Subin Bhattrai","Rs.281.00/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.product_image,"Priya Sufi","Subin Bhattrai","Rs.281.00/-"));

        ///////// Horizontal Product Layout

        //////////////////////////////////

        testing = view.findViewById(R.id.home_page_recyclerview);
        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(getContext());
        testingLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        testing.setLayoutManager(testingLayoutManager);

        List<HomePageModel> homePageModelList = new ArrayList<>();
        homePageModelList.add(new HomePageModel(0,sliderModelList));
        homePageModelList.add(new HomePageModel(1,R.drawable.banner_slider8,"#000000"));
        homePageModelList.add(new HomePageModel(2,"Recently Added",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3,"Mostly Viewed",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1,R.drawable.banner_slider8,"#000000"));
        homePageModelList.add(new HomePageModel(3,"Mostly Viewed",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2,"Recently Added",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1,R.drawable.banner_slider8,"#000000"));
        homePageModelList.add(new HomePageModel(1,R.drawable.banner_slider8,"#000000"));
        homePageModelList.add(new HomePageModel(0,sliderModelList));

        HomePageAdapter adapter = new HomePageAdapter(homePageModelList);
        testing.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        /////////////////////////////////


        return view;
    }
}
