package com.coolwheather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.connection.RealConnection;

/**
 * Created by Administrator on 2017/3/4 0004.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
