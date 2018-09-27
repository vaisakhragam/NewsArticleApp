package com.ny.newsarticle.newarticleapp.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MediaHolder {


    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("subtype")
    @Expose


    private String subtype;

    @SerializedName("caption")
    @Expose

    private String caption;

    @SerializedName("copyright")
    @Expose
    private String copyright;

    @SerializedName("approved_for_syndication")
    @Expose

    private int approved_for_syndication;

    @SerializedName("media-metadata")
    @Expose

    private List<MetaDataHolder> media_metadata;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getApproved_for_syndication() {
        return approved_for_syndication;
    }

    public void setApproved_for_syndication(int approved_for_syndication) {
        this.approved_for_syndication = approved_for_syndication;
    }

    public List<MetaDataHolder> getMedia_metadata() {
        return media_metadata;
    }

    public void setMedia_metadata(List<MetaDataHolder> media_metadata) {
        this.media_metadata = media_metadata;
    }
}
