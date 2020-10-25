package sk.jaroslavbeno.springlearn2code.services.impl;

public class PrintService {
    private String data;

    public void print(){
        System.out.println(data + " reload 22");
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
