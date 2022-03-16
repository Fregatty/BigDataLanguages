package src.lab4_2;

public class Neurosurgeon extends Surgeon{

    @Override
    public void doTreatment(){
        System.out.println("Удален мозг");
    }

    public void doScan(){
        System.out.println("Сделана энцефалограмма");
    }
}
