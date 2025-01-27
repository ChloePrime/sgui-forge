package eu.pb4.sgui.chloe_patch;

import net.minecraft.network.packet.Packet;

public interface ServerCommonNetworkHandlerPatch {
    void sendPacket(Packet<?> arg);
}
