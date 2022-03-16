package src.lab4_2;

public class Surgeon implements Physician {
    String area = "Surgery";

    @Override
    public void doTreatment(){
        System.out.println("Вправлено плечо");
    }
}
