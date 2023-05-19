package net.fabricmc.example;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CustomItems {

    public static final Item TESTE_BAGULHO = Registry.register(Registries.ITEM, new Identifier("modid", "bagulho_teste"),
            new Item(new FabricItemSettings()));

    public static void Register() {
        System.out.println("Funcionou o bagulho doido");
    }
}
