package gb.tester.autojava.exam.task1.model;

public abstract class Item implements ReestrItem<Item> {

    private final String inventarNumber;
    private final String authorName;
    private final String authorSurname;

    public Item(String inventarNumber,
                String authorName,
                String authorSurname) {
        this.inventarNumber = inventarNumber;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getInventarNumber() {
        return inventarNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Item{")
                .append("Инвентарный номер='").append(inventarNumber).append('\'')
                .append(", Имя автора='").append(authorName).append('\'')
                .append(", Фамилия автора='").append(authorSurname).append('\'')
                .append('}');
        return sb.toString();
    }
}
