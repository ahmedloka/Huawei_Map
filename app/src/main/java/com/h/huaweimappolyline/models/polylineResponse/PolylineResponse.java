package com.h.huaweimappolyline.models.polylineResponse;

import java.util.List;

public class PolylineResponse {
    private List<Routes> routes;

    private String returnCode;

    private String returnDesc;

    public List<Routes> getRoutes ()
    {
        return routes;
    }

    public void setRoutes (List<Routes> routes)
    {
        this.routes = routes;
    }

    public String getReturnCode ()
    {
        return returnCode;
    }

    public void setReturnCode (String returnCode)
    {
        this.returnCode = returnCode;
    }

    public String getReturnDesc ()
    {
        return returnDesc;
    }

    public void setReturnDesc (String returnDesc)
    {
        this.returnDesc = returnDesc;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [routes = "+routes+", returnCode = "+returnCode+", returnDesc = "+returnDesc+"]";
    }
}
