package com.crg.tpad.util.log;

import android.util.Log;

/**
 * Created by Administrator on 2018/2/23.
 */

public class Mylog {
    private static boolean DEBUG=true;

    public static void printf(String tag,String format,Object ...args)
    {
        if(DEBUG) {
            String str = String.format(format, args);
            Log.e(tag, str);
        }
    }
}
