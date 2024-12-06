package org.canghai.xlwsBase.api;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import org.canghai.xlwsBase.XlwsBase;
import org.canghai.xlwsBase.block.AlchemyFurnaceBlock;
import org.canghai.xlwsBase.block.BoxScreenHandler;
import org.canghai.xlwsBase.block.entity.AlchemyFurnaceBlockEntity;

public class Registries {
    public static final ScreenHandlerType<BoxScreenHandler> BOX_SCREEN_HANDLER = Registry.register(net.minecraft.registry.Registries.SCREEN_HANDLER, Identifier.of(XlwsBase.MOD_ID, "alchemy_funace_block"), new ScreenHandlerType<>(BoxScreenHandler::new, FeatureSet.empty()));
}
