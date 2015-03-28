package executor;

import ga.Genotype;
import utils.Const;
import ann.Ann;
import ann.Trainer;

/**
 * Main class. The executor.
 * @author Daniel Castaño Estrella
 *
 */
public class Main
{
	public static void main (String args[])
	{
		byte[] genotype_xor = SetGenotype();
		byte[] genotype = new Genotype(Const.INPUTS,  Const.HIDDEN, Const.OUPUTS).GetGenotype();
		Ann ann = new Ann(genotype, Const.INPUTS, Const.OUPUTS);	//genotype, inputs and ouputs
		Trainer trainer = new Trainer(ann, Const.LEARN_FACTOR);	//genotype, inputs and ouputs
		trainer.TrainingOffline(Const.TRAININGS);
	}
	
	
	
	private static byte[] SetGenotype()
	{
		byte[] genotype = new byte[18];
		
		for (int i = 0; i < 4; i++) {
			genotype[i] = (byte) 1;
		}
		
		//i3 h2 o2
		
		genotype[0] = (byte) 1;
		genotype[1] = (byte) 0;
		genotype[2] = (byte) 1;
		genotype[3] = (byte) 0;
		genotype[4] = (byte) 0;
		genotype[5] = (byte) 1;
		
		genotype[6] = (byte) 1;
		genotype[7] = (byte) 0;
		genotype[8] = (byte) 0;
		genotype[9] = (byte) 1;
		genotype[10] = (byte) 0;
		genotype[11] = (byte) 0;
		
		genotype[12] = (byte) 0;
		genotype[13] = (byte) 0;
		genotype[14] = (byte) 1;
		genotype[15] = (byte) 0;
		genotype[16] = (byte) 0;
		genotype[17] = (byte) 1;
		
		/*
		genotype[0] = (byte) 1;
		genotype[1] = (byte) 0;
		genotype[2] = (byte) 1;
		
		genotype[3] = (byte) 1;
		genotype[4] = (byte) 1;
		genotype[5] = (byte) 0;
		
		genotype[6] = (byte) 0;
		genotype[7] = (byte) 1;
		genotype[8] = (byte) 1;
		*/
		return genotype;
	}
}
