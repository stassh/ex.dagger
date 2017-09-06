package org.stassh.ex.dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Scope;

/**
 * Created by sshabalin on 9/6/2017
 * Copyright (c) 2017. All rights reserved.
 * Last modified 9/6/2017 1:59 PM
 */

@Scope
@Retention(RetentionPolicy.CLASS)
public @interface GithubApplicationScope {

}
