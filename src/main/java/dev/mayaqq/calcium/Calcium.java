package dev.mayaqq.calcium;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Calcium implements ModInitializer {

    public static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger("Calcium");

    @Override
    public void onInitialize() {
        LOGGER.info("Optimizing Minecraft...");
    }
}
