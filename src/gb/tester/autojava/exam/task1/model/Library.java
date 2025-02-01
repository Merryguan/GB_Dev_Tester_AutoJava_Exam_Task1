package gb.tester.autojava.exam.task1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library<T extends ReestrItem<T>> {

    private final List<T> reestr;

    public Library() {
        this.reestr = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Реестр{").append("\n");
        for (T obj: reestr) {
            sb.append(obj).append("\n");
        }
        sb.append('}');
        return  sb.toString();
    }

    public void addItem(T item) {
        reestr.add(item);
    }

    public T searchByInventarNumber(String inventarNumber) {
        for (T item: reestr) {
            if (Objects.equals(item.getInventarNumber(), inventarNumber)) {
                return item;
            }
        }
        return null;
    }

    public T searchByAuthorName(String authorName) {
        for (T item: reestr) {
            if (Objects.equals(item.getAuthorName(), authorName)) {
                return item;
            }
        }
        return null;
    }

    public T searchByAuthorSurname(String authorSurname) {
        for (T item: reestr) {
            if (Objects.equals(item.getAuthorSurname(), authorSurname)) {
                return item;
            }
        }
        return null;
    }

    public T searchByAuthor(String authorName, String authorSurname) {
        for (T item: reestr) {
            if (Objects.equals(item.getAuthorName(), authorName) &&
                    Objects.equals(item.getAuthorSurname(), authorSurname)) {
                return item;
            }
        }
        return null;
    }

}
