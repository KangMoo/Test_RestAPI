package com.moondeuk;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("mmc_packet_loss")
@Consumes(MediaType.APPLICATION_JSON)
public class controller {

    @Inject
    PacketLoss packetloss = new PacketLoss();


    @GET
    public String showPacketloss() {
        String temp = packetloss._toString();
        return temp;
    }


    @GET
    @Path("/{packetloss}")
    public String getPacketloss(@PathParam("packetloss") String param) {
        try
        {
            Integer.parseInt(param);
            String temp ="Set Packet Loss:"+packetloss.getPacketloss()+" -> ";
            packetloss.setPacketloss(param);
            temp += packetloss.getPacketloss();
            return temp;
        }
        catch (NumberFormatException e)
        {
            return param + " is not a valid integer number. Input Integer Number";
        }
    }



    @POST
    @Path("")
    public String postPacketloss(@FormParam("packetloss") String param){
        System.out.println(param);
        try
        {
            Integer.parseInt(param);
            String temp ="Set Packet Loss:"+packetloss.getPacketloss()+" -> ";
            packetloss.setPacketloss(param);
            temp += packetloss.getPacketloss();
            return temp;
        }
        catch (NumberFormatException e)
        {
            return param + " is not a valid integer number. Input Integer Number";
        }
    }



}
