package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class ItemELaughterSword extends SwordItem {
    private static final IItemTier tireELaughter = new TireELaughter();
    public ItemELaughterSword(){
        super(tireELaughter, 3, -1.6F, new Item.Properties().group(ModGroup.elementsofharmonyGroup));
    }
}
