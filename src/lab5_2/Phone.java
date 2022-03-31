package src.lab5_2;

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

    public void setAddress(String address) throws Exception {
        if (address.isEmpty()) throw new Exception("Некорректная строка");
        this.address = address;
    }

    public void setCard_number(long card_number) throws Exception {
        int length = (int)(Math.log10(card_number)+1);
        if (length != 16) throw new Exception("Некорректный формат номера карты");
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

    public void setIntercity_calls(int intercity_calls) throws Exception {
        if (intercity_calls < 0) throw new Exception("Длительность звонков не может быть отрицательной");
        this.intercity_calls = intercity_calls;
    }

    public void setIntracity_calls(int intracity_calls) throws Exception {
        if (intracity_calls < 0) throw new Exception("Длительность звонков не может быть отрицательной");
        this.intracity_calls = intracity_calls;
    }

    public void setLast_name(String last_name) throws Exception {
        if (last_name.isEmpty()) throw new Exception("Некорректная строка");
        this.last_name = last_name;
    }

    public void setName(String name) throws Exception {
        if (name.isEmpty()) throw new Exception("Некорректная строка");
        this.name = name;
    }

    public void setPatronymic(String patronymic) throws Exception {
        if (patronymic.isEmpty()) throw new Exception("Некорректная строка");
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
