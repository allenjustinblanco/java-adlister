public class Ad {
    // the columns in the ads table
    private String title;
    private String description;
    private long id;
    private long userId;
    //object constructor
    public Ad(long id, long userId, String title, String description){
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
    }

    //getters
    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    //setters
    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
