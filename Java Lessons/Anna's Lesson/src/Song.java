import java.time.LocalDateTime;

/*
 * Kevin Huynh
 * CMSC 256 - Data	Structures	And	Object	Oriented	Programming
 * Project 2 - MediaList
 * The purpose is a subclass of DigitalMedia called Song.
 */

public class Song extends DigitalMedia implements Comparable<Song> {
    private String artist;
    private String album;

    public Song(String artist, String album, String name, Long size){
        super(name, size);
        this.artist = artist;
        this.album = album;
    }


    public String getArtist() {
        return this.artist;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setArtist(String artist) {
        if(artist instanceof String) {
            this.artist = artist;
            super.setDateModified(LocalDateTime.now());
        }
        else {
            throw new IllegalArgumentException("Error: Artist name must be a string.");
        }
    }

    public void setAlbum(String album) {
        if(album instanceof String) {
            this.album = album;
            super.setDateModified(LocalDateTime.now());
        }
        else {
            throw new IllegalArgumentException("Error: Album name must be a string.");
        }
    }


    public int compareTo(Song other) {
        String str1 = this.album.toLowerCase();
        String str2 = other.album.toLowerCase();

        if(str1.compareTo(str2) < 0)
            return -1;
        else if(str1.compareTo(str2) > 0)
            return 1;
        else
        {
            str1 = this.getName().toLowerCase();
            str2 = other.getName().toLowerCase();

            if(str1.compareTo(str2) < 0)
                return -1;
            else if(str1.compareTo(str2) > 0)
                return 1;
            else
                        return 0;
                }

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
        if (other instanceof Song) {
            Song otherSong = (Song) other;

            if (this.getName() != null && otherSong.getName() != null && this.getName().equals(otherSong.getName()) && this.getSize() != null && otherSong.getSize() != null && this.getSize().equals(otherSong.getSize()) && this.artist != null && otherSong.artist != null && this.artist.equals(otherSong.artist) && this.album != null && otherSong.album != null && this.album.equals(otherSong.album)) {
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
        public String toString(){
            return "Title: " + getName() + "\n" + "Artist: " + getArtist() + "\n" + "Album: " + getAlbum();
        }

}
