package gb.tester.autojava.exam.task1.model;

public class Book extends Item {

    private String title;
    private String publisher;

    public Book(String inventarNumber,
                String title,
                String authorName,
                String authorSurname,
                String publisher) {
        super(inventarNumber, authorName, authorSurname);
        this.title = title;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Книга{")
                .append("Инвентарный номер='").append(getInventarNumber()).append('\'')
                .append(", Название='").append(title).append('\'')
                .append(", Имя автора='").append(getAuthorName()).append('\'')
                .append(", Фамилия автора='").append(getAuthorSurname()).append('\'')
                .append(", Издатель='").append(publisher).append('\'')
                .append('}');
        return sb.toString();
    }
}
