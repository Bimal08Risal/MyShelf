package com.example.myshelf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    private RecyclerView categoryRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String title = getIntent().getStringExtra("CategoryName");
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        categoryRecyclerView = findViewById(R.id.category_recyclerview);

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

        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(this);
        testingLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        categoryRecyclerView.setLayoutManager(testingLayoutManager);

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

        HomePageAdapter adapter = new HomePageAdapter(homePageModelList);
        categoryRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_icon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.main_search_icon) {
            //todo: search
            return true;
        }else if (id == android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
