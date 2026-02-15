package me.terkonridge.oritechsteeltools.fabric;

import net.fabricmc.api.ModInitializer;
import me.terkonridge.oritechsteeltools.OritechSteelTools;

public final class OritechSteelToolsFabric implements ModInitializer {

    @Override

    public void onInitialize() {
        OritechSteelTools.init();
    }
} 