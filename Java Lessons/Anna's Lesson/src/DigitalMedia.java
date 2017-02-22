/*
 * Kevin Huynh
 * CMSC 256 - Data	Structures	And	Object	Oriented	Programming
 * Project 1 - DigitalMedia
 * The purpose is to set/get/compare/print out digital media.
 */

import java.time.LocalDateTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.lang.String;

public class DigitalMedia {
    private String name;
    private Long size;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;


    public DigitalMedia(String name, Long size) {
        this.name = name;
        this.size = size;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    /*
     * Accessor (getter) method for String name
     */
    public String getName() {
        return this.name;
    }

    /*
     * Mutator method (setter) for String name
     */
    public void setName(String name) {
        if (name.contains(".") && name instanceof String) {
            if (name.length() - name.replace(".", "").length() == 1) {
                this.name = name;
                setDateModified(LocalDateTime.now());
            } else {
                throw new IllegalArgumentException("Error: name should contain one . or name must be a string");
            }
        }
    }

    /*
     * Accessor (getter) method for Long size
     */
    public Long getSize() {
        return this.size;
    }

    /*
     * Mutator method (setter) for Long size
     */
    public void setSize(Long size) {
        if(size >= 0 && size instanceof Long) {
            this.size = size;
            setDateModified(LocalDateTime.now());
        }
        else {
                throw new IllegalArgumentException("Error: Size can not be a negative number or size must be a long.");
            }
    }

    /*
     * Accessor (getter) method for LocalDateTime dateCreated
     */
    public LocalDateTime getDateCreated() {
        return this.dateCreated;
    }

    /*
     * Accessor (getter) method for LocalDateTime dateModified
     */
    public LocalDateTime getDateModified() {
        return this.dateModified;
    }

    /*
     * Mutator method (setter) for LocalDateTime dateModified
     */
    public void setDateModified(LocalDateTime dateModified) {
        if(dateCreated.isBefore(dateModified) && dateModified instanceof LocalDateTime) {
            this.dateModified = dateModified;
        }
            else {
            throw new IllegalArgumentException("Error: Date created must be before date modified or dateModified must be of type LocalDateTime.");
        }
    }

    private String formatLocalDate(LocalDateTime dateToBeFormated) {
        Date tempDate = Date.from(dateToBeFormated.atZone(ZoneId.systemDefault()).toInstant());
        DateFormat targetDateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        String formattedDate = targetDateFormat.format(tempDate);
        return formattedDate;

    }

    /*
    * equals method
    */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (other instanceof DigitalMedia) {
            DigitalMedia otherMedia = (DigitalMedia) other;
            if (this.name != null && otherMedia.name != null && this.name.equals(otherMedia.name) && this.size != null && otherMedia.size != null && this.size.equals(otherMedia.size) && this.dateCreated != null && otherMedia.dateCreated != null && this.dateCreated.equals(otherMedia.getDateCreated()) && this.dateModified != null && otherMedia.dateModified != null && this.dateModified.equals(otherMedia.getDateModified())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /*
     * toString method
     */
    public String toString() {
        return "Name: " + this.name + "\n" + "Size: " + this.size + " KB" + "\n" + "Created: " + formatLocalDate(this.dateCreated) + "\n" + "Modified: " + formatLocalDate(this.dateModified) + "\n";
    }
}