package net.lawye.test;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class testmod implements ModInitializer{

    public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(ItemGroup.TRANSPORTATION));

    @Override
    public void onInitialize() {
        
       Registry.register(Registry.ITEM, new Identifier("testmod","test_item"), FABRIC_ITEM);

    }
    
}