package app.dev.baseapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import app.dev.baseapp.R;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyviewHolder> {

    private Context context;
    private LayoutInflater inflater;


    public ListAdapter(Context context) {
        this.context = context;
        this.inflater = inflater.from(context);

    }


    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_item, viewGroup, false);

        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder myviewHolder, final int position) {


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

//        return itemList.size();
        return 0;
    }


    public class MyviewHolder extends RecyclerView.ViewHolder {


        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }


}
