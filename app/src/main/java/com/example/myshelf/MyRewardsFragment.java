package com.example.myshelf;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyRewardsFragment extends Fragment {


    public MyRewardsFragment() {
        // Required empty public constructor
    }

    private RecyclerView rewardsRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_rewards, container, false);

        rewardsRecyclerView = view.findViewById(R.id.my_rewards_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rewardsRecyclerView.setLayoutManager(layoutManager);

        List<RewardModel> rewardModelList = new ArrayList<>();
        rewardModelList.add(new RewardModel("Cashback", "till 5th July,2019","GET 20% CASHBACK on any product above Rs.200.00/- and below Rs.3000.00/-."));
        rewardModelList.add(new RewardModel("Discount", "till 5th July,2019","GET 20% CASHBACK on any product above Rs.200.00/- and below Rs.3000.00/-."));
        rewardModelList.add(new RewardModel("Buy 1 Get 1 free", "till 5th July,2019","GET 20% CASHBACK on any product above Rs.200.00/- and below Rs.3000.00/-."));
        rewardModelList.add(new RewardModel("Cashback", "till 5th July,2019","GET 20% CASHBACK on any product above Rs.200.00/- and below Rs.3000.00/-."));
        rewardModelList.add(new RewardModel("Discount", "till 5th July,2019","GET 20% CASHBACK on any product above Rs.200.00/- and below Rs.3000.00/-."));
        rewardModelList.add(new RewardModel("Buy 1 Get 1 free", "till 5th July,2019","GET 20% CASHBACK on any product above Rs.200.00/- and below Rs.3000.00/-."));
        rewardModelList.add(new RewardModel("Cashback", "till 5th July,2019","GET 20% CASHBACK on any product above Rs.200.00/- and below Rs.3000.00/-."));
        rewardModelList.add(new RewardModel("Discount", "till 5th July,2019","GET 20% CASHBACK on any product above Rs.200.00/- and below Rs.3000.00/-."));
        rewardModelList.add(new RewardModel("Buy 1 Get 1 free", "till 5th July,2019","GET 20% CASHBACK on any product above Rs.200.00/- and below Rs.3000.00/-."));

        MyRewardsAdapter myRewardsAdapter = new MyRewardsAdapter(rewardModelList,false);
        rewardsRecyclerView.setAdapter(myRewardsAdapter);
        myRewardsAdapter.notifyDataSetChanged();

        return view;
    }

}
