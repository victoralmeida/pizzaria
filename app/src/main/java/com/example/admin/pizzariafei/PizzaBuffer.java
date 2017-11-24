package com.example.admin.pizzariafei;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Gustavo Diniz on 24/11/2017.
 */

public class PizzaBuffer {
    JSONArray jsonArray;
    ArrayList<pizza> Pizzas;

    public ArrayList<pizza> getPizzas() {
        Background bd = new Background();
        bd.execute();
        return Pizzas;
    }

    private class Background extends AsyncTask<Void, Void, String> {
        String JSON_URL;
        String JSON_STRING;

        @Override
        protected void onPreExecute() {
            JSON_URL ="http://10.0.2.2/Android/teste.php";
        }

        @Override
        protected String doInBackground(Void... params) {
            try {
                String JSON_DATA= "";
                URL url = new URL(JSON_URL);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream in = httpURLConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                Pizzas = new ArrayList<>();
                while ((JSON_STRING = reader.readLine())!=null) {
                    JSON_DATA += JSON_STRING + "\n";
                }
                return JSON_DATA.toString().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                jsonArray = new JSONArray(JSON_STRING);
                int count = 0;
                String name;
                String tipo;
                String preco;
                while (count < jsonArray.length()){
                    JSONObject jo = jsonArray.getJSONObject(count);
                    name = jo.getString("name");
                    tipo = jo.getString("name");
                    preco = jo.getString("name");
                    pizza c = new pizza(name,tipo,preco);
                    Pizzas.add(c);
                    count ++;
                }

            }catch (JSONException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String result) {

        }
    }
}
