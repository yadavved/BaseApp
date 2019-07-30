package app.dev.baseapp;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import app.dev.baseapp.Test.A;
import app.dev.baseapp.adapter.ListAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvList;
    ListAdapter adapter;
    TextView tvPrint;
    private LinearLayoutManager layoutManager;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = MainActivity.this;
        setContentView(R.layout.activity_main);
        getIDs();
        getData();
        setAdapter();
        tvPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        A a = new A(context);
        a.hello();
        a.helloFromB();

    }

    private void setAdapter() {
        layoutManager = new LinearLayoutManager(context, RecyclerView.VERTICAL, false);
        rvList.setLayoutManager(layoutManager);
        adapter = new ListAdapter(context);
        rvList.setAdapter(adapter);

    }

    private void getData() {
    }

    private void getIDs() {
        rvList = findViewById(R.id.rv_list);
        tvPrint = findViewById(R.id.print);
    }
}
