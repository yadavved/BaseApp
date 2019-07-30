package app.dev.baseapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ContentPosition implements Parcelable
{

    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("authors")
    @Expose
    private List<Author> authors = null;
    @SerializedName("shortUri")
    @Expose
    private String shortUri;
    @SerializedName("hideDescription")
    @Expose
    private Boolean hideDescription;
    @SerializedName("fullImage")
    @Expose
    private Boolean fullImage;
    @SerializedName("sponsored")
    @Expose
    private Boolean sponsored;
    @SerializedName("removeTopPadding")
    @Expose
    private Boolean removeTopPadding;
    @SerializedName("removeBottomPadding")
    @Expose
    private Boolean removeBottomPadding;
    public final static Parcelable.Creator<ContentPosition> CREATOR = new Creator<ContentPosition>() {


        @SuppressWarnings({
                "unchecked"
        })
        public ContentPosition createFromParcel(Parcel in) {
            return new ContentPosition(in);
        }

        public ContentPosition[] newArray(int size) {
            return (new ContentPosition[size]);
        }

    }
            ;

    protected ContentPosition(Parcel in) {
        this.position = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.image = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.uri = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.authors, (Author.class.getClassLoader()));
        this.shortUri = ((String) in.readValue((String.class.getClassLoader())));
        this.hideDescription = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.fullImage = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.sponsored = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.removeTopPadding = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.removeBottomPadding = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public ContentPosition() {
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getShortUri() {
        return shortUri;
    }

    public void setShortUri(String shortUri) {
        this.shortUri = shortUri;
    }

    public Boolean getHideDescription() {
        return hideDescription;
    }

    public void setHideDescription(Boolean hideDescription) {
        this.hideDescription = hideDescription;
    }

    public Boolean getFullImage() {
        return fullImage;
    }

    public void setFullImage(Boolean fullImage) {
        this.fullImage = fullImage;
    }

    public Boolean getSponsored() {
        return sponsored;
    }

    public void setSponsored(Boolean sponsored) {
        this.sponsored = sponsored;
    }

    public Boolean getRemoveTopPadding() {
        return removeTopPadding;
    }

    public void setRemoveTopPadding(Boolean removeTopPadding) {
        this.removeTopPadding = removeTopPadding;
    }

    public Boolean getRemoveBottomPadding() {
        return removeBottomPadding;
    }

    public void setRemoveBottomPadding(Boolean removeBottomPadding) {
        this.removeBottomPadding = removeBottomPadding;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(position);
        dest.writeValue(type);
        dest.writeValue(image);
        dest.writeValue(description);
        dest.writeValue(uri);
        dest.writeValue(id);
        dest.writeList(authors);
        dest.writeValue(shortUri);
        dest.writeValue(hideDescription);
        dest.writeValue(fullImage);
        dest.writeValue(sponsored);
        dest.writeValue(removeTopPadding);
        dest.writeValue(removeBottomPadding);
    }

    public int describeContents() {
        return 0;
    }

}
