package com.owl.baselib.log;

import android.util.Log;

import java.util.Locale;

/**
 * Created by ming on 16/7/2.
 */
public class MLog {

    public static void i(String content){
        String tag = generateTag(getCaller());
        Log.i(tag, content);
    }

    public static void d(String content){
        String tag = generateTag(getCaller());
        Log.d(tag, content);
    }

    public static void w(String content){
        String tag = generateTag(getCaller());
        Log.w(tag, content);
    }

    public static void e(String content){
        String tag = generateTag(getCaller());
        Log.e(tag, content);
    }

    public static void v(String content){
        String tag = generateTag(getCaller());
        Log.v(tag, content);
    }

    private static String generateTag(StackTraceElement caller){
        String tagFormat = "%s.%s(L:%d)";

        String fullClassName = caller.getClassName();
        String simpleClassName = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);

        String tag = String.format(Locale.CHINA, tagFormat, simpleClassName, caller.getMethodName(), caller.getLineNumber());
        return tag;

    }
    private static StackTraceElement getCaller(){
        return Thread.currentThread().getStackTrace()[4];
    }
}
