package ann_ga.utils;

public interface Const {
	public enum Activation {
	    UMBRAL,
	    SIGMOID,
	    TANH
	}
	
	public enum EvalType {
	    FITNESS,
	    EARLY_STOP
	}
	
	public enum Purpose {
	    XOR,
	    PACMAN
	}
	
	//DEBUG
	public static final boolean		DEBUG 			= true;
	
	//NEURON
	public static final int 		INPUTS 			= 8;
	public static final int 		HIDDEN 			= 2*INPUTS + 1;
	public static final int 		OUPUTS 			= 4;
	
	//TRAINING
	public static final Activation	AFUNC 			= Activation.TANH;
	public static final int			TRAININGS		= 1000;
	public static final double		LEARN_FACTOR 	= 0.1;
	
	//EVALUATION
	public static final EvalType	ETYPE 			= EvalType.EARLY_STOP;
	public static final double		FITNESS 		= 0.01;
	public static final int 		RANGE 			= 100;
	
	//DATASET
	public static final int 		MIN 			= 0;
	public static final int 		SETS 			= 1;	//1 set is online training
	public static final boolean 	BINARY 			= false;
	
	//PURPOSE
	public static final Purpose		PURPOSE 		= Purpose.PACMAN;
}
