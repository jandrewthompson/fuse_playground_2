package com.jthompson.fuse;

import java.util.Date;

/**
 * Created by jathom5 on 10/3/14.
 */
public class MyTransform {

    public Object transform(Object body)
    {
        String answer = "A timer triggered at: " + new Date();

        return answer;
    }


}
