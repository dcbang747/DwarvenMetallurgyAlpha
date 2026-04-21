# DwarvenMetallurgy

General Plan:
All the weapons and armors and ore generation in this progression

Copper
Bronze (Copper + Tin(New Ore!))
Iron
Steel
Shanor (Bronze + Silver (New Ore!))
Kidzul Steel (Steel + Gold)
Gabil Steel (Steel + diamond)
Durinul (Steel + netherite) Requires base game upgrade template which you will rename into During upgrade template and a 
Mithril

And to create a new "under armor slot"
With this progression Cloth → Fine Cloth → Hide→ Gambeson→ iron chain→steel chain→shanor chain → Kidzul /Gabil Chain → Durinil chain → Mithril Chain

So for all of the alloys you would make a "mix" item first and then smelt it to get the respective ingot. 

Each level can only be mined with the level before it. 

Wood pickaxe must be set to be able to mine stone but not drop anything. You can only use it to mine copper ore. You need a copper pickaxe for mining stone and iron. 

Copper must then be smelted in a campfire which you will add a new crafting recipe for requiring 3 stick bundles on the bottom row. a stick bundles is a new item you will make which is 9 sticks in a crafting bench that can be crafted back into sticks in the middle row is 3 leaf liter which already exists in the game and on the top middle is needed a flint. 

To light the camp fire make a fire starter which requires two sticks and a string. It has a durability of one and can light a fire basically a flint and steel with one durability. 

The copper pick can mine tin and stone and coal. You can use one tin and three copper to make 2 bronze mix. 

With the stone you mined this will let you create the stone furnace. However the stone furnace must be modified so that it can only smelt bronze, and iron and silver and gold however it will not longer be used to smelt netherite scrap. It CANNOT smelt any of the alloy mixes EXCEPT bronze mix. But it can still smelt food stone and everything else. You will have to modify the recipes that use furnaces. 

Now with the bronze pickaxe you can mine iron

You can use iron to create iron tools and armor like in the base game. However these tools must be modified they must not be able to mine diamonds or netherite but can mine everything else. Although mining gold and silver ores will only yield another new item raw gold and silver bits. You need 9 of each to make the raw ore which you can use the blast furnace to smelt

Speaking of you can make a blast furnace with the iron. 

The blast furnace should be able to smelt everything up to durinul however it needs coke to smelt. Coke will be just either coal/charcoal smelted in a normal furnace or a blast furnace. Coke can be used as a fuel source anywhere, but it smelts the same amount as coal. 

After you get steel, steel is basically vanilla iron base game but with 50% better durability. It however still cannot mine diamonds or anything else normal base game iron can not mine. 

Next after steel we have two armor and tool sets at the same level. Shanor and kizdul steel. Both are mixes. Shanor mix is silver ore/ingot + steel ingot/mix and kizdul mix is gold ore/ingot + stee ingot/mix. These are our base game vanilla diamond sets. Kizdul has the same durability as diamond and but 1 less armor value (it is one half weaker on the chest plate and helmet) but the same everything while shanor is 20% less durability but a massive buff to the enchantability. Their tools can mine everything diamonds tools can mine diamonds obsidian etc. except for ANCIENT DEBRIS. 

The next level is Gabil steel basically vanilla diamond plus 20% durability. Full armor value full tools. Requires blast furnace to smelt the Gabil mix which is 1 steel ingot/mix and 1 diamond can mine everything that diamond can mine including ancient debris. 

With ancient debris cannot be smelted you must use it to create the third teir of furnace the ancient furnace. Which is the same recipie for the blast furnace except with 5 ancient debris replacing the iron, one blast furnace in the center replacing the stone furnace and at the bottom corners two Gabil plates (which is 3 Gabil ingots in a row in a crafting table) and in-between the plates is the upgrade template. 

With the ancient furnace you can smelt the duranil mix (which is 4 netherite scrap and four steel ingots) into duranil ingots which can then be made into our equivalent of vanilla netherite armor lava and fire proof   and has the same durability and speed of tools. The ancient furnace like the blast furnace smelts things 2 times faster and requires coke

With the ancient furnace you can then make the duranil furnace in the same way as the blast furnace the ultimate forge previous furnaces like the blast furnace and the ancient furnace smelted things 2 times faster. With the duranil furnace you don't need coke you can use anything. They all burn as hot. However you cannot smelt iron into steel here you need to use the steel mix 1 iron ingot/iron ore + 1 coke. This is the only place you can smelt steel mix. But also this is the only forge that can smelt mithril. 

Mithril Armor is the best armor in the game massive enchantability twice the toughness and twice the durability of netherite and twice the enchantability of gold it gives you permanent resistance 1 and is the goat. It is full armor naturally and it's tools are faster than netherite by 25%. Allowing with efficiency 5 for the insta mining of deep slate

Mithril can only be found in the end specifically the outer end islands
It is a simple raw mithril ore there are no alloys with mithril
Mithril can only be mined by Durinul 
also disable the crafting recipies for netherite armor
and disable the crafting recipies for diamond armor
also the ]Durinul furnace will be uncraftable, rather I will place it manually
for the recipe book just ignore it, after some serious consultation modding the recipe book is, in fact, a fools errand.

## GeckoLib armor model editing note

For the bronze armor pieces, the `.bbmodel` files in the repository root are Blockbench source files only.  
Minecraft/Gradle does **not** load `.bbmodel` at runtime; the game only reads exported GeckoLib `.geo.json` files.
If you only edit `dwarvencraft/src/client/resources/assets/dwarvencraft/geckolib/models/*.geo.json`, those edits can be lost the next time models are re-exported from Blockbench.

To keep changes permanent:
1. Edit the relevant `*.bbmodel` file (`helmet.bbmodel`, `chestplate.bbmodel`, `leggings.bbmodel`, `boots.bbmodel`).
2. Re-export the GeckoLib model JSON.
3. Commit both source (`.bbmodel`) and exported (`.geo.json`) changes together.
