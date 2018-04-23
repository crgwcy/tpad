package com.crg.tpad.util.parcelable;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by bruce.cui on 2018/2/22.
 */

public class MyParcelable implements Parcelable {
    private int mData;

    public int getmData() {
        return mData;
    }

    public void setmData(int mData) {
        this.mData = mData;
    }

    public MyParcelable(int mData) {
        this.mData = mData;
    }

    protected MyParcelable(Parcel in) {
        mData = in.readInt();
    }

    public static final Creator<MyParcelable> CREATOR = new Creator<MyParcelable>() {
        @Override
        public MyParcelable createFromParcel(Parcel in) {
            return new MyParcelable(in);
        }

        @Override
        public MyParcelable[] newArray(int size) {
            return new MyParcelable[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(mData);
    }
}
