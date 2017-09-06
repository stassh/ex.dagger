package org.stassh.ex.dagger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import org.joda.time.DateTime;
import org.stassh.ex.dagger.network.DateTimeConverter;
import org.stassh.ex.dagger.network.GithubService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sshabalin on 9/6/2017
 * Copyright (c) 2017. All rights reserved.
 * Last modified 9/6/2017 12:32 PM
 */

@Module(includes = NetworkModule.class)
public class GithubServiceModule {

  @Provides
  @GithubApplicationScope
  public GithubService githubService(Retrofit gitHubRetrofit) {
    return gitHubRetrofit.create(GithubService.class);
  }

  @Provides
  @GithubApplicationScope
  public Gson gson() {
    GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeConverter());
    return gsonBuilder.create();
  }

  @Provides
  @GithubApplicationScope
  public Retrofit retrofit(OkHttpClient okHttpClient, Gson gson) {
    return new Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(okHttpClient)
        .baseUrl("https://api.github.com/")
        .build();
  }}
