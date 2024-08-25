public class Carfinal {
    String carName;
    final int noofWheels;
    final String countryOfOrigin;
    final int fuelTankinLitres;

    public Carfinal(String carName,int noofWheels, String countryOfOrigin, int fuelTankinLitres) {
        this.carName = carName;
        this.noofWheels = noofWheels;
        this.countryOfOrigin = countryOfOrigin;
        this.fuelTankinLitres = fuelTankinLitres;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("This is a Car with ");
        sb.append("carName: '").append(carName).append('\'');
        sb.append(", it has number of wheels: ").append(noofWheels);
        sb.append(", it's country Of Origin: '").append(countryOfOrigin).append('\'');
        sb.append(", it's fuel Tank in Litres: '").append(fuelTankinLitres).append('\'');
        return sb.toString();
    }

    public static void main(String[] args) {
        Carfinal mycar = new Carfinal("Thar", 4, "India",15);
        System.out.println(mycar);
    }
}
