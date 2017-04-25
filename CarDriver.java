import javax.swing.JOptionPane;

public class CarDriver {

	public static void main(String[] args) {
		Car mycar = new Car();
		JOptionPane.showMessageDialog(null, "My car Detail: " + mycar.toStirng());
		Car hiscar = new Car("Honda", "Black", 400, 3.5);
		JOptionPane.showMessageDialog(null, "\nHis car Detail: " + hiscar.toStirng());
		Car hercar = new Car("Pink", "Volks", 300, 2.5);
		JOptionPane.showMessageDialog(null, "\nHer car Detail: " + hercar.toStirng());

		mycar.setmake("Ferrari");
		mycar.setcolor("Blue");
		mycar.sethorsePower(650);
		mycar.setengine(6.5);

		hiscar.setmake("Ferrari");
		hiscar.setcolor("Blue");
		hiscar.sethorsePower(650);
		hiscar.setengine(6.5);

		hercar.setmake("Ferrari");
		hercar.setcolor("Blue");
		hercar.sethorsePower(650);
		hercar.setengine(6.5);

		JOptionPane.showMessageDialog(null, "\nMy car detail after setting value: " + mycar.toStirng());
		JOptionPane.showMessageDialog(null, "\nMy his detail after setting value: " + hiscar.toStirng());
		JOptionPane.showMessageDialog(null, "\nMy her detail after setting value: " + hercar.toStirng());
		JOptionPane.showMessageDialog(null, "Car count: "+Car.getCount());

		JOptionPane.showMessageDialog(null,
				"Is my car is same as his car? " + mycar.getcompare(hiscar) + "\n\nIs my car is same as her car? "
						+ mycar.getcompare(hercar) + "\n\nIs her car is same as his car? " + hercar.getcompare(hiscar));
	}

}
