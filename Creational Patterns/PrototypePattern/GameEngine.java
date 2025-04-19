package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

import PrototypePattern.NPCTypes.Guards;
import PrototypePattern.NPCTypes.ShopKeeper;
import PrototypePattern.NPCTypes.Villager;

public class GameEngine
{

	private List<NonPlayerCharacter> npc = null;

	public GameEngine() {

		npc = new ArrayList<>();

		npc.add(new Guards("weapons","armor","items","visualmodel","sound","animation","north"));
		npc.add(new ShopKeeper("weapons","armor","items","visualmodel","sound","animation","Groceries"));
		npc.add(new Villager("weapons","armor","items","visualmodel","sound","animation","white"));

	}

	public static void main(String[] args)
	{

		GameEngine engine = new GameEngine();
		// duplicating the npc

		List<NonPlayerCharacter> clonedNPC = new ArrayList<>();

		for(NonPlayerCharacter np : engine.npc) {
			clonedNPC.add(np.clone());
		}


	}
}
