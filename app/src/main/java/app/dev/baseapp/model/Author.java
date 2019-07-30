package app.dev.baseapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Author implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("avatars")
    @Expose
    private List<Avatar> avatars = null;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("blog")
    @Expose
    private Boolean blog;
    public final static Parcelable.Creator<Author> CREATOR = new Creator<Author>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Author createFromParcel(Parcel in) {
            return new Author(in);
        }

        public Author[] newArray(int size) {
            return (new Author[size]);
        }

    }
            ;

    protected Author(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.avatars, (Avatar.class.getClassLoader()));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.blog = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Avatar> getAvatars() {
        return avatars;
    }

    public void setAvatars(List<Avatar> avatars) {
        this.avatars = avatars;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getBlog() {
        return blog;
    }

    public void setBlog(Boolean blog) {
        this.blog = blog;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeList(avatars);
        dest.writeValue(url);
        dest.writeValue(blog);
    }

    public int describeContents() {
        return 0;
    }

}
