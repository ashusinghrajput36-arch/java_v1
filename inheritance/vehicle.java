package inheritance;

public class vehicle {
    public  String name;
    public String model;
    public int tyres;

    //default constructor
     public     vehicle(){
        this.name ="";
        this.model="";
        this.tyres=-1;

    }
    //parameterized constructor
    vehicle(String name, String model, int tyres){
        this.name =name;
        this.model=model;
        this.tyres=tyres;

    }
    void startengine(){
        System.out.printf("the engine is starting ",name,model);

    }
    void stopengine(){
        System.out.printf("the engine is stoping",name,model);
    }
}
