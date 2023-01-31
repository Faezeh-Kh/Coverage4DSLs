package simulator.test;

import org.junit.Test;

import tll.load.ModelLoader;
import tll.System;

public class SimulateMultipleAreas {

	@Test
	public void test() {
		System system = new ModelLoader().load("model/testModels/IAFPlantMultipleAreas.xmi");
		system.simulate();
	}

}
