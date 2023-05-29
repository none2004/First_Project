
public class ConvertisseurDegre {
/** 
 * cette méthode permet de créer un objet avec sa température et son unité
 */
	float Temperature;
	char fOUc;
	ConvertisseurDegre(float Temperature,char fOUc) {
		this.Temperature = Temperature;
		this.fOUc = fOUc;
	}
	public String ConvertisseurTemperature() {
		String ConvertTemp = null;
		switch (fOUc) {
		case 'c':
			ConvertTemp = String.valueOf((Temperature*9/5)+32)+'f';
			break;
		case 'f':
			ConvertTemp = String.valueOf((Temperature-32)*5/9)+'c';
			break;
		}
		return ConvertTemp;
	}
}
