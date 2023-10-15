package Service;

public class Compte {
private int code;
private double solde;
private String date;
public Compte(int code, double solde, String date) {
	super();
	this.code = code;
	this.solde = solde;
	this.date = date;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}

}
