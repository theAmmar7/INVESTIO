package com.example.investio;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JSONPlaceholderApi {
    @GET("query?function=TIME_SERIES_DAILY&outputsize=full")
    Call<ApiResponse> getApiResponse(@Query("symbol") String symbol, @Query("apikey") String apiKey);
}

