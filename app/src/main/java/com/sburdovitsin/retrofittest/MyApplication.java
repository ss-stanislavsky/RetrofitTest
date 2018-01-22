package com.sburdovitsin.retrofittest;

import android.app.*;
import retrofit2.*;
import com.google.gson.*;
import retrofit2.converter.gson.*;

public class MyApplication extends Application
{
	private static Api api;
	private Retrofit retrofit;

	@Override
	public void onCreate()
	{
		super.onCreate();

		retrofit = new Retrofit.Builder()
			.baseUrl("https://ws3.morpher.ru/")
			.addConverterFactory(GsonConverterFactory.create())
			.build();

		api = retrofit.create(Api.class);
	}

	public static Api getApi() {
		return api;
	}
}
