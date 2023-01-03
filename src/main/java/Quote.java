import java.io.Serializable;

public class Quote implements Serializable {

    private int id;
    private String content;
    private Author authorId;


    public Quote () {}


    public Quote(int id, String content, Author authorId) {
        this.id = id;
        this.content = content;
        this.authorId = authorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Author authorId) {
        this.authorId = authorId;
    }
}
