package app.dev.baseapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Avatar implements Parcelable {
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("image")
    @Expose
    private String image;
    public final static Parcelable.Creator<Avatar> CREATOR = new Creator<Avatar>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Avatar createFromParcel(Parcel in) {
            return new Avatar(in);
        }

        public Avatar[] newArray(int size) {
            return (new Avatar[size]);
        }

    };

    protected Avatar(Parcel in) {
        this.size = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.image = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Avatar() {
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(size);
        dest.writeValue(image);
    }

    public int describeContents() {
        return 0;
    }

}