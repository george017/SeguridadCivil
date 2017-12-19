package edu.galileo.seguridadcivil;

import android.app.Application;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.*;

/**
 * Created by root on 19/11/17.
 */

public class API extends Application{

    public static String url1="http://36527545.ngrok.io/api/";

    public  static Usuario BuscarUsuario(int id, Context cont){
        Usuario usuar;
        usuar=new Usuario();
        String url = url1+"Usuario?id="+id;

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        System.out.println("Response: " + response.toString());

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub

                    }
                });

// Access the RequestQueue through your singleton class.
        MySingleton.getInstance(cont).addToRequestQueue(jsObjRequest);
        return usuar;
    }

    public  static Usuario InsertarUsuario(Usuario usuar, Context cont){
        String url = url1+"postUsuario";

        JSONObject params = new JSONObject();


        try{
            params.put("NAME", usuar.name);
            params.put("LASTNAME", usuar.lastname);
            params.put("DUI", usuar.dui);
            params.put("BIRTHDATE", usuar.birthdate);
            params.put("USERNAME", usuar.username);
            params.put("PASSWORD", usuar.password);
            params.put("EMAIL", usuar.email);
            params.put("TYPE", usuar.tipo);
        }
        catch(JSONException e){
            e.printStackTrace();
        }
        JsonObjectRequest jsObjRequest = new JsonObjectRequest

                (Request.Method.POST, url, params, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        System.out.println("Response: " + response.toString());
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub

                    }
                });

// Access the RequestQueue through your singleton class.
        MySingleton.getInstance(cont).addToRequestQueue(jsObjRequest);
        return usuar;
    }

    public  static Event BuscarEvent(int id, Context cont){
        Event evento;
        evento=new Event();
        String url = url1+"Evento?id="+id;

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        System.out.println("Response: " + response.toString());

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub

                    }
                });

// Access the RequestQueue through your singleton class.
        MySingleton.getInstance(cont).addToRequestQueue(jsObjRequest);
        return evento;
    }

    public  static Event InsertarUsuario(Event evento, Context cont){
        String url = url1+"postEvento";

        JSONObject params = new JSONObject();


        try{
            params.put("name", evento.name);
            params.put("address", evento.address);
            params.put("lat", evento.lat);
            params.put("lng", evento.lng);
            params.put("type", evento.type);
            params.put("id_event_type", evento.id_event_type);
            params.put("id_user", evento.id_user);
            params.put("state", evento.state);
        }
        catch(JSONException e){
            e.printStackTrace();
        }
        JsonObjectRequest jsObjRequest = new JsonObjectRequest

                (Request.Method.POST, url, params, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        System.out.println("Response: " + response.toString());
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub

                    }
                });

// Access the RequestQueue through your singleton class.
        MySingleton.getInstance(cont).addToRequestQueue(jsObjRequest);
        return evento;
    }

    public  static EventType BuscarEventType(int id, Context cont){
        EventType evtype;
        evtype=new EventType();
        String url = url1+"EventType?id="+id;

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        System.out.println("Response: " + response.toString());

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub

                    }
                });

// Access the RequestQueue through your singleton class.
        MySingleton.getInstance(cont).addToRequestQueue(jsObjRequest);
        return evtype;
    }


}
