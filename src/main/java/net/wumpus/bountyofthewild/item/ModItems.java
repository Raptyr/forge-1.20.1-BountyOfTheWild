package net.wumpus.bountyofthewild.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wumpus.bountyofthewild.BountyOfTheWild;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BountyOfTheWild.MOD_ID);

    public static final RegistryObject<Item> ACORN = ITEMS.register("acorn",() -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
