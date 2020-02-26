package com.moondeuk;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.ejb.Stateless;
import javax.validation.constraints.NotNull;

@Stateless
public class PacketLoss {

    @NotNull
    private String packetloss;

    public PacketLoss(){this.packetloss = "0";}
    public PacketLoss(String packetloss){this.packetloss = packetloss;}

    @Getter
    public String getPacketloss(){
        return this.packetloss;
    }


    @Setter
    public void setPacketloss(String packetloss){
        this.packetloss = packetloss;
    }

    public String _toString(){
        String ret="{ ";
        ret += "'packet_loss_set' : '";
        ret += this.packetloss + "'";
        ret+=" }";
        return ret;
    }
}
