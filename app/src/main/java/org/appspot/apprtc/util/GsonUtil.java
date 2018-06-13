package org.appspot.apprtc.util;

import com.google.gson.Gson;

/**
 * Created by Steve on 2018/3/23.
 * @author Steve
 */
public class GsonUtil {
    private static final Gson ourInstance = new Gson();

    public static Gson getInstance() {
        return ourInstance;
    }
}
