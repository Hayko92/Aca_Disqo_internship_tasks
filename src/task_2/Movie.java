package task_2;

public class Movie implements Watchable {
    private String title;
    private int rate;

    public Movie(String title, int rate) {
        this.title = title;
        this.rate = rate;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
