package com.example.retrofit_rest_firebase;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;

public class ApiClient {
    public class ApiClient {
        public static String BASE_URL
            ="https://deleteme-ad041.firebaseio.com";
        private static Retrofit retrofit;
        public static Retrofit getClient(){
            if(retrofit == null){
                retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
            }
            return retrofit;
        }
    }

