package simulator.test;

import org.junit.Test;

import tll.load.ModelLoader;
import tll.System;

public class SimulateItemGenerator {

	@Test
	public void test() {
		System system = new ModelLoader().load("model/testModels/IAFPlantItemGenerator.xmi");
		system.simulate();
	}

}
