package homeworks.lesson43;

import java.util.Objects;

public class Books {
    public int id;
    public String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return id == books.id && Objects.equals(name, books.name) && Objects.equals(title, books.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, title);
    }

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
