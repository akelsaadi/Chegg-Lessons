import java.time.LocalDateTime;

/*
 * Kevin Huynh
 * CMSC 256 - Data	Structures	And	Object	Oriented	Programming
 * Project 2 - MediaList
 * The purpose is a subclass of DigitalMedia called Image.
 */

public class Image extends DigitalMedia implements Comparable<Image> {
    private int width;
    private int height;

    public Image(String name, Long size, int width, int height) {
        super(name, size);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        if (width >= 0) {
            this.width = width;
            super.setDateModified(LocalDateTime.now());
            } else {
                throw new IllegalArgumentException("Error: width can not be negative .");
            }
    }

    public void setHeight(int height) {
        if (height >= 0) {
            this.height = height;
            super.setDateModified(LocalDateTime.now());
        } else {
            throw new IllegalArgumentException("Error: height can not be negative .");
        }
    }


    public int compareTo(Image other) {
        String str1 = this.getName().toLowerCase();
        String str2 = other.getName().toLowerCase();

        if(str1.compareTo(str2) < 0)
            return -1;
        else if(str1.compareTo(str2) > 0)
            return 1;
        else
                    return 0;
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
        if (other instanceof Image) {
            Image otherImage = (Image) other;

            if (this.getName() != null && otherImage.getName() != null && this.getName().equals(otherImage.getName()) && this.getSize() != null && otherImage.getSize() != null && this.getSize().equals(otherImage.getSize()) && this.width == otherImage.width && this.height == otherImage.height) {
                return true;
            }
            return false;
        }
        return false;
    }

    /*
     * toString method
     */
    @Override
    public String toString() {
            return "Title: " + this.getName() + "\n" + "Width: " + this.width + "\n" + "Height: " + this.height;
    }

}
