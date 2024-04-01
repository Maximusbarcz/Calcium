package dev.mayaqq.calcium.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @ModifyConstant(method = "runTick", constant = @Constant(stringValue = "%d fps T: %s%s%s%s B: %d%s"))
    private String fixFps(String constant) {
        return "%d00 fps T: %s%s%s%s B: %d%s";
    }
}
