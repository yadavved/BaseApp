package app.dev.baseapp.connection;


import app.dev.baseapp.model.CommonResponse;
import app.dev.baseapp.model.LoginResponse;
import app.dev.baseapp.model.ResgisterUser;
import app.dev.baseapp.model.ThougthOfTheDayResponse;
import app.dev.baseapp.model.input.InputLogin;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;


public interface API {

    @POST("loginAuth")
    Call<LoginResponse> login(@Body InputLogin body);

    @Multipart
    @POST("submitsurvey")
    Call<CommonResponse> submit(@Part("engineer_id") RequestBody engineerid,
                                @Part("site_id") RequestBody siteid,
                                @Part("remark") RequestBody remark,
                                @Part("survey_date") RequestBody survey_date,
                                @Part("survey_time") RequestBody survey_time,
                                @Part("stakeholder") RequestBody stakeholder,
                                @Part("name") RequestBody name,
                                @Part("phone") RequestBody phone,
                                @Part("address") RequestBody address,
                                @Part("status") RequestBody status,
                                @Part("assign_id") RequestBody assingedid,
                                @Part MultipartBody.Part file,
                                @Part MultipartBody.Part fname);

    //    @Headers("Content-Type: application/json")
    @FormUrlEncoded
    @POST("register.json")
    Call<ResgisterUser> getTestt(@Field("phone") String site_id, @Field("device_token") String engineer_id);

    @GET("get.json")
    Call<ThougthOfTheDayResponse> getThoughtOfTheDay(@Query("location") String location);

}

