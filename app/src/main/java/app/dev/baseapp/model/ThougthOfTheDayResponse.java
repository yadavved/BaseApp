package app.dev.baseapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ThougthOfTheDayResponse implements Parcelable {

        @SerializedName("promotedContent")
        @Expose
        private PromotedContent promotedContent;
        public final static Parcelable.Creator<ThougthOfTheDayResponse> CREATOR = new Creator<ThougthOfTheDayResponse>() {


            @SuppressWarnings({
                    "unchecked"
            })
            public ThougthOfTheDayResponse createFromParcel(Parcel in) {
                return new ThougthOfTheDayResponse(in);
            }

            public ThougthOfTheDayResponse[] newArray(int size) {
                return (new ThougthOfTheDayResponse[size]);
            }

        }
                ;

        protected ThougthOfTheDayResponse(Parcel in) {
            this.promotedContent = ((PromotedContent) in.readValue((PromotedContent.class.getClassLoader())));
        }

        public ThougthOfTheDayResponse() {
        }

        public PromotedContent getPromotedContent() {
            return promotedContent;
        }

        public void setPromotedContent(PromotedContent promotedContent) {
            this.promotedContent = promotedContent;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeValue(promotedContent);
        }

        public int describeContents() {
            return 0;
        }
}
