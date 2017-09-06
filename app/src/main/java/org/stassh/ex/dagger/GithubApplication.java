package org.stassh.ex.dagger;

import android.app.Application;
import com.squareup.picasso.Picasso;
import javax.inject.Inject;
import org.stassh.ex.dagger.network.GithubService;
import timber.log.Timber;
import timber.log.Timber.Tree;

/**
 * Created by sshabalin on 9/6/2017
 * Copyright (c) 2017. All rights reserved.
 * Last modified 9/6/2017 12:25 PM
 */

public class GithubApplication extends Application {

  @Inject
  GithubService githubService;

  @Inject
  Picasso picasso;

  @Override
  public void onCreate() {
    super.onCreate();

    Timber.plant(new Timber.DebugTree());

    GithubApplicationComponent component = DaggerGithubApplicationComponent.builder()
        .contextModule(new ContextModule(this))
        .build();
    component.injectApplication(this);
    //githubService = component.getGithubService();
    //picasso = component.getPicasso();
  }

//  public GithubService getGithubService() {
//    return githubService;
//  }
//
//  public Picasso getPicasso() {
//    return picasso;
//  }
}
