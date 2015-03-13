package amerifrance.emt.gui;

import amerifrance.emt.ModInformation;
import amerifrance.emt.modules.base.items.BaseItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabEMT extends CreativeTabs {

    public CreativeTabEMT(String tabLabel) {
        super(tabLabel);
        setBackgroundImageName(ModInformation.ID + ".png");
    }

    public boolean hasSearchBar() {
        return true;
    }

    public int getSearchbarWidth() {
        return 60;
    }

    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(BaseItemRegistry.thorHammerBroken, 1, 0);
    }

    @Override
    public Item getTabIconItem() {
        return new Item();
    }
}
