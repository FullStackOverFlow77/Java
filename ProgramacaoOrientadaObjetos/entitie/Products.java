package ProgramacaoOrientadaObjetos.entitie;

public class Products {
    public String name ; 
    public double price ; 
    public double quantity ; 

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;

    }
}

