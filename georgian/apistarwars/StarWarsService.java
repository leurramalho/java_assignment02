package ca.georgian.apistarwars;
//Imports
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class StarWarsService {
    // Get data from public API, without authentication.
    public List<Person> toFindPerson(String query) throws Exception {
        String apiUrl = "https://swapi.dev/api/people/?search=" + query;
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        InputStreamReader reader = new InputStreamReader(conn.getInputStream());
        JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
        String results = jsonObject.get("results").toString();
        return new Gson().fromJson(results, new TypeToken<List<Person>>() {}.getType());
    }
}
