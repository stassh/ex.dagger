package org.stassh.ex.dagger;

import android.content.Context;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by sshabalin on 9/6/2017
 * Copyright (c) 2017. All rights reserved.
 * Last modified 9/6/2017 12:45 PM
 */

@Module(includes = ContextModule.class)
public class PicassoModule {

  @Provides
  public Picasso picasso(Context context, OkHttp3Downloader okHttp3Downloader) {
    return new Picasso.Builder(context)
        .downloader(okHttp3Downloader).build();
  }

  @Provides
  public OkHttp3Downloader okHttp3Downloader(OkHttpClient okHttpClient) {
    return new OkHttp3Downloader(okHttpClient);
  }
}
