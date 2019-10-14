package com.company;

public class ElementoTablaSimbolos {
    public String ER;
    public String ComponenteLexico;
    public String Valor;

    public ElementoTablaSimbolos(String ER, String ComponenteLexico, String Valor) {
        this.ER = ER;
        this.ComponenteLexico = ComponenteLexico;
        this.Valor = Valor;
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof ElementoTablaSimbolos))
            return false;
        if (obj == this)
            return true;

        //if(((ElementoTablaSimbolos) obj).ComponenteLexico.equals("int") ||
                //((ElementoTablaSimbolos) obj).ComponenteLexico.equals("double") ){
            //System.out.println(((ElementoTablaSimbolos) obj).ComponenteLexico+ " sd");
            //return false;
        //}
        if(this.ComponenteLexico.equals("int") ||
        this.ComponenteLexico.equals("double") ){
            if(this.ER.equals("int") ||
                    this.ER.equals("double") ) {
                return true;
            }
            else{
                return false;
            }
            }

        return this.ER.equals(((ElementoTablaSimbolos) obj).ER);
    }

    public int hashCode(){
        return ER.hashCode();//for simplicity reason
    }
}
