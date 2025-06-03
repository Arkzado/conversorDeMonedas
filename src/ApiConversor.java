import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConversor {
    private String acronimoDivisa;
    private String url = "https://v6.exchangerate-api.com/v6/873ad26301dcbb2dcbb8c3c1/latest/";
    private RespuestaApi respuestaApi;
    private String acronimoDestino;
    private String json;

    public ApiConversor(String acronimoDivisa) throws IOException, InterruptedException {
        this.acronimoDivisa = acronimoDivisa;
        String urlCompleta = this.url + acronimoDivisa;
        this.json = this.traerRespuesta(urlCompleta);
        this.respuestaApi = this.deserializar(this.json);
    }

    private String traerRespuesta(String url) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    private RespuestaApi deserializar(String json) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(json, RespuestaApi.class);
    }

    public double getTasaCambio(String acronimoDestino) {
        return this.respuestaApi.getConversion_rates().getOrDefault(acronimoDestino, 0.0);
    }


    public Double convertir(String acronimoDestino) {
        Gson gson = new GsonBuilder().create();
        RespuestaApi respuesta = gson.fromJson(this.json, RespuestaApi.class);

        System.out.println("Valor: $1 (" + respuesta.getBase_code() + ")");
        System.out.println("Equivalencia: $" + Math.round(respuesta.getConversion_rates().get(acronimoDestino)) + "(" + acronimoDestino + ")");
        return respuesta.getConversion_rates().get(acronimoDestino);
    }
}
