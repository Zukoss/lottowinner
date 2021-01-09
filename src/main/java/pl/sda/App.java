package pl.sda;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import pl.sda.model.lotto.Games;
import pl.sda.model.lotto.Lotto;
import pl.sda.model.lotto.Mini;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException, InterruptedException{
        // http://serwis.mobilotto.pl/mapi_v7/index.php?json=getGames

        Gson gson = new Gson();
        OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("http://serwis.mobilotto.pl/mapi_v7/index.php?json=getGames")
                    .build();

             Response response = client.newCall(request).execute();

             String stringresposne = response.body().string();
             Games dataFromBackend =  gson.fromJson(stringresposne, Games.class);

             System.out.println();
             System.out.println(dataFromBackend);
             System.out.println();

             System.out.println(dataFromBackend.getLotto());
             System.out.println(dataFromBackend.getMini());

            }
        }