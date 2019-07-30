package app.dev.baseapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PromotedContent implements  Parcelable {
    @SerializedName("channel")
    @Expose
    private String channel;
    @SerializedName("section")
    @Expose
    private String section;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("contentPositions")
    @Expose
    private List<ContentPosition> contentPositions = null;
    @SerializedName("more")
    @Expose
    private Boolean more;
    @SerializedName("enableAds")
    @Expose
    private Boolean enableAds;
    @SerializedName("removeBVPrepend")
    @Expose
    private Boolean removeBVPrepend;
    @SerializedName("brandvoiceHeader")
    @Expose
    private Boolean brandvoiceHeader;
    @SerializedName("removePadding")
    @Expose
    private Boolean removePadding;
    @SerializedName("fullImage")
    @Expose
    private Boolean fullImage;
    @SerializedName("removeTopPadding")
    @Expose
    private Boolean removeTopPadding;
    @SerializedName("removeBottomPadding")
    @Expose
    private Boolean removeBottomPadding;
    @SerializedName("profileLink")
    @Expose
    private Boolean profileLink;
    @SerializedName("fullListLink")
    @Expose
    private Boolean fullListLink;
    @SerializedName("pagination")
    @Expose
    private Boolean pagination;
    @SerializedName("filters")
    @Expose
    private Boolean filters;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("directLink")
    @Expose
    private Boolean directLink;
    public final static Parcelable.Creator<PromotedContent> CREATOR = new Creator<PromotedContent>() {


        @SuppressWarnings({
                "unchecked"
        })
        public PromotedContent createFromParcel(Parcel in) {
            return new PromotedContent(in);
        }

        public PromotedContent[] newArray(int size) {
            return (new PromotedContent[size]);
        }

    }
            ;

    protected PromotedContent(Parcel in) {
        this.channel = ((String) in.readValue((String.class.getClassLoader())));
        this.section = ((String) in.readValue((String.class.getClassLoader())));
        this.location = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.contentPositions, (ContentPosition.class.getClassLoader()));
        this.more = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.enableAds = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.removeBVPrepend = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.brandvoiceHeader = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.removePadding = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.fullImage = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.removeTopPadding = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.removeBottomPadding = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.profileLink = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.fullListLink = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.pagination = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.filters = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.year = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.directLink = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public PromotedContent() {
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<ContentPosition> getContentPositions() {
        return contentPositions;
    }

    public void setContentPositions(List<ContentPosition> contentPositions) {
        this.contentPositions = contentPositions;
    }

    public Boolean getMore() {
        return more;
    }

    public void setMore(Boolean more) {
        this.more = more;
    }

    public Boolean getEnableAds() {
        return enableAds;
    }

    public void setEnableAds(Boolean enableAds) {
        this.enableAds = enableAds;
    }

    public Boolean getRemoveBVPrepend() {
        return removeBVPrepend;
    }

    public void setRemoveBVPrepend(Boolean removeBVPrepend) {
        this.removeBVPrepend = removeBVPrepend;
    }

    public Boolean getBrandvoiceHeader() {
        return brandvoiceHeader;
    }

    public void setBrandvoiceHeader(Boolean brandvoiceHeader) {
        this.brandvoiceHeader = brandvoiceHeader;
    }

    public Boolean getRemovePadding() {
        return removePadding;
    }

    public void setRemovePadding(Boolean removePadding) {
        this.removePadding = removePadding;
    }

    public Boolean getFullImage() {
        return fullImage;
    }

    public void setFullImage(Boolean fullImage) {
        this.fullImage = fullImage;
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

    public Boolean getProfileLink() {
        return profileLink;
    }

    public void setProfileLink(Boolean profileLink) {
        this.profileLink = profileLink;
    }

    public Boolean getFullListLink() {
        return fullListLink;
    }

    public void setFullListLink(Boolean fullListLink) {
        this.fullListLink = fullListLink;
    }

    public Boolean getPagination() {
        return pagination;
    }

    public void setPagination(Boolean pagination) {
        this.pagination = pagination;
    }

    public Boolean getFilters() {
        return filters;
    }

    public void setFilters(Boolean filters) {
        this.filters = filters;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getDirectLink() {
        return directLink;
    }

    public void setDirectLink(Boolean directLink) {
        this.directLink = directLink;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(channel);
        dest.writeValue(section);
        dest.writeValue(location);
        dest.writeList(contentPositions);
        dest.writeValue(more);
        dest.writeValue(enableAds);
        dest.writeValue(removeBVPrepend);
        dest.writeValue(brandvoiceHeader);
        dest.writeValue(removePadding);
        dest.writeValue(fullImage);
        dest.writeValue(removeTopPadding);
        dest.writeValue(removeBottomPadding);
        dest.writeValue(profileLink);
        dest.writeValue(fullListLink);
        dest.writeValue(pagination);
        dest.writeValue(filters);
        dest.writeValue(year);
        dest.writeValue(directLink);
    }

    public int describeContents() {
        return 0;
    }
}
