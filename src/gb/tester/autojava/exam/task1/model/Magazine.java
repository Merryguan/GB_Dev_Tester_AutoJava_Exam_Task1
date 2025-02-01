package gb.tester.autojava.exam.task1.model;

public class Magazine extends Item {

    private String title;
    private String publisher;

    public Magazine(String inventarNumber,
                    String title,
                    String publisher) {
        super(inventarNumber, null, null);
        this.title = title;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Журнал{")
                .append("Инвентарный номер='").append(getInventarNumber()).append('\'')
                .append(", Название='").append(title).append('\'')
                .append(", Издатель='").append(publisher).append('\'')
                .append('}');
        return sb.toString();
    }
}
