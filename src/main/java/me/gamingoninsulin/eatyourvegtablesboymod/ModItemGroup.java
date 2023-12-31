package me.gamingoninsulin.eatyourvegtablesboymod;

import me.gamingoninsulin.eatyourvegtablesboymod.blocks.ModBlocks;
import me.gamingoninsulin.eatyourvegtablesboymod.items.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static me.gamingoninsulin.eatyourvegtablesboymod.Reference.*;


public class ModItemGroup {

    // ##################################################
    public static final ItemGroup FOOD_AND_STUFFS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "food_and_stuffs"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eyvb.food_and_stuffs"))
                    .icon(() -> new ItemStack(ModItems.CAULIFLOWER)).entries((displayContext, entries) -> {
                        // ##################################################

                        // Cauliflower Item & Tree/Crop
                        entries.add(ModItems.CAULIFLOWER_SEEDS);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.COOKED_CAULIFLOWER);

                        // Cauliflower Decorations
                        entries.add(ModBlocks.CAULIFLOWER_BLOCK);
                        entries.add(ModBlocks.CAULIFLOWER_STAIRS);
                        entries.add(ModBlocks.CAULIFLOWER_SLAB);
                        entries.add(ModBlocks.CAULIFLOWER_WALL);
                        entries.add(ModBlocks.CAULIFLOWER_FENCE);
                        entries.add(ModBlocks.CAULIFLOWER_FENCE_GATE);
                        entries.add(ModBlocks.CAULIFLOWER_PRESSURE_PLATE);
                        entries.add(ModBlocks.CAULIFLOWER_BUTTON);


                        // ##################################################

                        // Cucumber Item & Tree/Crop
                        entries.add(ModItems.CUCUMBER_SEEDS);
                        entries.add(ModItems.CUCUMBER);
                        entries.add(ModItems.CUT_CUCUMBER);

                        // Cucumber Decorations
                        entries.add(ModBlocks.CUCUMBER_BLOCK);
                        entries.add(ModBlocks.CUCUMBER_STAIRS);
                        entries.add(ModBlocks.CUCUMBER_SLAB);
                        entries.add(ModBlocks.CUCUMBER_WALL);
                        entries.add(ModBlocks.CUCUMBER_FENCE);
                        entries.add(ModBlocks.CUCUMBER_FENCE_GATE);
                        entries.add(ModBlocks.CUCUMBER_PRESSURE_PLATE);
                        entries.add(ModBlocks.CUCUMBER_BUTTON);

                        // ##################################################

                        // Avocado Item & Tree/Crop
                        entries.add(ModItems.AVOCADO);

                        // Avocado Decorations
                        entries.add(ModBlocks.AVOCADO_BLOCK);
                        entries.add(ModBlocks.AVOCADO_STAIRS);
                        entries.add(ModBlocks.AVOCADO_SLAB);
                        entries.add(ModBlocks.AVOCADO_WALL);
                        entries.add(ModBlocks.AVOCADO_FENCE);
                        entries.add(ModBlocks.AVOCADO_FENCE_GATE);
                        entries.add(ModBlocks.AVOCADO_PRESSURE_PLATE);
                        entries.add(ModBlocks.AVOCADO_BUTTON);


                        // ##################################################

                        // Eggplant Item & Tree/Crop
                        entries.add(ModItems.EGGPLANT_SEEDS);
                        entries.add(ModItems.EGGPLANT);

                        // Eggplant Decorations
                        entries.add(ModBlocks.EGGPLANT_BLOCK);
                        entries.add(ModBlocks.EGGPLANT_STAIRS);
                        entries.add(ModBlocks.EGGPLANT_SLAB);
                        entries.add(ModBlocks.EGGPLANT_WALL);
                        entries.add(ModBlocks.EGGPLANT_FENCE);
                        entries.add(ModBlocks.EGGPLANT_FENCE_GATE);
                        entries.add(ModBlocks.EGGPLANT_PRESSURE_PLATE);
                        entries.add(ModBlocks.EGGPLANT_BUTTON);


                        // ##################################################

                        // Corn Item & Tree/Crop
                        entries.add(ModItems.CORN);

                        // Corn Decorations
                        entries.add(ModBlocks.CORN_BLOCK);
                        entries.add(ModBlocks.CORN_STAIRS);
                        entries.add(ModBlocks.CORN_SLAB);
                        entries.add(ModBlocks.CORN_WALL);
                        entries.add(ModBlocks.CORN_FENCE);
                        entries.add(ModBlocks.CORN_FENCE_GATE);
                        entries.add(ModBlocks.CORN_PRESSURE_PLATE);
                        entries.add(ModBlocks.CORN_BUTTON);



                        // ##################################################

                        // Sea Pickle Item & Tree/Crop
                        entries.add(ModItems.SEA_PICKLE);

                        entries.add(ModBlocks.SEA_PICKLE_BLOCK);
                        entries.add(ModBlocks.SEA_PICKLE_STAIRS);
                        entries.add(ModBlocks.SEA_PICKLE_SLAB);
                        entries.add(ModBlocks.SEA_PICKLE_WALL);
                        entries.add(ModBlocks.SEA_PICKLE_FENCE);
                        entries.add(ModBlocks.SEA_PICKLE_FENCE_GATE);
                        entries.add(ModBlocks.SEA_PICKLE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SEA_PICKLE_BUTTON);



                        // ##################################################
                        // RICE
                        entries.add(ModItems.RICE_SEEDS);
                        entries.add(ModItems.RICE);

                        // ##################################################
                        // TREES

                        // pine
                        entries.add(ModBlocks.PINE_LOG);
                        entries.add(ModBlocks.PINE_WOOD);
                        entries.add(ModBlocks.STRIPPED_PINE_LOG);
                        entries.add(ModBlocks.STRIPPED_PINE_WOOD);
                        entries.add(ModBlocks.PINE_PLANKS_BLOCK);
                        entries.add(ModBlocks.PINE_LEAVES_BLOCK);
                        entries.add(ModBlocks.PINE_SAPLING);

                        entries.add(ModBlocks.PINE_PLANKS_STAIRS);
                        entries.add(ModBlocks.PINE_PLANKS_SLAB);
                        entries.add(ModBlocks.PINE_PLANKS_BUTTON);
                        entries.add(ModBlocks.PINE_PLANKS_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINE_PLANKS_FENCE);
                        entries.add(ModBlocks.PINE_PLANKS_FENCE_GATE);
                        entries.add(ModBlocks.PINE_PLANKS_WALL);

                        entries.add(ModBlocks.PINE_LEAVES_WALL);

//                        entries.add(ModBlocks.PINEWOOD_SIGN);
//                        entries.add(ModBlocks.PINEWOOD_WALL_SIGN);
//                        entries.add(ModBlocks.PINEWOOD_HANGING_SIGN);
//                        entries.add(ModBlocks.PINEWOOD_HANGING_WALL_SIGN);

                        entries.add(ModItems.PINEWOOD_SIGN);
                        entries.add(ModItems.PINEWOOD_HANGING_SIGN);

                        // ##################################################
                        // APPETIZERS
                        entries.add(ModItems.SALT_ITEM);
                        // MISC FOOD
                        entries.add(ModItems.WHEEL_OF_CHEESE);
                        entries.add(ModItems.FLUID_CHEESE_BUCKET);
                    }).build());

    // ##################################################

    public static final ItemGroup TOOLS_AND_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "tools_and_blocks"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eyvb.tools_and_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.KITCHEN_CABINET_CENTER_D_CLOSED)).entries((displayContext, entries) -> {
                        // ##################################################

                        // BOTTOM
                        // cabinet closed, open left, open right and open
                        entries.add(ModBlocks.KITCHEN_CABINET_CENTER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_CABINET_CENTER_D_BOTH_OPEN);

                        // kitchen cabinet corner left
                        entries.add(ModBlocks.KITCHEN_CABINET_LCORNER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_CABINET_LCORNER_D_BOTH_OPEN);

                        // kitchen cabinet corner right
                        entries.add(ModBlocks.KITCHEN_CABINET_RCORNER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_CABINET_RCORNER_D_BOTH_OPEN);

                        // TOP
                        // cabinet closed, open left, open right and open
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_BOTH_OPEN);

                        // kitchen cabinet corner left
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_BOTH_OPEN);

                        // kitchen cabinet corner right
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_BOTH_OPEN);

                        // Kitchen ovens

                        // on
                        entries.add(ModBlocks.KITCHEN_OVEN_ON);
                        // off
                        entries.add(ModBlocks.KITCHEN_OVEN_OFF);

                        // kitchen sink
                        entries.add(ModBlocks.KITCHEN_SINK_WATER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_SINK_WATER_D_BOTH_OPEN);

                        // kitchen extractor hood
                        entries.add(ModBlocks.KITCHEN_EXTRACTOR_HOOD);
                        // cheese press
                        // default
                        entries.add(ModBlocks.CHEESE_FORM_PRESS);
                        // working
                        entries.add(ModBlocks.CHEESE_FORM_PRESS_WORKING);
                        // done
                        entries.add(ModBlocks.CHEESE_FORM_PRESS_DONE);

                        // ##################################################
                        // stone knife
                        entries.add(ModItems.STONE_KNIFE);

                        // ##################################################
                    }).build());


    // ##################################################

    public static void registerItemGroups() {

    }

}