package com.example.as_c4_sp1_retrofit_task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView textAPI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        textAPI = findViewById(R.id.mainText);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.nasa.gov/planetary/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonApi json = retrofit.create(JsonApi.class);
        Call<APOD> call = json.getPosts();
        call.enqueue(new Callback<APOD>() {
            @Override
            public void onResponse(Call<APOD> call, Response<APOD> response) {
                if(!response.isSuccessful())
                {
                    textAPI.setText(response.code());
                    return;
                }
                APOD posts = response.body();
                    String content = "Copiright: ";
                    content +=posts.getCopyright()+"\nTitle: ";
                    content += posts.getTitle()+"\nDate: ";
                    content+=posts.getDate()+"\nExplanation: ";
                    content+=posts.getExplanation();
                    textAPI.append(content);
            }

            @Override
            public void onFailure(Call<APOD> call, Throwable t) {
                textAPI.setText(t.getMessage());
            }
        });
    }
}