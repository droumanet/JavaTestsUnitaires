package gps;

/**
 * Classe de point GPS (pour utilisation pédagogique)
 * <p>
 * L'objectif de cette classe GPS est la découverte du fonctionnement
 * de la programmation orientée objet (POO).
 * @author david
 * @version 1.0
 */
public class GPS {
    
    private double latitude;
    private double longitude;
    private double altitude;
    
    /**
     * Constructeur de la classe GPS
     * @param latitude
     * @param longitude
     * @param altitude
     */
    public GPS(double latitude, double longitude, double altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }
    
    
    /**
     * accesseur pour l'attribut 'altitude'
     * @return l'altitude (double)
     */
    public double getAltitude() {
        return altitude;
    }
    
    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }
    
    
    public void setLatitude(double x) {
        if (x >= -90 || x <= 90) {
            this.latitude = x;
        }
    }
    
    public double getLatitude() {
        return latitude;
    }
    
    public double getLongitude() {
        return longitude;
    }
    
    
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // code application logic here
        GPS point1 = new GPS(-5.0, 45.5, 200);
        System.out.println("Coordonnées : "+point1.latitude+", "+point1.longitude);
    }
    
}
