package peaksoft;

public class Main {

    public static void main(String[] args) {
    Phone phone = new Phone();
    phone.setModel("Samsung");
    phone.setPrice(23000);
        System.out.println(phone.getModel() +" " +  phone.getPrice()+ "som");

    Baluk baluk = new Baluk("Molchun", 1);
        System.out.println(baluk.getName()+ " " +baluk.getAge()+"godik");
    Mushuk mushuk = new Mushuk("Krusolov", 2);
        System.out.println(mushuk.getName()+ " " + mushuk.getAge()+"godika");
    It it = new It("Tormoz", 3);
        System.out.println(it.getName()+ " "+ it.getAge()+ "godika");
    }
}
