package gb.tester.autojava.exam.task1.model;

public class Mail extends Item {

    private String receiverName;
    private String receiverSurname;

    public Mail(String inventarNumber,
                String authorName,
                String authorSurname,
                String receiverName,
                String receiverSurname) {
        super(inventarNumber, authorName, authorSurname);
        this.receiverName = receiverName;
        this.receiverSurname = receiverSurname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Письмо{")
                .append("Инвентарный номер='").append(getInventarNumber()).append('\'')
                .append(", Имя автора='").append(getAuthorName()).append('\'')
                .append(", Фамилия автора='").append(getAuthorSurname()).append('\'')
                .append(", Имя получателя='").append(receiverName).append('\'')
                .append(", Фамилия получателя='").append(receiverSurname).append('\'')
                .append('}');
        return sb.toString();
    }
}
