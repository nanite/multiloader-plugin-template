package com.example.examplemod;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge
{
    public ExampleModForge() {
        ExampleMod.init();
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> () -> ExampleModClient.init());
    }
}
