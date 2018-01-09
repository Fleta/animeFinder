package com.lagami_desktop.animefinder;

import android.net.Uri;

import java.io.Serializable;

/**
 * Created by Lagami-Desktop on 2017-04-29.
 */

public class ResponseObject {

    private String id, title, synopsis, subtitle, source, avgscore;
    private Uri cover_uri, banner_uri;
    private String[] genre;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String sysnopsis) {
        this.synopsis = sysnopsis;
    }


    public Uri getCover_uri() {
        return cover_uri;
    }

    public void setCover_uri(Uri cover_uri) {
        this.cover_uri = cover_uri;
    }

    public Uri getBanner_uri() { return banner_uri; }

    public void setBanner_uri(Uri banner_uri) { this.banner_uri = banner_uri; }

    public void setMisc(String subtitle, String source, String avgscore){
        this.subtitle = subtitle;
        this.source = source;
        this.avgscore = avgscore;
    }

    public String getSubtitle() { return subtitle; }

    public String getSource() { return source; }

    public String getAvgscore() { return avgscore; }

}
