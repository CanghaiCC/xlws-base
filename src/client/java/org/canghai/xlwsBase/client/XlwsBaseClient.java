package org.canghai.xlwsBase.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import org.canghai.xlwsBase.api.Registries;
import org.canghai.xlwsBase.client.ui.BoxScreen;

@Environment(EnvType.CLIENT)
public class XlwsBaseClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HandledScreens.register(Registries.BOX_SCREEN_HANDLER, BoxScreen::new);
    }
}
