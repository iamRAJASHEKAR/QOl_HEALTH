package com.example.yeswanth.recyclerview_advanced;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yeswanth.recyclerview_advanced.Activity.Ayurveda;
import com.example.yeswanth.recyclerview_advanced.Activity.Homoeopathy;

import java.util.ArrayList;

/**
 * Created by mypc on 2/1/2018.
 */


public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {
    Context context;
    ArrayList<ModelClass> modelClassArrayList;

    public RecyclerviewAdapter(Context context, ArrayList<ModelClass> arrayList) {
        this.context = context;
        this.modelClassArrayList = arrayList;
    }

    @Override
    public RecyclerviewAdapter.ViewHolder
    onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout, null);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerviewAdapter.ViewHolder holder, int position) {
        holder.icon_text.setText(modelClassArrayList.get(position).getName());
        holder.image.setImageResource(modelClassArrayList.get(position).getImage());

    }

    @Override
    public int getItemCount() {

        return modelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView icon_text;
        ImageView image;
        RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            icon_text = (TextView) itemView.findViewById(R.id.text1);
            image = (ImageView) itemView.findViewById(R.id.image1);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relate);
/*

            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.e("sachin", String.valueOf(getAdapterPosition()));
                    Intent intent = new Intent(context.getApplicationContext(), Medicines.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    context.getApplicationContext().startActivity(intent);

                }
            });
*/


            relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Log.e("sachin", String.valueOf(getAdapterPosition()));
                    if (getAdapterPosition() == 0) {
                        Intent intent = new Intent(context.getApplicationContext(), Medicines.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        context.getApplicationContext().startActivity(intent);
                    } else if (getAdapterPosition() == 1) {
                        Intent intent = new Intent(context.getApplicationContext(), Medicineinfo.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        context.getApplicationContext().startActivity(intent);

                    } else if (getAdapterPosition() == 2) {
                        Intent intent = new Intent(context.getApplicationContext(), Labs.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        context.getApplicationContext().startActivity(intent);

                    } else if (getAdapterPosition() == 3) {
                        Intent intent = new Intent(context.getApplicationContext(), Labsnew.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        context.getApplicationContext().startActivity(intent);
                    } else if (getAdapterPosition() == 4) {
                        Intent intent = new Intent(context.getApplicationContext(), Weightloss.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        context.getApplicationContext().startActivity(intent);

                    } else if (getAdapterPosition() == 5) {
                        Intent intent = new Intent(context.getApplicationContext(), Homecare.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        context.getApplicationContext().startActivity(intent);

                    } else if (getAdapterPosition() == 6) {
                       /* Intent intent = new Intent(context.getApplicationContext(), Ayurveda.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        context.getApplicationContext().startActivity(intent);
*/
                    } else if (getAdapterPosition() == 7) {
                        /*Intent intent = new Intent(context.getApplicationContext(), Homoeopathy.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        context.getApplicationContext().startActivity(intent);
*/
                    } else if (getAdapterPosition() == 8) {
                        Intent intent = new Intent(context.getApplicationContext(), Nutrition.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        context.getApplicationContext().startActivity(intent);

                    } else if (getAdapterPosition() == 9) {
                        Intent intent = new Intent(context.getApplicationContext(), Gyms.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        context.getApplicationContext().startActivity(intent);

                    } else if (getAdapterPosition() == 10) {
                        Intent intent = new Intent(context.getApplicationContext(), Yoga.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        context.getApplicationContext().startActivity(intent);

                    } else if (getAdapterPosition() == 11) {
                        Intent intent = new Intent(context.getApplicationContext(), Babycare.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        context.getApplicationContext().startActivity(intent);

                    }
                }
            });

        /*    image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    selectedposition = getLayoutPosition();
                    Intent i=new Intent(context,Medicines.





                    class);
                    context.startActivity(i);

                    }
            });*/
        }
    }
}
