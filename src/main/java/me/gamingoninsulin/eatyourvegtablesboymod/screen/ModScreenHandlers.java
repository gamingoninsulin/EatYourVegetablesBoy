package me.gamingoninsulin.eatyourvegtablesboymod.screen;

import me.gamingoninsulin.EYVBMod;
import me.gamingoninsulin.eatyourvegtablesboymod.Reference;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<CheeseFormPressScreenHandler> CHEESE_FORM_PRESS_STATION_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Reference.MOD_ID, "cheese_form_pres_station_screen_handler"),
                    new ExtendedScreenHandlerType<>(CheeseFormPressScreenHandler::new));

    public static final ScreenHandlerType<KitchenOvenScreenHandler> KITCHEN_OVEN_STATION_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Reference.MOD_ID, "kitchen_oven_station_screen_handler"),
                    new ExtendedScreenHandlerType<>(KitchenOvenScreenHandler::new));


    public static void registerScreenHandler() {
        EYVBMod.LOGGER.info("Registering Screen Handlers for " + Reference.REGISTER_MOD_NAME);
    }
}
