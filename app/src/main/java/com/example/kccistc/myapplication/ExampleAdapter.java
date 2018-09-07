package com.example.kccistc.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Debug;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
 
import com.squareup.picasso.Picasso;
 
import java.util.ArrayList;
 
 
public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private Context mContext;
    private ArrayList<ExampleItem> mExampleList;
    private OnItemClickListener mListener;
    public interface OnItemClickListener{
        void OnItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    public ExampleAdapter(Context context, ArrayList<ExampleItem> exampleList) {
        mContext = context;
        mExampleList = exampleList;
    }
 
    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.example_item, parent, false);
        return new ExampleViewHolder(v);
    }
 
    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ExampleItem currentItem = mExampleList.get(position);
 
        String imageUrl = currentItem.getImageUrl();
        String creatorName = currentItem.getCreator();
        String movieUrl = currentItem.getMovieUrl();

 
        holder.mTextViewCreator.setText(creatorName);
        holder.mTextViewUrl.setText(movieUrl);

        Picasso.with(mContext).load(imageUrl).fit().centerInside().into(holder.mImageView);
    }
 
    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
 
    public class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextViewCreator;
        public TextView mTextViewUrl;
        public LinearLayout mTextViewMovie;





        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image_view);
            mTextViewCreator = itemView.findViewById(R.id.text_view_creator);
            mTextViewMovie = itemView.findViewById(R.id.linearlayout_view);
            mTextViewUrl = itemView.findViewById(R.id.url_view);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mListener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            mListener.OnItemClick(position);
                        }
                    }
                }
            });
            mTextViewMovie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse(mTextViewUrl.getText().toString()));
                    mTextViewUrl.getContext().startActivity(intent);

                }
            });




        }
    }
}