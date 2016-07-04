package com.owl.baselib.http;

import com.owl.baselib.log.MLog;

/**
 * Created by qiushunming on 16/6/30.
 */
public class HttpUtils {

    public interface OnResponse{
        public void onStart();

        public void onProcess();

        public void onCancel();

        public void onSuccess();

        public void onError();
    }

    public static void post(){
        MLog.i("post");
    }

    public static void get(){

    }

    public static void upload(){

    }

    public static void download(){

    }

}
