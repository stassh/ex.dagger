package org.stassh.ex.dagger;

import com.squareup.picasso.Picasso;
import dagger.Component;
import org.stassh.ex.dagger.network.GithubService;

/**
 * Created by sshabalin on 9/6/2017
 * Copyright (c) 2017. All rights reserved.
 * Last modified 9/6/2017 12:26 PM
 */

@GithubApplicationScope
@Component(modules = {GithubServiceModule.class, PicassoModule.class} )
public interface GithubApplicationComponent {

  void injectApplication(GithubApplication githubApplication);
  //Picasso getPicasso();

  //GithubService getGithubService();
}
