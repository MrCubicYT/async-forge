package com.axalotl.async.mixin;

import net.minecraft.util.thread.BlockableEventLoop;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.function.BooleanSupplier;

@Mixin(BlockableEventLoop.class)
public interface BlockableEventLoopInvoker {
    @Invoker("managedBlock")
    void invokeManagedBlock(BooleanSupplier condition);
}
