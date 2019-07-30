package app.dev.baseapp;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import app.dev.baseapp.adapter.ThoughtOfTheDayAdapter;
import app.dev.baseapp.connection.API;
import app.dev.baseapp.connection.RestClient;
import app.dev.baseapp.model.ContentPosition;
import app.dev.baseapp.model.ThougthOfTheDayResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvList;
    ThoughtOfTheDayAdapter adapter;
    TextView tvPrint;
    private LinearLayoutManager layoutManager;
    private Context context;
    private ThougthOfTheDayResponse thougthOfTheDay;
    public List<ContentPosition> contentPositionList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = MainActivity.this;
        setContentView(R.layout.activity_main);
        getIDs();
        getData();
        tvPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

//        A a = new A(context);
//        a.hello();
//        a.helloFromB();

    }


    private void getData() {
        API api = RestClient.getClient().create(API.class);
        api.getThoughtOfTheDay("thoughtoftheday").enqueue(new Callback<ThougthOfTheDayResponse>() {
            @Override
            public void onResponse(Call<ThougthOfTheDayResponse> call, Response<ThougthOfTheDayResponse> response) {
                if (response.isSuccessful()) {
                    if (response.code() == 200) {
                        thougthOfTheDay = new ThougthOfTheDayResponse();
                        contentPositionList.clear();
                        thougthOfTheDay = response.body();
                        contentPositionList = thougthOfTheDay.getPromotedContent().getContentPositions();

                        setThougthOfTheDayAdapter(contentPositionList);
                    }
                }

            }

            @Override
            public void onFailure(Call<ThougthOfTheDayResponse> call, Throwable t) {

            }
        });
    }

    private void setThougthOfTheDayAdapter(List<ContentPosition> contentPositionList ) {
        layoutManager = new LinearLayoutManager(context, RecyclerView.VERTICAL, false);
        rvList.setLayoutManager(layoutManager);
        adapter = new ThoughtOfTheDayAdapter(context, contentPositionList);
        rvList.setAdapter(adapter);

    }

    private void getIDs() {
        rvList = findViewById(R.id.rv_list);
        tvPrint = findViewById(R.id.print);
    }
}
