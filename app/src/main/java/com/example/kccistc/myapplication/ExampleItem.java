package com.example.kccistc.myapplication;

public class ExampleItem {
    private String mImageUrl;
    private String mCreator;
    private String mMovieUrl;
 
    public ExampleItem(String imageUrl, String creator, String movieUrl) {
        mImageUrl = imageUrl;
        mCreator = creator;
        mMovieUrl = movieUrl;
    }
 
    public String getImageUrl() {
        return mImageUrl;
    }
 
    public String getCreator() {
        return mCreator;
    }

    public String getMovieUrl() { return mMovieUrl; }
 

}