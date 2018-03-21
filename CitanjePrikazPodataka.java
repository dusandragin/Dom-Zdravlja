public class CitanjePrikazPodataka{
	private Data citanje(String brojKartona){
		return getPodaci(brojKartona);
	}
	
	private void PrikazPodataka(Data podaci){
		System.out.println(podaci);		
	}
	public static void main(String [] a){
		Data podaci = citanje(brojKartona);
		PrikazPodataka(podaci);
	}
}