/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author Sami
 */
public class Evenement {

    private int id;
    private String type;
    private String description;
    private Date date;
    private String path_img;
    private Club club;

    public Evenement() {
    }

    public Evenement(int id, String type, String description, Date date, String path_img, Club club) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.date = date;
        this.path_img = path_img;
        this.club = club;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPath_img() {
        return path_img;
    }

    public void setPath_img(String path_img) {
        this.path_img = path_img;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Evenement{" + "id=" + id
                + ", type=" + type
                + ", description=" + description
                + ", date=" + date
                + ", path_img=" + path_img
                + ", club=" + club + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Evenement) {
            final Evenement other = (Evenement) obj;
            if (this.id == other.id) {
                return true;
            }
        }

        return false;

    }
}
