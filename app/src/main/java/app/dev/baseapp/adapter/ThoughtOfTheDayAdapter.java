package app.dev.baseapp.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import app.dev.baseapp.R;
import app.dev.baseapp.model.ContentPosition;
import app.dev.baseapp.model.ThougthOfTheDayResponse;

public class ThoughtOfTheDayAdapter extends RecyclerView.Adapter<ThoughtOfTheDayAdapter.MyviewHolder> {

    private Context context;
    private LayoutInflater inflater;
    List<ContentPosition> contentPositionList;

    public ThoughtOfTheDayAdapter(Context context, List<ContentPosition> contentPositionList) {
        this.context = context;
        this.inflater = inflater.from(context);
        this.contentPositionList = contentPositionList;

    }


    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_item, viewGroup, false);

        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder myviewHolder, final int position) {

        String ThoughtOfTheDay = contentPositionList.get(position).getDescription().toString();
        Uri imageUri = Uri.parse(contentPositionList.get(position).getImage());
        Toast.makeText(context, ThoughtOfTheDay, Toast.LENGTH_SHORT).show();
        myviewHolder.tvImageUrl.setText(ThoughtOfTheDay);
        myviewHolder.authorImage.setImageURI(imageUri);

//        myviewHolder.rlSurveyListing.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CommonUtils.isUpdateDone = false;
//                try {
//                    Intent surveyLogIntent = new Intent(context, EngineerSurveyLogDetail.class);
//                    Bundle surveyDetails = new Bundle();
//                    surveyDetails.putSerializable("data", completelist.get(position));
//                    surveyDetails.putString("hello", completelist.get(position).getEngineerName());
//                    surveyLogIntent.putExtras(surveyDetails);
//                    context.startActivity(surveyLogIntent);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });


//        myviewHolder.rlSurveyListing.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            Intent doSurvey = new Intent(context, CollectSiteDataActivity.class);
//                            doSurvey.putExtra("site_id", deliveryList.get(position).getSiteId());
//                            doSurvey.putExtra("join_site_id", deliveryList.get(position).getJoinSiteId());
//                            doSurvey.putExtra("assignedid", deliveryList.get(position).getId());
//                            doSurvey.putExtra("survey_date", deliveryList.get(position).getServerDate());
//                            doSurvey.putExtra("survey_time", deliveryList.get(position).getServerTime());
//                            doSurvey.putExtra("survey_lat", deliveryList.get(position).getLatitude());
//                            doSurvey.putExtra("survey_lang", deliveryList.get(position).getLongitude());
//                            doSurvey.putExtra("survey_assigndate", deliveryList.get(position).getAssignedDate());
//                            doSurvey.putExtra("survey_duedate", deliveryList.get(position).getDueDate());
//                            doSurvey.putExtra("survey_location", deliveryList.get(position).getLocation());
//                            doSurvey.putExtra("survey_name", deliveryList.get(position).getSiteName());
//                            context.startActivity(doSurvey);
//                        }
//                    });
    }


    @Override
    public int getItemCount() {
        return contentPositionList.size();
    }


    public class MyviewHolder extends RecyclerView.ViewHolder {

        TextView tvImageUrl;
        SimpleDraweeView authorImage;


        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

            tvImageUrl = itemView.findViewById(R.id.tv_thought_of_the_day);
            authorImage = itemView.findViewById(R.id.iv_author_img);


        }
    }


}
