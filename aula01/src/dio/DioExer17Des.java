package dio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DioExer17Des {
	public static void main(String[] args) {
	List<Double> temperature = new ArrayList<>();
	temperature.add(32.6);
	temperature.add(28.4);
	temperature.add(27.8);
	temperature.add(29.9);
	temperature.add(31.5);
	temperature.add(33.0);
	
	System.out.println(temperature.toString());
	Iterator<Double> iterator = temperature.iterator();
	double tempeSum = 0;
	while(iterator.hasNext()){
		Double next = iterator.next();
		tempeSum += next;
	}
	
	double semiannualAverage = tempeSum/6;
	System.out.println("A média semestral é: " + semiannualAverage);
	int index = 0;
	Iterator<Double> monTemp = temperature.iterator();
	while(monTemp.hasNext()){
		Double temp = monTemp.next();
		String month = "";
		if (temp > semiannualAverage) {
			switch(index) {
				case 0:
					month = "janeiro";
					break;
				case 1:
					month = "fevereiro";
				case 2:
					month = "março";
				case 3:
					month = "abril";
				case 4:
					month = "maio";
				case 5:
					month = "junho";
			}
			System.out.println("A temperatura do mês de " + month + " está acima da média, pois foi: " + temp);
		}
		index++;
	}
	
	}

}
