public class Song {
    private String title;
    private String artist;
    private String country;
    private int year;

    public Song() {}
    public Song(int year,String country,String artist,String title) {
        this.title = title;
        this.artist = artist;
        this.country = country;
        this.year = year;
    }
    public void show() {
        System.out.printf("%d년 %s에서 %s가 부른 %s",year,country,artist,title);
    }
}
