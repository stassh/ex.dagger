package org.stassh.ex.dagger;

import android.content.Context;
import dagger.Module;
import dagger.Provides;

/**
 * Created by sshabalin on 9/6/2017
 * Copyright (c) 2017. All rights reserved.
 * Last modified 9/6/2017 12:22 PM
 */

@Module
public class ContextModule {

  private final Context context;

  ContextModule(Context context) {
    this.context = context;
  }

  @Provides
  public Context context() {
    return this.context;
  }
}
