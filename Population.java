class opulation
{
	public static void main(String [] args)
	{
		int sec = (365*24*60*60)*5;
		int birth_in_5yearly = (365*24*60*60)*5/7;
		int death = sec/13;
		int immagrant = (365*24*60*60)*5/45;
		int total_population = birth_in_5yearly - death +immagrant;
		
	}
}