package com.demo.demo_icoderss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.demo.demo_icoderss.adapters.IteamListAdapter;
import com.demo.demo_icoderss.models.MainResponse;
import com.demo.demo_icoderss.models.MenuItemDetailItem;
import com.demo.demo_icoderss.models.ResultItem;
import com.demo.demo_icoderss.retrofit.APIClient;
import com.demo.demo_icoderss.retrofit.APIInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
      private RecyclerView recyclerView;
      private IteamListAdapter adapter;
      private List<ResultItem> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       recyclerView = findViewById(R.id.recyclerViewMenu);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));

        initApi();
    }

    private void initApi() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("member_name", "29-09-2020");
        hashMap.put("delivery_type_time_slots", "1");
        hashMap.put("is_langauge", "E");
        hashMap.put("latitude", "23.04565431097748");
        hashMap.put("longitude", "72.51181852072477");
        hashMap.put("restaurant_id", "1334");
        hashMap.put("starttime", "11:45");
        hashMap.put("vendor_id", "40818");

        APIInterface apiInterface = APIClient.getClient().create(APIInterface.class);
        Call<MainResponse> call = apiInterface.GetMenuItem(hashMap);
        call.enqueue(new Callback<MainResponse>() {

            @Override
            public void onResponse(Call<MainResponse> call, Response<MainResponse> response) {
                if (response.body() != null) {

                    list = response.body().getResult();
                    adapter = new IteamListAdapter(MainActivity.this,list);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<MainResponse> call, Throwable t) {
                call.cancel();
            }
        });
    }
}