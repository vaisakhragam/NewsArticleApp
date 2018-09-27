package com.ny.newsarticle.newarticleapp.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResultHolder {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("adx_keywords")
    @Expose
    private String adx_keywords;
    @SerializedName("column")
    @Expose
    private String column;
    @SerializedName("section")
    @Expose
    private String section;
    @SerializedName("byline")
    @Expose
    private String byline;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("abstract")
    @Expose
    private String abstracts;
    @SerializedName("published_date")
    @Expose
    private String published_date;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("asset_id")
    @Expose
    private String asset_id;
    @SerializedName("views")
    @Expose
    private String views;
    @SerializedName("des_facet")
    @Expose
    private Object des_facet;
    @SerializedName("org_facet")
    @Expose
    private Object org_facet;
    @SerializedName("per_facet")
    @Expose
    private Object per_facet;
    @SerializedName("geo_facet")
    @Expose
    private Object geo_facet;
    @SerializedName("media")
    @Expose
    private List<MediaHolder> media;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAdx_keywords() {
        return adx_keywords;
    }

    public void setAdx_keywords(String adx_keywords) {
        this.adx_keywords = adx_keywords;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAsset_id() {
        return asset_id;
    }

    public void setAsset_id(String asset_id) {
        this.asset_id = asset_id;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public Object getDes_facet() {
        return des_facet;
    }

    public void setDes_facet(Object des_facet) {
        this.des_facet = des_facet;
    }

    public void setOrg_facet(Object org_facet) {
        this.org_facet = org_facet;
    }

    public Object getOrg_facet() {
        return org_facet;
    }

    public Object getGeo_facet() {
        return geo_facet;
    }

    public void setGeo_facet(Object geo_facet) {
        this.geo_facet = geo_facet;
    }

    public List<MediaHolder> getMedia() {
        return media;
    }

    public void setMedia(List<MediaHolder> media) {
        this.media = media;
    }
}
