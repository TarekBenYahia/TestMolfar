package com.example.testmolfar.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmolfar.Models.MusicModel;
import com.example.testmolfar.R;

import java.util.ArrayList;
import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MyViewHolder> {
    private Context mContext;
    private List<MusicModel> objects = new ArrayList<>();
    public  static MusicModel currentMusic;


  public MusicAdapter(Context context, List<MusicModel> objects) {
      this.objects = objects;
      this.mContext = context;
  }



    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView title,description;
        private ImageView imageM;
        private LinearLayout mContainer;
        public MyViewHolder(View view)  {
            super(view);
            title=view.findViewById(R.id.titleMusic);
            description=view.findViewById(R.id.descriptionMusic);
           // mContainer=view.findViewById(R.id.containerCard);
            imageM=view.findViewById(R.id.imageMusic);
        }

    }


    @NonNull
    @Override
    public MusicAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicAdapter.MyViewHolder holder, int position) {
        final MusicModel object = objects.get(position);

      holder.title.setText(object.getTitle());
      holder.description.setText(object.getDescription());
      holder.imageM.setImageResource(object.getImage());


    }

    @Override
    public int getItemCount() {
        return objects.size();
    }
}
