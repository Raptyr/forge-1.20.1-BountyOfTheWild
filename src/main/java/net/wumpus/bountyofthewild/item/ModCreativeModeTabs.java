package net.wumpus.bountyofthewild.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wumpus.bountyofthewild.BountyOfTheWild;
import net.wumpus.bountyofthewild.block.ModBlocks;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BountyOfTheWild.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PLANTS_TAB = CREATIVE_MODE_TABS.register("plants_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ACORN.get()))
                    .title(Component.translatable("creativetab.plants_tab"))
                    .displayItems((pParameters, pOutput) ->
                    {
                        pOutput.accept(ModItems.ACORN.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> BLOCK_TOOLS_TAB= CREATIVE_MODE_TABS.register("block_tools_tab",
            ()-> CreativeModeTab.builder()
                    .icon(()->new ItemStack(ModBlocks.IRON_FORGE_CORE.get()))
                    .title(Component.translatable("creativetab.block_tools_tab"))
                    .displayItems(((pParameters, pOutput) ->
                    {
                        pOutput.accept(ModBlocks.IRON_FORGE_CORE.get());
                    }))


                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
