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
		byte[] genotype = new byte[4];
		for (int i = 0; i < 4; i++) {
			genotype[i] = (byte) 1;
		}
		
		//i3 h2 o2
		/*
		genotype.add((byte) 1);
		genotype.add((byte) 0);
		genotype.add((byte) 1);
		genotype.add((byte) 0);
		genotype.add((byte) 0);
		genotype.add((byte) 1);
		
		genotype.add((byte) 1);
		genotype.add((byte) 0);
		genotype.add((byte) 0);
		genotype.add((byte) 1);
		genotype.add((byte) 0);
		genotype.add((byte) 0);
		
		genotype.add((byte) 0);
		genotype.add((byte) 0);
		genotype.add((byte) 1);
		genotype.add((byte) 0);
		genotype.add((byte) 0);
		genotype.add((byte) 1);
		*/
		/*
		genotype.add((byte) 1);
		genotype.add((byte) 0);
		genotype.add((byte) 1);
		
		genotype.add((byte) 1);
		genotype.add((byte) 1);
		genotype.add((byte) 0);
		
		genotype.add((byte) 0);
		genotype.add((byte) 1);
		genotype.add((byte) 1);
		*/
		return genotype;
	}
}
