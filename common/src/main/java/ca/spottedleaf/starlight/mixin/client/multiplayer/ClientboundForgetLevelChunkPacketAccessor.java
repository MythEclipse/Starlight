package ca.spottedleaf.starlight.mixin.client.multiplayer;

import net.minecraft.network.protocol.game.ClientboundForgetLevelChunkPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ClientboundForgetLevelChunkPacket.class)
public interface ClientboundForgetLevelChunkPacketAccessor {
    @Accessor("x")
    int getX();

    @Accessor("z")
    int getZ();
}
