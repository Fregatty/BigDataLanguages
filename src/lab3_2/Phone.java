package src.lab3_2;

public class Phone {
    int id;
    String last_name, name, patronymic, address;
    long card_number;
    double debit, credit;
    int intercity_calls, intracity_calls;

    public int getId() {
        return id;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public long getCard_number() {
        return card_number;
    }

    public double getDebit() {
        return debit;
    }

    public double getCredit() {
        return credit;
    }

    public int getIntercity_calls() {
        return intercity_calls;
    }

    public int getIntracity_calls() {
        return intracity_calls;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCard_number(long card_number) {
        this.card_number = card_number;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIntercity_calls(int intercity_calls) {
        this.intercity_calls = intercity_calls;
    }

    public void setIntracity_calls(int intracity_calls) {
        this.intracity_calls = intracity_calls;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", last_name='" + last_name + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", card_number=" + card_number +
                ", debit=" + debit +
                ", credit=" + credit +
                ", intercity_calls=" + intercity_calls +
                ", intracity_calls=" + intracity_calls +
                '}';
    }
}
