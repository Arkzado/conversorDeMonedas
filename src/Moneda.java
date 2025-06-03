import com.google.gson.annotations.SerializedName;

import java.io.IOException;

public class Moneda {
    @SerializedName("base_code")
   private String acronimoDivisa;
   private double precioDivisa;
   private  String divisaDestino;

    public void setDivisaDestino(String divisaDestino) throws IOException, InterruptedException {
        this.divisaDestino = divisaDestino;
        this.llamarApi(this.acronimoDivisa);
    }

    public Moneda(String acronimoDivisa){
        this.acronimoDivisa = acronimoDivisa;
    }

    public void setPrecioDivisa(double precioDivisa) {
        this.precioDivisa = precioDivisa;
    }


    public String getAcronimoDivisa() {
        return acronimoDivisa;
    }

    private void llamarApi(String acronimoBase) throws IOException, InterruptedException {
        ApiConversor api = new ApiConversor(acronimoBase);
        double precioConvertido = api.convertir(divisaDestino);
        System.out.println("$" + this.precioDivisa + "(" + this.acronimoDivisa + ") = $" + Math.round(precioConvertido * precioDivisa) + "(" + divisaDestino + ")");
    }
}
