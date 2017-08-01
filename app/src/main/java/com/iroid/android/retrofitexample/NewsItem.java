package com.iroid.android.retrofitexample;

/**
 * Created by Jesna on 1/4/2016.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class NewsItem {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("created_date")
    @Expose
    private String createdDate;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("status")
    @Expose
    private String status;

    /**
     * No args constructor for use in serialization
     *
     */
    public NewsItem() {
    }

    /**
     *
     * @param id
     * @param title
     * @param status
     * @param description
     * @param subtitle
     * @param image
     * @param createdDate
     */
    public NewsItem(String id, String title, String subtitle, String image, String createdDate, String description, String status) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
        this.createdDate = createdDate;
        this.description = description;
        this.status = status;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The subtitle
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     *
     * @param subtitle
     * The subtitle
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     *
     * @return
     * The image
     */
    public String getImage() {
        return image;
    }

    /**
     *
     * @param image
     * The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     *
     * @return
     * The createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     *
     * @param createdDate
     * The created_date
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

}

