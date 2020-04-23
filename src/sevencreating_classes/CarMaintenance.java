package sevencreating_classes;

public class CarMaintenance {
    private String name;
    private int odometer;
    private int nextOdometerOil;
    private String airFilter;
    private String cabinFilter;
    private String oilFilter;

    public CarMaintenance(String name, int odometer, int nextOdometer, String airFilter, String cabinFilter, String oilFilter) {
        this.name = name;
        this.odometer = odometer;
        this.nextOdometerOil = nextOdometer;
        this.airFilter = airFilter;
        this.cabinFilter = cabinFilter;
        this.oilFilter = oilFilter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getNextOdometer() {
        return nextOdometerOil;
    }

    public void setNextOdometer(int nextOdometer) {
        this.nextOdometerOil = nextOdometer;
    }

    public String getAirFilter() {
        return airFilter;
    }

    public void setAirFilter(String airFilter) {
        this.airFilter = airFilter;
    }

    public String getCabinFilter() {
        return cabinFilter;
    }

    public void setCabinFilter(String cabinFilter) {
        this.cabinFilter = cabinFilter;
    }

    public String getOilFilter() {
        return oilFilter;
    }
    public void setOilFilter(String oilFilter) {
        this.oilFilter = oilFilter;
    }
    public void filterStatus() {
        String status = "\t\t\t FILTER STATUS\n" +
                "Air Filter \t: \t\t"+ this.airFilter + "\n" +
                "Cabin Filter \t: \t\t"+this.cabinFilter + "\n" +
                "Oil Filter \t: \t\t"+this.oilFilter ;
        System.out.println(status);
    }
    public void doOilChange(){
        if(!this.oilFilter.equalsIgnoreCase("new")&&this.nextOdometerOil-this.odometer<=0){
            this.oilFilter="new";
        }
        else{
            System.out.println("You do not need to change oil filter");
        }
        if(!this.cabinFilter.equalsIgnoreCase("new")&&this.nextOdometerOil-this.odometer<=0){
            this.cabinFilter="new";
        }
        else{
            System.out.println("Cabin filter is OK");
        }
        if(!this.airFilter.equalsIgnoreCase("new")&&this.nextOdometerOil-this.odometer<=0){
            this.airFilter="new";
        }
        else{
            System.out.println("Air filter is OK");
        }
        this.nextOdometerOil = this.odometer +5000;
    }





    @Override
    public String toString() {
        return "CarMaintenance{" +
                "name='" + name + '\'' +
                ", odometer=" + odometer +
                ", nextOdometer=" + nextOdometerOil +
                ", airFilter='" + airFilter + '\'' +
                ", cabinFilter='" + cabinFilter + '\'' +
                ", oilFilter='" + oilFilter + '\'' +
                '}';
    }
}
