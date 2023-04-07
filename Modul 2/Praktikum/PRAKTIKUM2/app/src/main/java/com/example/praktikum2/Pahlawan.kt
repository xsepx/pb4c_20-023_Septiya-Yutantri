package com.example.praktikum2

import android.os.Parcel
import android.os.Parcelable

data class Pahlawan(val image:Int, val name:String) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pahlawan> {
        override fun createFromParcel(parcel: Parcel): Pahlawan {
            return Pahlawan(parcel)
        }

        override fun newArray(size: Int): Array<Pahlawan?> {
            return arrayOfNulls(size)
        }
    }

}