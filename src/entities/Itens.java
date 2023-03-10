package entities;

public class Itens {

    private String name;
    private Double price;
    private Integer numberItens;
    private double totalValue;


    public Itens(String name, Double price, Integer numberItens) {
        this.name = name;
        this.price = price;
        this.numberItens = numberItens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumberItens() {
        return numberItens;
    }

    public void setNumberItens(Integer numberItens) {
        this.numberItens = numberItens;
    }


    @Override
    public String toString() {
         return ""+ System.out.printf(getName() + ", %.2f", getPrice() * getNumberItens());

    }



}
