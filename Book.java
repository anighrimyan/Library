public class Book {
    private String title;
    private String auther;
    public Book(String title, String auther) {
        setTitle(title);
        setAuther(auther);
    }
    private void setTitle(String title) {
        if (title != null) {
            this.title = title;
        } else {
            throw new IllegalStateException("Invalid value for book's title.");
        }
    }
    private void setAuther(String auther) {
        if (auther != null) {
            this.auther = auther;
        } else {
            throw new IllegalStateException("Invalid value for auther's name.");
        }
    }
}
