package gb.tester.autojava.exam.task1.model;

public class Microfilm extends Item{

    private String title;
    private int length;

    public Microfilm(String inventarNumber,
                     String title,
                     String authorName,
                     String authorSurname,
                     int length) {
        super(inventarNumber, authorName, authorSurname);
        this.title = title;
        this.length = length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Микрофильм{")
                .append("Инвентарный номер='").append(getInventarNumber()).append('\'')
                .append(", Название='").append(title).append('\'')
                .append(", Имя автора='").append(getAuthorName()).append('\'')
                .append(", Фамилия автора='").append(getAuthorSurname()).append('\'')
                .append(", Продолжительность='").append(title).append('\'')
                .append('}');
        return sb.toString();
    }
}
