package homeworks.lesson43;

public class Books {
    public int id;
    public String name;
    public String title;

    public Books(int id, String name, String title) {
        this.id = id;
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("Books{id=%d, name='%s', title='%s'}", id, name, title);
    }
}
