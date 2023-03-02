package shipyardV4.aspects.utils;

public class ShipyardOperationalSemanticsUtils {
	
	public static final String DEFAULT_INPUT_SEQUENCE = "dev.delivery";
	public static final String FINISHED = "finished";
	public static final String RESULT_PASS ="pass";
	public static final String RESULT_FAILED ="failed";
	public static final String RESULT_WARNING ="warning";
	
	public static boolean  isFinishedEvent(String arg) {
		boolean isFinishedEvent=false;
		if(!arg.isBlank()) {
			String[] splittedArg = arg.split("\\.");
			String last=splittedArg[splittedArg.length-1];
			
			if (RESULT_FAILED.equals(last) || 	RESULT_WARNING.equals(last) || RESULT_PASS.equals(last)){
				isFinishedEvent=true;
			}
		}
		return isFinishedEvent;
	}
	
}
