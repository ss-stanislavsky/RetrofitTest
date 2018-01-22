package com.sburdovitsin.retrofittest;

import retrofit2.*;
import java.util.*;
import com.sburdovitsin.retrofittest.*;
import retrofit2.http.*;

public interface Api
{
	@GET("/{language}/declension")
	Call<List<ApiResponse>> getData(
		@Path("language") String language,
		@Query("name") String Name, 
		@Query("flags") String flags, 
		@Query("format") String format);
}

//https://ws3.morpher.ru/ukrainian/declension?s=Крутько%20Катерина%20Володимирiвна&flags=name&format=json
