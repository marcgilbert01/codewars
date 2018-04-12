package com.example.marcgilbert.codewars.api.codewars.retrofit;

import com.example.marcgilbert.codewars.api.codewars.pojos.Challenge;
import com.example.marcgilbert.codewars.api.codewars.pojos.CompletedChallenges;
import com.example.marcgilbert.codewars.api.codewars.pojos.Member;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CodeChallengesService {

    @GET("/api/v1/users/{id_or_username}")
    Call<Member> getMember(@Path("id_or_username") String idOrUserName, @Query("access_key") String apiKey);

    @GET("/api/v1/users/{id_or_username}/code-challenges/completed")
    Call<CompletedChallenges> getCompletedChallenges(@Path("id_or_username") String idOrUserName, @Query("page") int pageNumber, @Query("access_key") String apiKey);

    @GET("/api/v1/code-challenges/{id_or_slug}")
    Call<Challenge> getChallenge(@Path("id_or_slug") String idOrSlug, @Query("access_key") String apiKey);

}
