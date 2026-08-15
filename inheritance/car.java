package inheritance;

public class car extends vehicle {
    public int noofdoors;
    public String transmissiontype;
    car(String name, String model,int tyres, int noofdoors, String transmissiontype){
        super(name,model,tyres);
        this.noofdoors= noofdoors;
        this.transmissiontype=transmissiontype;

    }public void startAC(){
        System.out.println("AC is starting"+name);
    }

}
