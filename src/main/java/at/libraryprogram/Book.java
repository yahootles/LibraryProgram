/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.libraryprogram;

import java.io.Serializable;
import javax.swing.ImageIcon;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author tiein
 */
public class Book implements Serializable{
    String title;
    String author;
    LocalDate dateReleased;
    LocalDate dateAdded;
    String description;
    double rating;
    String isbn;
    ImageIcon cover;
    
    Book(String t, String a, LocalDate dr, LocalDate da, String d, double r, String i){
        title = t;
        author = a;
        dateReleased = dr;
        dateAdded = da;
        description = d;
        rating = r;
        isbn = i;
//        cover = getResource.
    }
    
    Book(String t, String a, LocalDate dr, LocalDate da, String d, double r, String i, ImageIcon im){
        title = t;
        author = a;
        dateReleased = dr;
        dateAdded = da;
        description = d;
        rating = r;
        isbn = i;
        cover = im;
    }
    
    public String getVar(int var) /*throws NoSuchFieldException*/{
        switch(var){
            case 0:
                return title;
            case 1:
                return author;
            case 2:
                return dateReleased.toString();
            case 3:
                return dateAdded.toString();
            case 4:
                return String.valueOf(10-rating);
//            default:
//                throw new NoSuchFieldException();
        }
        return "";
    }
    
    public String getTitle(){
        return title;
    }
    
    public double getRating(){
        return rating;
    }
    
    public void setImage(ImageIcon im){
        cover = im;
    }
    
    public Date getRDate(){
        return Date.from(dateReleased.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
    }
    
    public String getDescription(){
        return description;
    }
    
    public ImageIcon getImage(){
        return cover;
    }
    
    public String getISBN(){
        return isbn;
    }
}
