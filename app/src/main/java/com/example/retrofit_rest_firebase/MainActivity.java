package com.example.retrofit_rest_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        ApiInterface apiService = ApiClient.getClient ().create ( ApiInterface.class );

        Call<List<Movie>> call = apiService.getMovies();
        call.enqueue(new Callback<List<Movie>>() {
            @Override
            public void onResponse(Call<List<Movie>> call,
                                   Response<List<Movie>> response) {
                Log.d("George","URL successfully responded");      }
            @Override
            public void onFailure(Call<List<Movie>> call, Throwable t) {
                Log.d("George","NO Response. Reason: "+t.toString());
        }    });

    }}




