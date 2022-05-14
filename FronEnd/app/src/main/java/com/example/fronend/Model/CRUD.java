package com.example.fronend.Model;

public class CRUD Request<JSONObject>{

    private void ObtenerCategoria() {
        String url = "ocalhost:8080/Categoria";
        StringRequest postResquest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String title = jsonObject.getString("Categoria");
                    txtTitle.setText(title);
                    txtBody.setText(jsonObject.getString("body"));

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }}, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Error", error.getMessage());
                    }
                });
        Volley.newRequestQueue(this).add(postResquest);
    }



    }
