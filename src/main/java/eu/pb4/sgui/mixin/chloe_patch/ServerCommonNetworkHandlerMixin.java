package eu.pb4.sgui.mixin.chloe_patch;

import eu.pb4.sgui.chloe_patch.ServerCommonNetworkHandlerPatch;
import net.minecraft.network.packet.Packet;
import net.minecraft.server.network.ServerCommonNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ServerCommonNetworkHandler.class)
public abstract class ServerCommonNetworkHandlerMixin implements ServerCommonNetworkHandlerPatch {
    @Override
    @SuppressWarnings("AddedMixinMembersNamePattern")
    public void sendPacket(Packet<?> arg) {
        send(arg);
    }

    @Shadow public abstract void send(Packet<?> arg);
}
