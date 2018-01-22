package com.sburdovitsin.retrofittest;

import android.app.*;
import android.os.*;
import retrofit2.*;
import java.util.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		MyApplication.getApi()
			.getData("ukrainian", 
			"Кравченко Микола Іванович", 
			"name", "json")
			.enqueue(new Callback<List<ApiResponse>>() {
				@Override
				public void onResponse(Call<List<ApiResponse>> call, Response<List<ApiResponse>> response)
				{
					Toast.makeText(MainActivity.this, 
						response.body().get(0).toString(), 
						Toast.LENGTH_LONG).show();
				}

				@Override
				public void onFailure(Call<List<ApiResponse>> call, Throwable t)
				{
					Toast.makeText(MainActivity.this, 
					t.toString(), Toast.LENGTH_LONG).show();
				}
			});
    }
}
